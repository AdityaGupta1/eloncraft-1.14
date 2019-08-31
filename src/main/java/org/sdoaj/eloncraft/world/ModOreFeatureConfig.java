package org.sdoaj.eloncraft.world;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.feature.IFeatureConfig;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ModOreFeatureConfig implements IFeatureConfig {
    final BlockMatcher matcher;
    final BlockState ore;
    final int size;

    public ModOreFeatureConfig(BlockMatcher matcher, BlockState ore, int size) {
        this.matcher = matcher;
        this.ore = ore;
        this.size = size;
    }

    @Override
    public <T> Dynamic<T> serialize(DynamicOps<T> ops) {
        return new Dynamic<>(ops, ops.createMap(ImmutableMap.of(ops.createInt(this.size), ops.createString("matcher"),
                ops.createString(this.matcher.name), ops.createString("ore"),
                BlockState.serialize(ops, this.ore).getValue(), ops.createString("size"))));
    }

    public static ModOreFeatureConfig deserialize(Dynamic<?> dynamic) {
        BlockMatcher matcher = BlockMatcher.fromName(dynamic.get("matcher").asString(""));
        BlockState ore = dynamic.get("ore").map(BlockState::deserialize).orElse(Blocks.AIR.getDefaultState());
        int size = dynamic.get("size").asInt(0);
        return new ModOreFeatureConfig(matcher, ore, size);
    }

    public enum BlockMatcher {
        STONE("stone", Blocks.STONE);

        private final String name;
        private final Predicate<BlockState> matcher;

        private static final Map<String, BlockMatcher> matchers = Arrays.stream(values()).collect(Collectors
                .toMap(BlockMatcher::name, matcher -> matcher));

        BlockMatcher(String name, Predicate<BlockState> matcher) {
            this.name = name;
            this.matcher = matcher;
        }

        BlockMatcher(String name, BlockState... states) {
            this(name, state -> Arrays.asList(states).contains(state));
        }

        BlockMatcher(String name, Block... blocks) {
            this(name, Arrays.stream(blocks).map(Block::getDefaultState).toArray(BlockState[]::new));
        }

        public static BlockMatcher fromName(String name) {
            return matchers.get(name);
        }

        public boolean matches(BlockState state) {
            return matcher.test(state);
        }
    }
}
