package org.sdoaj.eloncraft.items.tools;

import com.google.common.collect.Multimap;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import org.sdoaj.eloncraft.items.ItemGroupEloncraft;
import org.sdoaj.eloncraft.items.ModItems;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

public class ItemSword extends SwordItem {
    private final float damage;
    private final float attackSpeed;

    public ItemSword(String name, IItemTier tier, float damage, float attackSpeed, Properties properties) {
        super(tier, 0, 0, properties);
        this.damage = damage - 1.0F;
        this.attackSpeed = attackSpeed - 4.0F;
        this.setRegistryName(name);
        ModItems.addItem(this);
    }

    public ItemSword(String name, IItemTier tier, float damage, float attackSpeed) {
        this(name, tier, damage, attackSpeed, new Item.Properties().group(ItemGroupEloncraft.INSTANCE).maxStackSize(1));
    }

    @Override
    public float getAttackDamage() {
        return damage;
    }

    @Override
    public Multimap<String, AttributeModifier> getAttributeModifiers(EquipmentSlotType slot, ItemStack stack) {
        final Multimap<String, AttributeModifier> modifiers = super.getAttributeModifiers(slot, stack);

        if (slot == EquipmentSlotType.MAINHAND) {
            replaceModifier(modifiers, SharedMonsterAttributes.ATTACK_SPEED, ATTACK_SPEED_MODIFIER, attackSpeed);
            replaceModifier(modifiers, SharedMonsterAttributes.ATTACK_DAMAGE, ATTACK_DAMAGE_MODIFIER, damage);
        }

        return modifiers;
    }

    private void replaceModifier(Multimap<String, AttributeModifier> modifierMultimap, IAttribute attribute, UUID id, double newValue) {
        final Collection<AttributeModifier> modifiers = modifierMultimap.get(attribute.getName());

        final Optional<AttributeModifier> modifierOptional = modifiers.stream().filter(attributeModifier -> attributeModifier.getID().equals(id)).findFirst();

        modifierOptional.ifPresent(modifier -> {
            modifiers.remove(modifier);
            modifiers.add(new AttributeModifier(modifier.getID(), modifier.getName(), newValue, modifier.getOperation()));
        });
    }
}
