package net.tslat.aoa3.entity.mobs.greckon;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.packet.PacketScreenOverlay;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.common.registration.ItemRegister;
import net.tslat.aoa3.common.registration.SoundsRegister;
import net.tslat.aoa3.common.registration.WeaponRegister;
import net.tslat.aoa3.entity.base.AoAMeleeMob;
import net.tslat.aoa3.library.Enums;
import net.tslat.aoa3.utils.PacketUtil;

import javax.annotation.Nullable;

public class EntityGrillface extends AoAMeleeMob {
    public static final float entityWidth = 0.6875f;

    public EntityGrillface(World world) {
        super(world, entityWidth, 2.25f);
    }

    @Override
    public float getEyeHeight() {
        return 2f;
    }

    @Override
    protected double getBaseKnockbackResistance() {
        return 0.4;
    }

    @Override
    protected double getBaseMaxHealth() {
        return 70;
    }

    @Override
    protected double getBaseMeleeDamage() {
        return 5;
    }

    @Override
    protected double getBaseMovementSpeed() {
        return 0.2875;
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundsRegister.mobGrillfaceLiving;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundsRegister.mobGrillfaceDeath;
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundsRegister.mobGrillfaceHit;
    }

    @Override
    protected void dropSpecialItems(int lootingMod, DamageSource source) {
        if (rand.nextInt(35 - lootingMod) == 0)
            dropItem(WeaponRegister.cannonGhastBlaster, 1);

        if (rand.nextInt(7) == 0)
            dropItem(Item.getItemFromBlock(BlockRegister.bannerGhoul), 1);

        if (rand.nextInt(200 - lootingMod) == 0)
            dropItem(ItemRegister.upgradeKitHaunted, 1);

        if (rand.nextInt(20 - lootingMod) == 0)
            dropItem(ItemRegister.realmstoneDustopia, 1);
    }

    @Override
    protected void dropGuaranteedItems(int lootingMod, DamageSource source) {
        dropItem(ItemRegister.coinCopper, 5 + rand.nextInt(9 + lootingMod));
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();

        if (!world.isRemote && rand.nextInt(400) == 0 && getAttackTarget() != null) {
            EntityLivingBase target = getAttackTarget();

            setPosition(target.posX, target.posY, target.posZ);
            world.playSound(null, posX, posY, posZ, SoundsRegister.mobGrillfaceScare, SoundCategory.HOSTILE, 1.0f, 1.0f);

            if (target instanceof EntityPlayerMP)
                PacketUtil.network.sendTo(new PacketScreenOverlay(20, Enums.ScreenOverlays.GRILLFACE), (EntityPlayerMP)target);
        }
    }
}
