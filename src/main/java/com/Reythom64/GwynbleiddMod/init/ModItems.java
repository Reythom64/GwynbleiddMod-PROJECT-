package com.Reythom64.GwynbleiddMod.init;

import java.util.ArrayList;
import java.util.List;

import com.Reythom64.GwynbleiddMod.armour.ArmourBase;
import com.Reythom64.GwynbleiddMod.items.ItemBase;
import com.Reythom64.GwynbleiddMod.items.ToolSword;
import com.Reythom64.GwynbleiddMod.items.ToolSwordSilver;
import com.Reythom64.GwynbleiddMod.items.ToolSwordSteel;
import com.Reythom64.GwynbleiddMod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial TOOL_WITCHER_STEEL = EnumHelper.addToolMaterial("tool_witcher_steel", 2, 600, 7.0F, 2.0F, 15);
	public static final ToolMaterial TOOL_WITCHER_SILVER = EnumHelper.addToolMaterial("tool_witcher_silver", 2, 600, 7.0F, 2.0F, 15);
	public static final ArmorMaterial ARMOUR_CLASSIC_KNIGHT = EnumHelper.addArmorMaterial("armour_classic_knight", Reference.MOD_ID + ":classic_knight", 28, new int[]{2, 4, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	//Items_Classiques
	public static final Item SILVER_ORE = new ItemBase ("silver_ore");
	public static final Item RAW_SILVER_INGOT = new ItemBase ("raw_silver_ingot");
	public static final Item SILVER_INGOT = new ItemBase ("silver_ingot");
	public static final Item PURIFIED_SILVER_INGOT = new ItemBase ("purified_silver_ingot");
	public static final Item ENRICHED_SILVER_INGOT = new ItemBase ("enriched_silver_ingot");
	public static final Item METEORITE_SILVER_INGOT = new ItemBase ("meteorite_silver_ingot");
	public static final Item METEORITE_ORE = new ItemBase ("meteorite_ore");
	public static final Item METEORITE_INGOT = new ItemBase ("meteorite_ingot");
	
	//Epees
	public static final Item SWORD_WITCHER_STEEL = new ToolSwordSteel ("sword_witcher_steel", TOOL_WITCHER_STEEL);
	public static final Item SWORD_WITCHER_SILVER = new ToolSwordSilver ("sword_witcher_silver", TOOL_WITCHER_SILVER);
	
	//Armures
	public static final Item CLASSIC_KNIGHT_CHESTPLATE = new ArmourBase ("classic_knight_chestplate", ARMOUR_CLASSIC_KNIGHT, 1, EntityEquipmentSlot.CHEST);
	public static final Item CLASSIC_KNIGHT_LEGGINGS = new ArmourBase ("classic_knight_leggings", ARMOUR_CLASSIC_KNIGHT, 2, EntityEquipmentSlot.LEGS);
	public static final Item CLASSIC_KNIGHT_BOOTS = new ArmourBase ("classic_knight_boots", ARMOUR_CLASSIC_KNIGHT, 1, EntityEquipmentSlot.FEET);
	public static final Item CLASSIC_KNIGHT_HELMET = new ArmourBase ("classic_knight_helmet", ARMOUR_CLASSIC_KNIGHT, 1, EntityEquipmentSlot.HEAD);
	
	public static void init() {
		// TODO Auto-generated method stub
		
	}
	public static void register() {
		// TODO Auto-generated method stub
		
	}
	
}
