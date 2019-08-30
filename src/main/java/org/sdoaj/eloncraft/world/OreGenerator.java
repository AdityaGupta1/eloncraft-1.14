package org.sdoaj.eloncraft.world;

import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.BiomeManager;

import java.util.ArrayList;
import java.util.List;

public class OreGenerator {
    private static <C extends IFeatureConfig, F extends Feature<C>> F register(String key, F value) {
        return (F)(Registry.<Feature<?>>register(Registry.FEATURE, key, value));
    }

    public static final Feature<ModOreFeatureConfig> ORE_FEATURE = register("mod_ore", new ModOreFeature(ModOreFeatureConfig::deserialize));

    private static List<BiomeManager.BiomeEntry> regularBiomes = new ArrayList<>();

    static {
        for (BiomeManager.BiomeType type : BiomeManager.BiomeType.values()) {
            regularBiomes.addAll(BiomeManager.getBiomes(type));
        }
    }

    public static void init() {
        regularBiomes.forEach(biomeEntry -> {
            biomeEntry.biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(ORE_FEATURE,
                    new ModOreFeatureConfig(ModOreFeatureConfig.BlockMatcher.STONE, Blocks.DIAMOND_BLOCK.getDefaultState(), 8),
                    Placement.COUNT_RANGE, new CountRangeConfig(20, 0, 0, 128)));
        });
    }

    private static void generate(List<BiomeManager.BiomeEntry> biomeEntries, ModOreFeatureConfig oreConfig, CountRangeConfig rangeConfig) {
        biomeEntries.forEach(entry -> {
            entry.biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(ORE_FEATURE, oreConfig, Placement.COUNT_RANGE, rangeConfig));
        });
    }
}
