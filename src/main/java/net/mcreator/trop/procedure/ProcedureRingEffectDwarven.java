package net.mcreator.trop.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.trop.item.ItemRingOnThulin;
import net.mcreator.trop.item.ItemRingOnThror;
import net.mcreator.trop.item.ItemRingOnKhibil;
import net.mcreator.trop.item.ItemRingOnKhain;
import net.mcreator.trop.item.ItemRingOnFarin;
import net.mcreator.trop.item.ItemRingOnBurin;
import net.mcreator.trop.item.ItemRingOnBaraz;
import net.mcreator.trop.ElementsTropMod;

import java.util.Map;

@ElementsTropMod.ModElement.Tag
public class ProcedureRingEffectDwarven extends ElementsTropMod.ModElement {
	public ProcedureRingEffectDwarven(ElementsTropMod instance) {
		super(instance, 86);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RingEffectDwarven!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof EntityPlayer)
				? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemRingOnThror.block, (int) (1)))
				: false)
				|| (((entity instanceof EntityPlayer)
						? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemRingOnThulin.block, (int) (1)))
						: false)
						|| (((entity instanceof EntityPlayer)
								? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemRingOnKhibil.block, (int) (1)))
								: false)
								|| (((entity instanceof EntityPlayer)
										? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemRingOnFarin.block, (int) (1)))
										: false)
										|| (((entity instanceof EntityPlayer)
												? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemRingOnKhain.block, (int) (1)))
												: false)
												|| (((entity instanceof EntityPlayer)
														? ((EntityPlayer) entity).inventory
																.hasItemStack(new ItemStack(ItemRingOnBaraz.block, (int) (1)))
														: false)
														|| ((entity instanceof EntityPlayer)
																? ((EntityPlayer) entity).inventory
																		.hasItemStack(new ItemStack(ItemRingOnBurin.block, (int) (1)))
																: false)))))))) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, (int) 36000, (int) 0, (false), (false)));
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.REGENERATION, (int) 36000, (int) 0, (false), (false)));
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.HASTE, (int) 36000, (int) 0, (false), (false)));
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, (int) 36000, (int) 0, (false), (false)));
		}
	}
}
