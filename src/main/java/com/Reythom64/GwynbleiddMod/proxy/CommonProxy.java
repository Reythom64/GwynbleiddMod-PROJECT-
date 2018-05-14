package com.Reythom64.GwynbleiddMod.proxy;

import com.Reythom64.GwynbleiddMod.util.handlers.RegistryHandler;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy 
{
	public void registerItemRenderer(Item item, int meta, String id)
	{
		
	}

	public void preInit1(FMLPreInitializationEvent event) 
	{
		RegistryHandler.Common();
	}

	public void init() {
		// TODO Auto-generated method stub
		
	}

	public void preInit(FMLPreInitializationEvent event) {
		// TODO Auto-generated method stub
		
	}
	
}
