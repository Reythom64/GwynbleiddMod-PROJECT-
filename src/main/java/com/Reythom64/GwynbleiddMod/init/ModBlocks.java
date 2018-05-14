package com.Reythom64.GwynbleiddMod.init;

import java.util.ArrayList;
import java.util.List;

import com.Reythom64.GwynbleiddMod.blocks.BlockBase;
import com.Reythom64.GwynbleiddMod.blocks.MeteoriteCompactBlocks;
import com.Reythom64.GwynbleiddMod.blocks.MeteoriteOreBlock;
import com.Reythom64.GwynbleiddMod.blocks.SilverCompactBlocks;
import com.Reythom64.GwynbleiddMod.blocks.SilverOreBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block SILVER_ORE_BLOCK = new SilverOreBlock("silver_ore_block", Material.ROCK);
	public static final Block METEORITE_ORE_BLOCK = new MeteoriteOreBlock("meteorite_ore_block", Material.ROCK);
	public static final Block RAW_SILVER_BLOCK = new SilverCompactBlocks("raw_silver_block", Material.IRON);
	public static final Block SILVER_BLOCK = new SilverCompactBlocks("silver_block", Material.IRON);
	public static final Block PURIFIED_SILVER_BLOCK = new SilverCompactBlocks("purified_silver_block", Material.IRON);
	public static final Block ENRICHED_SILVER_BLOCK = new SilverCompactBlocks("enriched_silver_block", Material.IRON);
	public static final Block METEORITE_SILVER_BLOCK = new MeteoriteCompactBlocks("meteorite_silver_block", Material.IRON);
	public static final Block METEORITE_BLOCK = new MeteoriteCompactBlocks("meteorite_block", Material.IRON);
	public static final Block METEORITE_INGOT_BLOCK = new MeteoriteCompactBlocks("meteorite_ingot_block", Material.IRON);
	public static void init() {
		// TODO Auto-generated method stub
		
	}
	public static void register() {
		// TODO Auto-generated method stub
		
	}
	
}
