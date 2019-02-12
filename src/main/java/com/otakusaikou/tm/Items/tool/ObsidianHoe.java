package com.otakusaikou.tm.Items.tool;

import com.otakusaikou.tm.interfaces.IHasModel;
import com.otakusaikou.tm.util.InitHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ObsidianHoe extends ItemHoe implements IHasModel {
    public ObsidianHoe(String name,ToolMaterial material) {
        super(material);
        InitHelper.itemInit(this,name, CreativeTabs.COMBAT);
    }

    @Override
    public void registryItemRender() {
        InitHelper.itemModelRegistry(this);
    }
}
