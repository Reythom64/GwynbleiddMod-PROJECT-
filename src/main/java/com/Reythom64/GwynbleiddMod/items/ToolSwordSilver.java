package com.Reythom64.GwynbleiddMod.items;

import com.Reythom64.GwynbleiddMod.Main;
import com.Reythom64.GwynbleiddMod.entity.EntityDrowner;
import com.Reythom64.GwynbleiddMod.init.ModItems;
import com.Reythom64.GwynbleiddMod.util.IHasModel;
import com.google.common.collect.Multimap;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityElderGuardian;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.monster.EntityEvoker;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.monster.EntityHusk;
import net.minecraft.entity.monster.EntityShulker;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityStray;
import net.minecraft.entity.monster.EntityVex;
import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.DamageSource;

public class ToolSwordSilver extends ItemSword implements IHasModel 
{
	public ToolSwordSilver(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{	
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		if (target instanceof EntityZombie && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntitySpider && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntityDrowner && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntityCreeper && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntitySkeleton && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntityBlaze && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntityWither && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntitySilverfish && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntityEndermite && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntityDragon && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntityEnderman && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntityGhast && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntitySlime && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntityStray && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntityVex && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntityShulker && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntityGuardian && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntityElderGuardian && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}

		if (target instanceof EntityWitherSkeleton && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
	        super.hitEntity(stack, target, attacker);
		return true;
	}
}

