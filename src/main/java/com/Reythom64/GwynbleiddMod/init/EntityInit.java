package com.Reythom64.GwynbleiddMod.init;

import com.Reythom64.GwynbleiddMod.Main;
import com.Reythom64.GwynbleiddMod.entity.EntityDrowner;
import com.Reythom64.GwynbleiddMod.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit 
{
	public static void registerEntities()
	{
		registerEntity("drowner", EntityDrowner.class, Reference.ENTITY_DROWNER, 22, 4950682, 1775954);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
