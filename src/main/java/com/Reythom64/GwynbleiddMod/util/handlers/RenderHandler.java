package com.Reythom64.GwynbleiddMod.util.handlers;

import com.Reythom64.GwynbleiddMod.entity.EntityDrowner;
import com.Reythom64.GwynbleiddMod.entity.render.RenderDrowner;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderStray;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityDrowner.class, new IRenderFactory<EntityDrowner>()
		{
			@Override
			public Render<? super EntityDrowner> createRenderFor(RenderManager manager)
			{
				return new RenderDrowner(manager);
			}
		});
	}
}
