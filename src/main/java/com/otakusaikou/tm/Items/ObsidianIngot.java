package com.otakusaikou.tm.Items;

import com.otakusaikou.tm.Init.ModItems;
import com.otakusaikou.tm.Main;
import com.otakusaikou.tm.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ObsidianIngot extends Item implements IHasModel {
    public ObsidianIngot(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registryItemRender(){
        Main.proxy.registryModel(this, 0,"inventory");
    }
}
