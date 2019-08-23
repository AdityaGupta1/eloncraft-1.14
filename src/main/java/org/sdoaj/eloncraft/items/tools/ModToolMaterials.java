package org.sdoaj.eloncraft.items.tools;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import org.sdoaj.eloncraft.items.ModItems;

public enum ModToolMaterials implements IItemTier {
    TITANIUM(4, 2048, 15.0F, 4.0F, 16, Ingredient.fromItems(ModItems.TITANIUM_INGOT));

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Ingredient repairMaterial;

    ModToolMaterials(int harvestLevel, int durability, float efficiency, float damage, int enchantability, Ingredient repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = durability - 1;
        this.efficiency = efficiency;
        this.attackDamage = damage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    public int getMaxUses() {
        return this.maxUses;
    }

    public float getEfficiency() {
        return this.efficiency;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairMaterial() {
        return this.repairMaterial;
    }
}