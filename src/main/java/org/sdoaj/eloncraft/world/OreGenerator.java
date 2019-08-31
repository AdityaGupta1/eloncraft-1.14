package org.sdoaj.eloncraft.world;

import net.minecraft.block.Block;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import org.sdoaj.eloncraft.blocks.ModBlocks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OreGenerator {
    public static final Feature<ModOreFeatureConfig> ORE_FEATURE = new ModOreFeature(ModOreFeatureConfig::deserialize);

    static {
        ORE_FEATURE.setRegistryName("mod_ore");
    }

    private static List<Biome> netherBiomes = Arrays.asList(Biomes.NETHER);
    private static List<Biome> endBiomes = Arrays.asList(Biomes.END_BARRENS, Biomes.END_HIGHLANDS, Biomes.END_MIDLANDS, Biomes.THE_END, Biomes.SMALL_END_ISLANDS);
    private static List<Biome> regularBiomes = ForgeRegistries.BIOMES.getValues().stream().filter(
            biome -> !netherBiomes.contains(biome) && !endBiomes.contains(biome)).collect(Collectors.toList());

    public static void init() {
        generate(defaultOreConfig(ModBlocks.COMPONENTS, 6), defaultCountConfig(15, 8, 63));

        generate(defaultOreConfig(ModBlocks.ALUMINUM_ORE, 10), defaultCountConfig(60, 63));
        generate(defaultOreConfig(ModBlocks.TITANIUM_ORE, 8), defaultCountConfig(40, 47));
        generate(defaultOreConfig(ModBlocks.LITHIUM_ORE, 5), defaultCountConfig(20, 47));
        generate(defaultOreConfig(ModBlocks.NICKEL_ORE, 8), defaultCountConfig(35, 47));
        generate(defaultOreConfig(ModBlocks.CHROMIUM_ORE, 5), defaultCountConfig(15, 31));
        generate(defaultOreConfig(ModBlocks.COPPER_ORE, 10), defaultCountConfig(50, 63));
        generate(defaultOreConfig(ModBlocks.NIOBIUM_ORE, 8), defaultCountConfig(30, 31));
        generate(defaultOreConfig(ModBlocks.HAFNIUM_ORE, 4), defaultCountConfig(15, 31));
        generate(defaultOreConfig(ModBlocks.MAGNESIUM_ORE, 6), defaultCountConfig(20, 47));
        generate(defaultOreConfig(ModBlocks.ZINC_ORE, 5), defaultCountConfig(20, 47));
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

    private static ModOreFeatureConfig defaultOreConfig(Block ore, int size) {
        return new ModOreFeatureConfig(ModOreFeatureConfig.BlockMatcher.STONE, ore.getDefaultState(), size);
    }

    private static CountRangeConfig defaultCountConfig(int count, int minHeight, int maxHeight) {
        return new CountRangeConfig(count, minHeight, minHeight, maxHeight);
    }

    private static CountRangeConfig defaultCountConfig(int count, int maxHeight) {
        return defaultCountConfig(count, 0, maxHeight);
    }
}
