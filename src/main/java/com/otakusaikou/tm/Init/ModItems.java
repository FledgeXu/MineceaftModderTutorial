package com.otakusaikou.tm.Init;

import com.otakusaikou.tm.Items.ObsidianIngot;
import com.otakusaikou.tm.Items.armor.ObsidianArmor;
import com.otakusaikou.tm.Items.tool.*;
import com.otakusaikou.tm.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
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
    public static final ToolMaterial OBISDIAN_TOOL_MATERIAL = EnumHelper.addToolMaterial(
            "obsidian_tool_material",
            3,
            1200,
            6.0F,
            2.0F,
            8
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

    //Tools
    public static final ItemSword OBSIDIAN_SWORD = new ObsidianSword(
            "obsidian_sword",
            OBISDIAN_TOOL_MATERIAL
    );
    public static final ItemPickaxe OBSIDIAN_PICKAXE = new ObsidianPickaxe(
            "obsidian_pickaxe",
            OBISDIAN_TOOL_MATERIAL
    );
    public static final ItemAxe OBSIDIAN_AXE = new ObsidianAxe(
            "obsidian_axe",
            OBISDIAN_TOOL_MATERIAL
    );
    public static final ItemHoe OBSIDIAN_HOE = new ObsidianHoe(
            "obsidian_hoe",
            OBISDIAN_TOOL_MATERIAL
    );
    public static final ItemSpade OBSIDIAN_SPADE = new ObsidianSpade(
            "obsidian_spade",
            OBISDIAN_TOOL_MATERIAL
    );
    public static final ItemTool OBSIDIAN_ICEAXE = new ObsidianIceaxe(
            "obsidian_iceaxe",
            OBISDIAN_TOOL_MATERIAL
    );
}
