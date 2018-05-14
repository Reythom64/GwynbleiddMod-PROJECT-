package com.Reythom64.GwynbleiddMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SilverOreBlock extends BlockBase 
{

	public SilverOreBlock(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(4.0F);
		setResistance(15);
		setHarvestLevel("pickaxe", 2);
		//setLightLevel();
		//setLightOpacity();
		//setBlockUnbreakable();
	}
}
