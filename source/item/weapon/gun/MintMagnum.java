package net.tslat.aoa3.item.weapon.gun;

import net.minecraft.util.SoundEvent;
import net.tslat.aoa3.item.weapon.AdventWeapon;

public class MintMagnum extends BaseGun implements AdventWeapon {
	public MintMagnum(double dmg, SoundEvent sound, int durability, int firingDelayTicks, float recoil) {
		super(dmg, sound, durability, firingDelayTicks, recoil);
		setUnlocalizedName("MintMagnum");
		setRegistryName("aoa3:mint_magnum");
	}
}
