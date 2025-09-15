
package net.mcreator.trop.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.trop.item.ItemRingNarya;
import net.mcreator.trop.ElementsTropMod;

@ElementsTropMod.ModElement.Tag
public class TabRingsOfPower extends ElementsTropMod.ModElement {
	public TabRingsOfPower(ElementsTropMod instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabrings_of_power") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemRingNarya.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
