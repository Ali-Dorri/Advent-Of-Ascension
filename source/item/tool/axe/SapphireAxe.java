package net.tslat.aoa3.item.tool.axe;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.tslat.aoa3.common.registration.CreativeTabsRegister;
import net.tslat.aoa3.common.registration.ItemRegister;

public class SapphireAxe extends ItemAxe {
	public SapphireAxe(ToolMaterial material) {
		super(material, material.getAttackDamage(), -3.0f);
		setUnlocalizedName("SapphireAxe");
		setRegistryName("aoa3:sapphire_axe");
		setCreativeTab(CreativeTabsRegister.toolsTab);
	}

	@Override
	public boolean getIsRepairable(ItemStack stack, ItemStack repairMaterial) {
		return OreDictionary.itemMatches(repairMaterial, new ItemStack(ItemRegister.ingotRosite), false) || super.getIsRepairable(stack, repairMaterial);
	}
}
