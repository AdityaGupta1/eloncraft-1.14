package org.sdoaj.eloncraft.items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import org.sdoaj.eloncraft.Eloncraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ItemBasic extends Item {
    public ItemBasic(Properties properties, String name) {
        super(properties);
        this.setRegistryName(Eloncraft.MODID, name);
        ModItems.addItem(this);
    }

    public ItemBasic(String name) {
        this(new Item.Properties(), name);
    }

    private final List<ITextComponent> lore = new ArrayList<>();

    void addLore(String lore) {
        this.lore.add(new StringTextComponent(lore));
    }

    @Override
    public void addInformation(ItemStack stack, World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
        tooltip.addAll(lore);
    }

    private boolean glows = false;

    void setGlows() {
        glows = true;
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return glows;
    }

    private int burnTime = -1;

    void setBurnTime(int burnTime) {
        this.burnTime = burnTime;
    }

    @Override
    public int getBurnTime(ItemStack itemStack) {
        return this.burnTime;
    }

    @Override
    public Set<ResourceLocation> getTags() {
        return super.getTags();
    }
}
