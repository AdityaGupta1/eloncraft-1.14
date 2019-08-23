package org.sdoaj.eloncraft.items.tools;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import org.sdoaj.eloncraft.items.ItemGroupEloncraft;
import org.sdoaj.eloncraft.items.ModItems;

public class ItemArmor extends ArmorItem {
    public ItemArmor(String name, IArmorMaterial material, EquipmentSlotType slot, Properties properties) {
        super(material, slot, properties);
        this.setRegistryName(name);
        ModItems.addItem(this);
    }

    public ItemArmor(String name, IArmorMaterial material, EquipmentSlotType slot) {
        this(name, material, slot, new Item.Properties().group(ItemGroupEloncraft.INSTANCE).maxStackSize(1));
    }
}
