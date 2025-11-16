package net.mcreator.trop.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.trop.item.ItemRingOnUvatha;
import net.mcreator.trop.item.ItemRingOnRen;
import net.mcreator.trop.item.ItemRingOnMurazor;
import net.mcreator.trop.item.ItemRingOnKhamul;
import net.mcreator.trop.item.ItemRingOnJiindur;
import net.mcreator.trop.item.ItemRingOnHoarmurath;
import net.mcreator.trop.item.ItemRingOnDwar;
import net.mcreator.trop.item.ItemRingOnAkhorahil;
import net.mcreator.trop.item.ItemRingOnAdunaphel;
import net.mcreator.trop.ElementsTropMod;

import java.util.Map;

@ElementsTropMod.ModElement.Tag
public class ProcedureRingEffectMen extends ElementsTropMod.ModElement {
	public ProcedureRingEffectMen(ElementsTropMod instance) {
		super(instance, 87);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RingEffectMen!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof EntityPlayer)
				? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemRingOnMurazor.block, (int) (1)))
				: false)
				|| (((entity instanceof EntityPlayer)
						? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemRingOnHoarmurath.block, (int) (1)))
						: false)
						|| (((entity instanceof EntityPlayer)
								? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemRingOnAkhorahil.block, (int) (1)))
								: false)
								|| (((entity instanceof EntityPlayer)
										? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemRingOnAdunaphel.block, (int) (1)))
										: false)
										|| (((entity instanceof EntityPlayer)
												? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(ItemRingOnJiindur.block, (int) (1)))
												: false)
												|| (((entity instanceof EntityPlayer)
														? ((EntityPlayer) entity).inventory
																.hasItemStack(new ItemStack(ItemRingOnKhamul.block, (int) (1)))
														: false)
														|| (((entity instanceof EntityPlayer)
																? ((EntityPlayer) entity).inventory
																		.hasItemStack(new ItemStack(ItemRingOnUvatha.block, (int) (1)))
																: false)
																|| (((entity instanceof EntityPlayer)
																		? ((EntityPlayer) entity).inventory
																				.hasItemStack(new ItemStack(ItemRingOnRen.block, (int) (1)))
																		: false)
																		|| ((entity instanceof EntityPlayer)
																				? ((EntityPlayer) entity).inventory
																						.hasItemStack(new ItemStack(ItemRingOnDwar.block, (int) (1)))
																				: false)))))))))) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, (int) 36000, (int) 0, (false), (false)));
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.REGENERATION, (int) 36000, (int) 0, (false), (false)));
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.STRENGTH, (int) 36000, (int) 0, (false), (false)));
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, (int) 36000, (int) 0, (false), (false)));
		}
	}
}
