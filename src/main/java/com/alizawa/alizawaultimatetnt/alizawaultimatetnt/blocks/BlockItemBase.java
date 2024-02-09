package com.alizawa.alizawaultimatetnt.blocks;

import com.alizawa.alizawaultimatetnt.AlizawaUltimateTNT;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block block) {
        super(block, new Item.Properties().tab(AlizawaUltimateTNT.TAB));
    }
}
