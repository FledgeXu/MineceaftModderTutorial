package com.otakusaikou.tm.Init;

import com.otakusaikou.tm.Items.ObsidianIngot;
import com.otakusaikou.tm.Items.armor.ObsidianArmor;
import com.otakusaikou.tm.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

import static net.minecraft.item.ItemArmor.*;

public class ModItems {
    public static List<Item> ITEMS = new ArrayList<>();
    //Material
    public static final ArmorMaterial OBSIDIAN_ARMOR_MATERIAL = EnumHelper.addArmorMaterial(
            "obsidian_material",
            Reference.MODID + ":obsidian",
            33,
            new int[]{3, 6, 8, 3},
            10,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            2.0F
    );
    //Normal Items
    public static final ObsidianIngot OBSIDIAN_INGOT = new ObsidianIngot("obsidian_ingot");
    //Armors
    public static final Item OBSDIAN_HELMET = new ObsidianArmor("obsidian_helmet",
            OBSIDIAN_ARMOR_MATERIAL,
            1,
            EntityEquipmentSlot.HEAD
    );
    public static final Item OBSDIAN_CHESTPLATE = new ObsidianArmor("obsidian_chestplate",
            OBSIDIAN_ARMOR_MATERIAL,
            1,
            EntityEquipmentSlot.CHEST
    );
    public static final Item OBSDIAN_LEGGINGS = new ObsidianArmor("obsidian_leggings",
            OBSIDIAN_ARMOR_MATERIAL,
            2,
            EntityEquipmentSlot.LEGS
    );
    public static final Item OBSDIAN_BOOTS = new ObsidianArmor("obsidian_boots",
            OBSIDIAN_ARMOR_MATERIAL,
            1,
            EntityEquipmentSlot.FEET
    );
}
