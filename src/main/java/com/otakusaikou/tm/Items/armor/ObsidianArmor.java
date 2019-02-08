package com.otakusaikou.tm.Items.armor;

import com.otakusaikou.tm.interfaces.IHasModel;
import com.otakusaikou.tm.util.InitHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ObsidianArmor extends ItemArmor implements IHasModel {
    public ObsidianArmor(String name,ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        InitHelper.itemInit(this,name, CreativeTabs.COMBAT);
    }

    @Override
    public void registryItemRender() {
        InitHelper.itemModelRegistry(this);
    }
}
