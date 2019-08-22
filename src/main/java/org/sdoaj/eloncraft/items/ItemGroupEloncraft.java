package org.sdoaj.eloncraft.items;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroupEloncraft extends ItemGroup {
    public static final ItemGroupEloncraft INSTANCE = new ItemGroupEloncraft();

    private ItemGroupEloncraft() {
        super("eloncraft");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModItems.FALCON9);
    }
}
