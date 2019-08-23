package org.sdoaj.eloncraft.items.tools;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import org.sdoaj.eloncraft.items.ModItems;

public enum ModArmorMaterials implements IArmorMaterial {
    TITANIUM("titanium", 48, new int[]{4, 8, 10, 4}, 16, SoundEvents.ITEM_ARMOR_EQUIP_IRON, Ingredient.fromItems(ModItems.TITANIUM_INGOT), 2.5F);

    private final String name;
    private static final int[] baseDurability = new int[]{13, 15, 16, 11};
    private final int durabilityFactor;
    private final int[] damageReduction;
    private final int enchantability;
    private final SoundEvent sound;
    private final Ingredient repairMaterial;
    private final float toughness;

    ModArmorMaterials(String name, int durabilityFactor, int[] damageReduction, int enchantability, SoundEvent sound, Ingredient repairMaterial, float toughness) {
        this.name = name;
        this.durabilityFactor = durabilityFactor;
        this.damageReduction = damageReduction;
        this.enchantability = enchantability;
        this.sound = sound;
        this.repairMaterial = repairMaterial;
        this.toughness = toughness;
    }

    @Override
    public int getDurability(EquipmentSlotType slot) {
        return baseDurability[3 - slot.getIndex()] * durabilityFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slot) {
        return damageReduction[3 - slot.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return sound;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial;
    }

    @Override
    public String getName() {
        return "eloncraft:" + name;
    }

    @Override
    public float getToughness() {
        return toughness;
    }
}
