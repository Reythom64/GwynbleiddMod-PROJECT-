package com.Reythom64.GwynbleiddMod;

import com.Reythom64.GwynbleiddMod.init.ModBlocks;
import com.Reythom64.GwynbleiddMod.init.ModItems;
import com.Reythom64.GwynbleiddMod.proxy.CommonProxy;
import com.Reythom64.GwynbleiddMod.util.Reference;
import com.Reythom64.GwynbleiddMod.util.handlers.RegistryHandler;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
			ModItems.init();
			ModItems.register();
			
			ModBlocks.init();
			ModBlocks.register();
	}
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		
		proxy.preInit(event);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{	
		proxy.init();
		RegistryHandler.preInitRegistries();
	}
	
}
