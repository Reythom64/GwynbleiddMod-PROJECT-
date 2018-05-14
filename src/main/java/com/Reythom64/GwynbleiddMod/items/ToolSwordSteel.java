package com.Reythom64.GwynbleiddMod.items;

import com.Reythom64.GwynbleiddMod.Main;
import com.Reythom64.GwynbleiddMod.init.ModItems;
import com.Reythom64.GwynbleiddMod.util.IHasModel;
import com.google.common.collect.Multimap;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.monster.EntityEvoker;
import net.minecraft.entity.monster.EntityIllusionIllager;
import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.entity.monster.EntityVindicator;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityDonkey;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.entity.passive.EntityMule;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.DamageSource;

public class ToolSwordSteel extends ItemSword implements IHasModel 
{
	public ToolSwordSteel(String name, ToolMaterial material)
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
		if (target instanceof EntityVillager && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntityWolf && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntityPlayer && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntityCow && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntityOcelot && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntitySquid && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntityPolarBear && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntitySheep && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntityRabbit && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntityHorse && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntityChicken && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntityDonkey && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntityMule && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntityPig && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntityLlama && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntityWitch && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntityEvoker && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntityVindicator && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
		
		if (target instanceof EntityIllusionIllager && attacker instanceof EntityPlayer) 
		{
			EntityPlayer ep = (EntityPlayer) attacker;
			target.attackEntityFrom(DamageSource.causePlayerDamage(ep), 9);
		}
	        super.hitEntity(stack, target, attacker);
		return true;
	}
}

