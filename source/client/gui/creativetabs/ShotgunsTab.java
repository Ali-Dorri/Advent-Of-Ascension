package net.tslat.aoa3.client.gui.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.tslat.aoa3.common.registration.WeaponRegister;

public class ShotgunsTab extends CreativeTabs {
	public ShotgunsTab(final int id, final String name) {
		super(id, name);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(WeaponRegister.shotgunBlastBarrel, 1, 0);
	}
}
