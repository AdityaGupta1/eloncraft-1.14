package org.sdoaj.eloncraft.items;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.sdoaj.eloncraft.Eloncraft;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = Eloncraft.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {
    private static final List<Item> items = new ArrayList<>();

    public static Item TITANIUM_INGOT;

    private static void init() {
        TITANIUM_INGOT = new ItemBasic("titanium_ingot");
    }

    static void addItem(Item item) {
        items.add(item);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        init();
        items.forEach(event.getRegistry()::register);
    }
}
