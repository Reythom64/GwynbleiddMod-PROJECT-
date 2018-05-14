package com.Reythom64.GwynbleiddMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SilverCompactBlocks extends BlockBase 
{

	public SilverCompactBlocks(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(6.0F);
		setResistance(30);
		setHarvestLevel("pickaxe", 2);
		//setLightLevel();
		//setLightOpacity();
		//setBlockUnbreakable();
	}
}
