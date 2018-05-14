package com.Reythom64.GwynbleiddMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MeteoriteCompactBlocks extends BlockBase 
{

	public MeteoriteCompactBlocks(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(12.0F);
		setResistance(60);
		setHarvestLevel("pickaxe", 3);
		//setLightLevel();
		//setLightOpacity();
		//setBlockUnbreakable();
	}
}
