package com.Reythom64.GwynbleiddMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MeteoriteOreBlock extends BlockBase 
{

	public MeteoriteOreBlock(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(10.0F);
		setResistance(45);
		setHarvestLevel("pickaxe", 3);
		//setLightLevel();
		//setLightOpacity();
		//setBlockUnbreakable();
	}
}
