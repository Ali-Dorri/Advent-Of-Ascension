package net.tslat.aoa3.common.registration;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class MaterialsRegister {
	public static final Item.ToolMaterial AMETHYST = EnumHelper.addToolMaterial("AOAAMETHYST", 4, 1000, 4.0f, 6.0f, 0).setRepairItem(new ItemStack(ItemRegister.amethyst));
	public static final Item.ToolMaterial BARON = EnumHelper.addToolMaterial("AOABARON", 4, 1300, 4.0f, 14.0f, 0);
	public static final Item.ToolMaterial BLOODFURY = EnumHelper.addToolMaterial("AOABLOODFURY", 4, 1400, 4.0f, 18.0f, 0);
	public static final Item.ToolMaterial BLOODSTONE = EnumHelper.addToolMaterial("AOABLOODSTONE", 4, 1000, 4.0f, 12.0f, 0);
	public static final Item.ToolMaterial CANDLEFIRE = EnumHelper.addToolMaterial("AOACANDLEFIRE", 4, 1000, 4.0f, 5.0f, 0);
	public static final Item.ToolMaterial CARAMELCARVER = EnumHelper.addToolMaterial("AOACARAMELCARVER", 4, 1300, 4.0f, 15.0f, 0);
	public static final Item.ToolMaterial CORALSTORM = EnumHelper.addToolMaterial("AOACORALSTORM", 4, 1100, 4.0f, 14.0f, 0);
	public static final Item.ToolMaterial CREEPIFIED = EnumHelper.addToolMaterial("AOACREEPIFIED", 4, 1600, 4.0f, 18.0f, 0);
	public static final Item.ToolMaterial CRYSTALLITE = EnumHelper.addToolMaterial("AOACRYSTALLITE", 4, 1000, 4.0f, 11.0f, 0);
	public static final Item.ToolMaterial EMBERSTONE = EnumHelper.addToolMaterial("AOAEMBERSTONE", 4, 1000, 4.0f, 10.0f, 0).setRepairItem(new ItemStack(ItemRegister.ingotEmberstone));
	public static final Item.ToolMaterial EXPLOCHRON = EnumHelper.addToolMaterial("AOAEXPLOCHRON", 4, 1400, 4.0f, 17.0f, 0);
	public static final Item.ToolMaterial FIREBORNE = EnumHelper.addToolMaterial("AOAFIREBORNE", 4, 1300, 4.0f, 14.0f, 0);
	public static final Item.ToolMaterial GUARDIAN = EnumHelper.addToolMaterial("AOAGUARDIAN", 4, 1600, 4.0f, 18.0f, 0);
	public static final Item.ToolMaterial HARVESTER = EnumHelper.addToolMaterial("AOAHARVESTER", 4, 1300, 4.0f, 24.0f, 0);
	public static final Item.ToolMaterial HOLY = EnumHelper.addToolMaterial("AOAHOLY", 4, 600, 4.0f, 4.0f, 0);
	public static final Item.ToolMaterial ILLUSION = EnumHelper.addToolMaterial("AOAILLUSION", 4, 1600, 4.0f, 16.0f, 0);
	public static final Item.ToolMaterial JADE = EnumHelper.addToolMaterial("AOAJADE", 4, 1600, 4.0f, 6.0f, 0).setRepairItem(new ItemStack(ItemRegister.jade));
	public static final Item.ToolMaterial LEGBONE = EnumHelper.addToolMaterial("AOALEGBONE", 4, 1200, 4.0f, 16.0f, 0);
	public static final Item.ToolMaterial LIGHTSWAY = EnumHelper.addToolMaterial("AOALIGHTSWAY", 4, 1600, 4.0f, 12.0f, 0);
	public static final Item.ToolMaterial LIMONITE = EnumHelper.addToolMaterial("AOALIMONITE", 3, 400, 4.0f, 5.0f, 0).setRepairItem(new ItemStack(ItemRegister.ingotLimonite));
	public static final Item.ToolMaterial NETHENGEIC = EnumHelper.addToolMaterial("AOANETHENGEIC", 4, 1200, 4.0f, 19.0f, 0);
	public static final Item.ToolMaterial ROCKBASHER = EnumHelper.addToolMaterial("AOAROCKBASHER", 4, 1600, 4.0f, 17.0f, 0);
	public static final Item.ToolMaterial ROCKPICK = EnumHelper.addToolMaterial("AOAROCKPICK", 4, 1800, 8.0f, 16.0f, 0);
	public static final Item.ToolMaterial ROSIDIAN = EnumHelper.addToolMaterial("AOAROSIDIAN", 4, 1600, 4.0f, 15.0f, 0);
	public static final Item.ToolMaterial ROSITE = EnumHelper.addToolMaterial("AOAROSITE", 4, 2300, 4.0f, 7.0f, 0).setRepairItem(new ItemStack(ItemRegister.ingotRosite));
	public static final Item.ToolMaterial RUNIC = EnumHelper.addToolMaterial("AOARUNIC", 4, 1400, 4.0f, 15.0f, 0);
	public static final Item.ToolMaterial SAPPHIRE = EnumHelper.addToolMaterial("AOASAPPHIRE", 4, 1300, 4.0f, 11.0f, 0).setRepairItem(new ItemStack(ItemRegister.sapphire));
	public static final Item.ToolMaterial SHADOW = EnumHelper.addToolMaterial("AOARUNIC", 4, 1600, 4.0f, 19.0f, 0);
	public static final Item.ToolMaterial SHROOMUS = EnumHelper.addToolMaterial("AOASHROOMUS", 4, 1600, 4.0f, 17.0f, 0);
	public static final Item.ToolMaterial SKELETAL = EnumHelper.addToolMaterial("AOASKELETAL", 4, 1600, 4.0f, 22.0f, 0).setRepairItem(new ItemStack(ItemRegister.ingotSkeletal));
	public static final Item.ToolMaterial SUPREMACY = EnumHelper.addToolMaterial("AOASUPREMACY", 4, 1200, 4.0f, 6.0f, 0);
	public static final Item.ToolMaterial SWEET = EnumHelper.addToolMaterial("AOASWEET", 4, 1100, 4.0f, 13.0f, 0);
	public static final Item.ToolMaterial TROLLBASHERAXE = EnumHelper.addToolMaterial("AOATROLLBASHERAXE", 4, 1800, 7.0f, 14.0f, 0);
	public static final Item.ToolMaterial ULTRAFLAME = EnumHelper.addToolMaterial("AOAULTRAFLAME", 4, 1000, 4.0f, 16.0f, 0);
	public static final Item.ToolMaterial VOID = EnumHelper.addToolMaterial("AOAJADE", 4, 1600, 4.0f, 9.0f, 0);
	public static final Item.ToolMaterial VULCAMMER = EnumHelper.addToolMaterial("AOAVULCAMMER", 4, 1600, 4.0f, 17.0f, 0);

	public static final Item.ToolMaterial AMETHYSTTOOL = EnumHelper.addToolMaterial("AOAAMETHYSTTOOL", 4, 600, 8.0f, 5.0f, 10).setRepairItem(new ItemStack(ItemRegister.amethyst));
	public static final Item.ToolMaterial EMBERSTONETOOL = EnumHelper.addToolMaterial("AOAEMBERSTONETOOL", 6, 2000, 11.0f, 8.0f, 10).setRepairItem(new ItemStack(ItemRegister.ingotEmberstone));
	public static final Item.ToolMaterial JADETOOL = EnumHelper.addToolMaterial("AOAJADETOOL", 4, 1800, 9.5f, 5.0f, 10).setRepairItem(new ItemStack(ItemRegister.jade));
	public static final Item.ToolMaterial ROSITETOOL = EnumHelper.addToolMaterial("AOAROSITETOOL", 5, 2500, 8.5f, 6.0f, 10).setRepairItem(new ItemStack(ItemRegister.ingotRosite));
	public static final Item.ToolMaterial LIMONITETOOL = EnumHelper.addToolMaterial("AOALIMONITETOOL", 2, 400, 7.0f, 2.0f, 10).setRepairItem(new ItemStack(ItemRegister.ingotLimonite));
	public static final Item.ToolMaterial SAPPHIRETOOL = EnumHelper.addToolMaterial("AOASAPPHIRETOOL", 5, 1900, 13.0f, 9.0f, 10).setRepairItem(new ItemStack(ItemRegister.sapphire));
	public static final Item.ToolMaterial SKELETALTOOL = EnumHelper.addToolMaterial("AOASKELETALTOOL", 6, 2000, 14.0f, 11.0f, 10).setRepairItem(new ItemStack(ItemRegister.ingotSkeletal));
	public static final Item.ToolMaterial CHAINSAWTOOL = EnumHelper.addToolMaterial("AOACHAINSAWTOOL", 2, 500, 18.0f, 14.0f, 0);
	public static final Item.ToolMaterial ORNAMYTETOOL = EnumHelper.addToolMaterial("AOAORNAMYTETOOL", 6, 2000, 14.0f, 13.0f, 10);
	public static final Item.ToolMaterial SOULSTONETOOL = EnumHelper.addToolMaterial("AOASOULSTONETOOL", 6, 2000, 14.0f, 12.0f, 10);
	public static final Item.ToolMaterial OCCULTTOOL = EnumHelper.addToolMaterial("AOAOCCULTTOOL", 6, 2000, 10.0f, 15.0f, 10);
	public static final Item.ToolMaterial GOOFYTOOL = EnumHelper.addToolMaterial("AOAGOOFYTOOL", 6, 2000, 10.0f, 16.0f, 10);
	public static final Item.ToolMaterial ENERGISTICTOOL = EnumHelper.addToolMaterial("AOAENERGISTICTOOL", 6, 2000, 10.0f, 14.0f, 10);
	public static final Item.ToolMaterial GEMCRACKER = EnumHelper.addToolMaterial("AOAGEMCRACKER", 6, 1800, 10.0f, 12.0f, 10);
	public static final Item.ToolMaterial PICKMAX = EnumHelper.addToolMaterial("AOAPICKMAX", 6, 1300, 6.0f, 17.0f, 10);

	public static final ItemArmor.ArmorMaterial ARMOURACHELOS = EnumHelper.addArmorMaterial("AOAARMOURACHELOS", "aoa3:achelos_helmet", 15, new int[] {3, 6, 8, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);
	public static final ItemArmor.ArmorMaterial ARMOURALACRITY = EnumHelper.addArmorMaterial("AOAARMOURALACRITY", "aoa3:alacrity", 50, new int[] {3, 6, 9, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURALCHEMY = EnumHelper.addArmorMaterial("AOAARMOURALCHEMY", "aoa3:alchemy", 60, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2);
	public static final ItemArmor.ArmorMaterial ARMOURAMETHIND = EnumHelper.addArmorMaterial("AOAARMOURAMETHIND", "aoa3:amethind", 50, new int[] {3, 6, 7, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURANIMA = EnumHelper.addArmorMaterial("AOAARMOURANIMA", "aoa3:anima", 60, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2);
	public static final ItemArmor.ArmorMaterial ARMOURARCHAIC = EnumHelper.addArmorMaterial("AOAARMOURARCHAIC", "aoa3:archaic", 50, new int[] {4, 8, 10, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURAUGURY = EnumHelper.addArmorMaterial("AOAARMOURAUGURY", "aoa3:augury", 60, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2);
	public static final ItemArmor.ArmorMaterial ARMOURBARON = EnumHelper.addArmorMaterial("AOAARMOURBARON", "aoa3:baron", 50, new int[] {4, 7, 9, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURBATTLEBORN = EnumHelper.addArmorMaterial("AOAARMOURBATTLEBORN", "aoa3:battleborn", 50, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURBIOGENIC = EnumHelper.addArmorMaterial("AOAARMOURBIOGENIC", "aoa3:biogenic", 50, new int[] {4, 7, 9, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURBOREIC = EnumHelper.addArmorMaterial("AOAARMOURBOREIC", "aoa3:boreic", 50, new int[] {4, 8, 10, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURBUTCHERY = EnumHelper.addArmorMaterial("AOAARMOURBUTCHERY", "aoa3:butchery", 60, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2);
	public static final ItemArmor.ArmorMaterial ARMOURCANDY = EnumHelper.addArmorMaterial("AOAARMOURCANDY", "aoa3:candy", 50, new int[] {4, 7, 9, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURCOMMANDER = EnumHelper.addArmorMaterial("AOAARMOURCOMMANDER", "aoa3:commander", 50, new int[] {4, 7, 9, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURCREATION = EnumHelper.addArmorMaterial("AOAARMOURCREATION", "aoa3:creation", 60, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2);
	public static final ItemArmor.ArmorMaterial ARMOURCRYSTALLIS = EnumHelper.addArmorMaterial("AOAARMOURCRYSTALLIS", "aoa3:crystallis", 50, new int[] {4, 7, 9, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURELECANYTE = EnumHelper.addArmorMaterial("AOAARMOURELECANYTE", "aoa3:elecanyte", 50, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOUREMBRODIUM = EnumHelper.addArmorMaterial("AOAARMOUREMBRODIUM", "aoa3:embrodium", 45, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURENGINEERING = EnumHelper.addArmorMaterial("AOAARMOURENGINEERING", "aoa3:engineering", 60, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2);
	public static final ItemArmor.ArmorMaterial ARMOUREXOPLATE = EnumHelper.addArmorMaterial("AOAARMOUREXOPLATE", "aoa3:exoplate", 50, new int[] {4, 7, 9, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOUREXPEDITION = EnumHelper.addArmorMaterial("AOAARMOUREXPEDITION", "aoa3:expedition", 60, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2);
	public static final ItemArmor.ArmorMaterial ARMOUREXPLOSIVE = EnumHelper.addArmorMaterial("AOAARMOUREXPLOSIVE", "aoa3:explosive", 50, new int[] {3, 7, 9, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOUREXTRACTION = EnumHelper.addArmorMaterial("AOAARMOUREXTRACTION", "aoa3:extraction", 60, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2);
	public static final ItemArmor.ArmorMaterial ARMOURFACEMASK = EnumHelper.addArmorMaterial("AOAARMOURFACEMASK", "aoa3:face_mask", 15, new int[] {3, 6, 8, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);
	public static final ItemArmor.ArmorMaterial ARMOURFORAGING = EnumHelper.addArmorMaterial("AOAARMOURFORAGING", "aoa3:foraging", 60, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2);
	public static final ItemArmor.ArmorMaterial ARMOURFUNGAL = EnumHelper.addArmorMaterial("AOAARMOURFUNGAL", "aoa3:fungal", 50, new int[] {4, 8, 10, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURGHASTLY = EnumHelper.addArmorMaterial("AOAARMOURGHASTLY", "aoa3:ghastly", 50, new int[] {3, 7, 9, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURGHOULISH = EnumHelper.addArmorMaterial("AOAARMOURGHOULISH", "aoa3:ghoulish", 50, new int[] {4, 7, 9, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURHAULING = EnumHelper.addArmorMaterial("AOAARMOURHAULING", "aoa3:hauling", 60, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2);
	public static final ItemArmor.ArmorMaterial ARMOURHAZMAT = EnumHelper.addArmorMaterial("AOAARMOURHAZMAT", "aoa3:hazmat", 20, new int[] {2, 5, 7, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);
	public static final ItemArmor.ArmorMaterial ARMOURHUNTER = EnumHelper.addArmorMaterial("AOAARMOURHUNTER", "aoa3:hunter", 60, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2);
	public static final ItemArmor.ArmorMaterial ARMOURHYDRANGIC = EnumHelper.addArmorMaterial("AOAARMOURHYDRANGIC", "aoa3:hydrangic", 50, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURHYDROPLATE = EnumHelper.addArmorMaterial("AOAARMOURHYDROPLATE", "aoa3:hydroplate", 50, new int[] {4, 7, 9, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURICE = EnumHelper.addArmorMaterial("AOAARMOURICE", "aoa3:ice", 50, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURINFERNAL = EnumHelper.addArmorMaterial("AOAARMOURINFERNAL", "aoa3:infernal", 50, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURINFUSION = EnumHelper.addArmorMaterial("AOAARMOURINFUSION", "aoa3:infusion", 60, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2);
	public static final ItemArmor.ArmorMaterial ARMOURINNERVATION = EnumHelper.addArmorMaterial("AOAARMOURINNERVATION", "aoa3:innervation", 60, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2);
	public static final ItemArmor.ArmorMaterial ARMOURKNIGHT = EnumHelper.addArmorMaterial("AOAARMOURKNIGHT", "aoa3:knight", 50, new int[] {4, 8, 10, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURLOGGING = EnumHelper.addArmorMaterial("AOAARMOURLOGGING", "aoa3:logging", 60, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2);
	public static final ItemArmor.ArmorMaterial ARMOURLUNAR = EnumHelper.addArmorMaterial("AOAARMOURLUNAR", "aoa3:lunar", 50, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURLYNDAMYTE = EnumHelper.addArmorMaterial("AOAARMOURLYNDAMYTE", "aoa3:lyndamyte", 30, new int[] {2, 6, 7, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURLYONIC = EnumHelper.addArmorMaterial("AOAARMOURLYONIC", "aoa3:lyonic", 50, new int[] {4, 7, 9, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURMERCURIAL = EnumHelper.addArmorMaterial("AOAARMOURMERCURIAL", "aoa3:mercurial", 50, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURNECRO = EnumHelper.addArmorMaterial("AOAARMOURNECRO", "aoa3:necro", 50, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURNETHENGEIC = EnumHelper.addArmorMaterial("AOAARMOURNETHENGEIC", "aoa3:nethengeic", 50, new int[] {4, 7, 9, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURNIGHTMARE = EnumHelper.addArmorMaterial("AOAARMOURNIGHTMARE", "aoa3:nightmare", 50, new int[] {3, 6, 9, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURNIGHTVISIONGOGGLES = EnumHelper.addArmorMaterial("AOAARMOURNIGHTVISIONGOGGLES", "aoa3:night_vision_goggles", 15, new int[] {3, 6, 8, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);
	public static final ItemArmor.ArmorMaterial ARMOUROCEANUS = EnumHelper.addArmorMaterial("AOAARMOUROCEANUS", "aoa3:oceanus_helmet", 15, new int[] {3, 6, 8, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);
	public static final ItemArmor.ArmorMaterial ARMOUROMNI = EnumHelper.addArmorMaterial("AOAARMOUROMNI", "aoa3:omni", 50, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURPHANTASM = EnumHelper.addArmorMaterial("AOAARMOURPHANTASM", "aoa3:phantasm", 50, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURPOISON = EnumHelper.addArmorMaterial("AOAARMOURPOISON", "aoa3:poison", 50, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURPREDATIOUS = EnumHelper.addArmorMaterial("AOAARMOURPREDATIOUS", "aoa3:predatious", 50, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURPRIMORDIAL = EnumHelper.addArmorMaterial("AOAARMOURPRIMORDIAL", "aoa3:primordial", 50, new int[] {4, 8, 10, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURPURITY = EnumHelper.addArmorMaterial("AOAARMOURPURITY", "aoa3:purity", 50, new int[] {4, 7, 9, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURROCKBONE = EnumHelper.addArmorMaterial("AOAARMOURROCKBONE", "aoa3:rockbone", 50, new int[] {4, 8, 10, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURROSIDIAN = EnumHelper.addArmorMaterial("AOAARMOURROSIDIAN", "aoa3:rosidian", 50, new int[] {3, 7, 9, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURRUNATION = EnumHelper.addArmorMaterial("AOAARMOURRUNATION", "aoa3:runation", 60, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2);
	public static final ItemArmor.ArmorMaterial ARMOURRUNIC = EnumHelper.addArmorMaterial("AOAARMOURRUNIC", "aoa3:runic", 50, new int[] {3, 6, 9, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURSEALORD = EnumHelper.addArmorMaterial("AOAARMOURSEALORD", "aoa3:sealord_helmet", 15, new int[] {3, 6, 8, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);
	public static final ItemArmor.ArmorMaterial ARMOURSHARPSHOT = EnumHelper.addArmorMaterial("AOAARMOURSHARPSHOT", "aoa3:sharpshot", 50, new int[] {4, 7, 9, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURSKELETAL = EnumHelper.addArmorMaterial("AOAARMOURSKELETAL", "aoa3:skeletal", 50, new int[] {3, 5, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0);
	public static final ItemArmor.ArmorMaterial ARMOURSPACEKING = EnumHelper.addArmorMaterial("AOAARMOURSPACEKING", "aoa3:spaceking", 50, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURSPEED = EnumHelper.addArmorMaterial("AOAARMOURSPEED", "aoa3:speed", 50, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURSUBTERRANEAN = EnumHelper.addArmorMaterial("AOAARMOURSUBTERRANEAN", "aoa3:subterranean", 50, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURUTOPIAN = EnumHelper.addArmorMaterial("AOAARMOURUTOPIAN", "aoa3:utopian", 50, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURVOID = EnumHelper.addArmorMaterial("AOAARMOURVOID", "aoa3:void", 50, new int[] {2, 6, 7, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURVULCANISM = EnumHelper.addArmorMaterial("AOAARMOURVULCANISM", "aoa3:vulcanism", 60, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2);
	public static final ItemArmor.ArmorMaterial ARMOURWEAKEN = EnumHelper.addArmorMaterial("AOAARMOURWEAKEN", "aoa3:weaken", 50, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURWITHER = EnumHelper.addArmorMaterial("AOAARMOURWITHER", "aoa3:wither", 50, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1);
	public static final ItemArmor.ArmorMaterial ARMOURZARGONITE = EnumHelper.addArmorMaterial("AOAARMOURZARGONITE", "aoa3:zargonite", 50, new int[] {4, 8, 10, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2);
}
