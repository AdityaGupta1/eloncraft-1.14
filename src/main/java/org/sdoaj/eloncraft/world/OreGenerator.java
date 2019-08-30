package org.sdoaj.eloncraft.world;

import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OreGenerator {
    private static <C extends IFeatureConfig, F extends Feature<C>> F register(String key, F value) {
        return (F) (Registry.<Feature<?>>register(Registry.FEATURE, key, value));
    }

    // public static final Feature<ModOreFeatureConfig> ORE_FEATURE = register("mod_ore", new ModOreFeature(ModOreFeatureConfig::deserialize));
    public static final Feature<ModOreFeatureConfig> ORE_FEATURE = new ModOreFeature(ModOreFeatureConfig::deserialize);

    static {
        ORE_FEATURE.setRegistryName("mod_ore");
    }

    private static List<Biome> netherBiomes = Arrays.asList(Biomes.NETHER);
    private static List<Biome> endBiomes = Arrays.asList(Biomes.END_BARRENS, Biomes.END_HIGHLANDS, Biomes.END_MIDLANDS, Biomes.THE_END, Biomes.SMALL_END_ISLANDS);
    private static List<Biome> regularBiomes = ForgeRegistries.BIOMES.getValues().stream().filter(
            biome -> !netherBiomes.contains(biome) && !endBiomes.contains(biome)).collect(Collectors.toList());

    public static void init() {
        generate(new ModOreFeatureConfig(ModOreFeatureConfig.BlockMatcher.STONE, Blocks.DIAMOND_BLOCK.getDefaultState(), 8),
                new CountRangeConfig(100, 0, 0, 128));
    }

    private static void generate(List<Biome> biomes, ModOreFeatureConfig oreConfig, CountRangeConfig rangeConfig) {
        biomes.forEach(biome -> biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(ORE_FEATURE, oreConfig, Placement.COUNT_RANGE, rangeConfig)));
    }

    private static void generate(ModOreFeatureConfig oreConfig, CountRangeConfig rangeConfig) {
        generate(regularBiomes, oreConfig, rangeConfig);
    }

    @SubscribeEvent
    public static void registerFeatures(final RegistryEvent.Register<Feature<?>> featureRegistryEvent) {
        featureRegistryEvent.getRegistry().register(OreGenerator.ORE_FEATURE);
    }
}
