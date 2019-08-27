#!/usr/bin/env bash

for arg in "$@"
do
  echo "{
  \"variants\": {
    \"\": {
      \"model\": \"eloncraft:block/${arg}\"
    }
  }
}" > assets/eloncraft/blockstates/${arg}.json

  echo "{
  \"parent\": \"block/cube_all\",
    \"textures\": {
      \"all\": \"eloncraft:block/${arg}\"
  }
}" > assets/eloncraft/models/block/${arg}.json

  echo "{
  \"parent\": \"eloncraft:block/${arg}\"
}" > assets/eloncraft/models/item/${arg}.json

  echo "{
  \"type\": \"minecraft:block\",
  \"pools\": [
    {
      \"rolls\": 1,
      \"entries\": [
        {
          \"type\": \"minecraft:item\",
          \"name\": \"eloncraft:${arg}\"
        }
      ],
      \"conditions\": [
        {
          \"condition\": \"minecraft:survives_explosion\"
        }
      ]
    }
  ]
}" > data/eloncraft/loot_tables/blocks/${arg}.json
done