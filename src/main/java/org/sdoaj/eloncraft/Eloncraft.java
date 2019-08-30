package org.sdoaj.eloncraft;

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
}
