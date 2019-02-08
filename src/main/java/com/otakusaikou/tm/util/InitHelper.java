package com.otakusaikou.tm.util;

import com.otakusaikou.tm.Init.ModItems;
import com.otakusaikou.tm.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class InitHelper {
    public static void itemInit(Item item,String name,CreativeTabs tab){
        item.setUnlocalizedName(name);
        item.setRegistryName(name);
        item.setCreativeTab(tab);
        ModItems.ITEMS.add(item);
    }
    public static void itemModelRegistry(Item item){
        Main.proxy.registryModel(item, 0,"inventory");
    }
}
