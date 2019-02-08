package com.otakusaikou.tm.Items;

import com.otakusaikou.tm.interfaces.IHasModel;
import com.otakusaikou.tm.util.InitHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ObsidianIngot extends Item implements IHasModel {
    public ObsidianIngot(String name) {
        InitHelper.itemInit(this,name,CreativeTabs.MATERIALS);
    }

    @Override
    public void registryItemRender(){
        InitHelper.itemModelRegistry(this);
    }
}
