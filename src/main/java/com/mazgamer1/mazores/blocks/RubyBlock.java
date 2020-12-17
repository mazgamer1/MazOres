package com.mazgamer1.mazores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RubyBlock extends Block {

    public RubyBlock() {
        super(Block.Properties.create(Material.IRON)
            .hardnessAndResistance(5.0F, 6.0F)
            .sound(SoundType.METAL)
            .harvestTool(ToolType.PICKAXE)
            .harvestLevel(2)
        );
    }
}
