package org.sdoaj.eloncraft.items.tools;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import org.sdoaj.eloncraft.items.ModItems;

public class ItemArmor extends ArmorItem {
    public ItemArmor(String name, IArmorMaterial material, EquipmentSlotType slot, Properties properties) {
        super(material, slot, properties);
        this.setRegistryName(name);
        ModItems.addItem(this);
    }

    public ItemArmor(String name, IArmorMaterial material, EquipmentSlotType slot) {
        this(name, material, slot, ModItems.defaultProperties(1));
    }
}
