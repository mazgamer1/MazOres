package com.mazgamer1.mazores.blocks;

import com.mazgamer1.mazores.mazores;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(mazores.TAB_MISC));
    }
}
