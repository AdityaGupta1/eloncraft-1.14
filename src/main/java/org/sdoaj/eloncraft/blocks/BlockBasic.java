package org.sdoaj.eloncraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ToolType;
import org.sdoaj.eloncraft.Eloncraft;
import org.sdoaj.eloncraft.items.ModItems;

public class BlockBasic extends Block {
    public BlockBasic(String name, Properties properties) {
        super(properties);
        ModBlocks.addBlock(this.setRegistryName(Eloncraft.MODID, name));
        ModItems.addItem(new BlockItem(this, ModItems.defaultProperties()).setRegistryName(name));
    }

    public BlockBasic(String name, Material material, float hardness, float resistance, int harvestLevel, ToolType toolType) {
        this(name, Block.Properties.create(material).hardnessAndResistance(hardness, resistance).harvestLevel(harvestLevel)
                .harvestTool(toolType));
    }

    public static BlockBasic newMetalBlock(String material, int harvestLevel, float hardness, float resistance) {
        return new BlockBasic(material + "_block", Material.IRON, hardness, resistance, harvestLevel, ToolType.PICKAXE);
    }

    public static BlockBasic newStoneOre(String material, int harvestLevel, float hardness, float resistance) {
        return new BlockBasic(material + "_ore", Material.IRON, hardness, resistance, harvestLevel, ToolType.PICKAXE);
    }

    // @Override
    // public ResourceLocation getLootTable() {
    //     return new ResourceLocation(Eloncraft.MODID, "blocks/" + this.getRegistryName());
    // }
}
