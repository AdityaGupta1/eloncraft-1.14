package org.sdoaj.eloncraft.items.tools;

import net.minecraft.item.IItemTier;
import net.minecraft.item.PickaxeItem;
import org.sdoaj.eloncraft.items.ModItems;

public class ItemPickaxe extends PickaxeItem {
    public ItemPickaxe(String name, IItemTier tier, Properties properties) {
        super(tier, 1, -2.8F, properties);
        this.setRegistryName(name);
        ModItems.addItem(this);
    }

    public ItemPickaxe(String name, IItemTier tier) {
        this(name, tier, ModItems.defaultProperties(1));
    }
}
