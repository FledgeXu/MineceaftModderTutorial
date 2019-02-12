package com.otakusaikou.tm.Items.tool;

import com.otakusaikou.tm.interfaces.IHasModel;
import com.otakusaikou.tm.util.InitHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ObsidianAxe extends ItemAxe implements IHasModel {
    public ObsidianAxe(String name, ToolMaterial material) {
        super(material, 8.0F, -3.2F);
        InitHelper.itemInit(this,name, CreativeTabs.COMBAT);
    }

    @Override
    public void registryItemRender() {
        InitHelper.itemModelRegistry(this);
    }
}
