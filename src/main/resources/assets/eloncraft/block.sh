#!/usr/bin/env bash

for arg in "$@"
do
    echo "{
      \"variants\": {
        \"\": {
          \"model\": \"eloncraft:block/${1}\"
        }
      }
    }" >> blockstates/${1}.json

    echo "{
      \"parent\": \"block/cube_all\",
      \"textures\": {
        \"all\": \"eloncraft:block/${1}\"
      }
    }" >> models/block/${1}.json

    echo "{
      \"parent\": \"eloncraft:block/${1}\"
    }" >> models/item/${1}.json
done