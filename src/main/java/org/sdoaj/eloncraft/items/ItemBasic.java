package org.sdoaj.eloncraft.items;

import net.minecraft.item.Item;
import org.sdoaj.eloncraft.Eloncraft;

public class ItemBasic extends Item {
    public ItemBasic(Properties properties, String name) {
        super(properties);
        this.setRegistryName(Eloncraft.MODID, name);
        ModItems.addItem(this);
    }

    public ItemBasic(String name) {
        this(new Item.Properties(), name);
    }
}
