package com.otakusaikou.tm.Blocks;

import com.otakusaikou.tm.Init.ModBlocks;
import com.otakusaikou.tm.Init.ModItems;
import com.otakusaikou.tm.interfaces.IHasModel;
import com.otakusaikou.tm.util.InitHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class ObsidianBlock extends Block implements IHasModel {
    public ObsidianBlock(String name) {
        super(Material.ROCK);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        ModItems.ITEMS.add(
                new ItemBlock(this).setRegistryName(
                        this.getRegistryName()
                )
        );
        ModBlocks.BLOCKS.add(this);
    }

    @Override
    public void registryItemRender() {
        InitHelper.itemModelRegistry(Item.getItemFromBlock(this));
    }
}
