package org.sdoaj.eloncraft;

import net.minecraft.world.gen.feature.Feature;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.sdoaj.eloncraft.world.OreGenerator;

@Mod(Eloncraft.MODID)
public class Eloncraft {
    public static final String MODID = "eloncraft";

    public Eloncraft() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        OreGenerator.init();
    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void registerFeatures(final RegistryEvent.Register<Feature<?>> featureRegistryEvent) {
            featureRegistryEvent.getRegistry().register(OreGenerator.ORE_FEATURE);
        }
    }
}
