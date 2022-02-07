package com.legendreaper.create_expansion.content.entities;

import com.legendreaper.create_expansion.ModEntities;
import com.legendreaper.create_expansion.ModItems;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

import javax.annotation.Nullable;

public class NileCrocodileEntity extends Animal{

    public NileCrocodileEntity( EntityType <NileCrocodileEntity> type, Level worldIn) {
        super(type, worldIn);

    }

    @Override
    protected void registerGoals() {

        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(10, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(13, new FollowParentGoal(this, 1.25D));
        this.goalSelector.addGoal(4, new TemptGoal(this, 1.0D, Ingredient.of(ModItems.WATERING_CAN.get()), false));
        this.goalSelector.addGoal(14, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.25D));
        this.goalSelector.addGoal(3, new BreedGoal(this, 1.0D));
        this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, Player.class, 6.0F));

    }
    public static AttributeSupplier.Builder createAttributes(){
     return Mob.createMobAttributes().add(Attributes.ATTACK_DAMAGE, 3.0D)
             .add(Attributes.MAX_HEALTH, 20.0D)
             .add(Attributes.FOLLOW_RANGE, 40.0D).add(Attributes.MOVEMENT_SPEED, 0.20f);
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel serverLevel, AgeableMob ageableMob) {
        return ModEntities.NILE_CROCODILE.get().create(serverLevel);
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return  SoundEvents.RAVAGER_HURT;
    }
    protected SoundEvent getDeathSound() {
        return SoundEvents.RAVAGER_DEATH;
    }
    public float getScale() {
        return this.isBaby() ? 0.3F : 1.0F;
    }
    public void travel(Vec3 travelVector) {
        if (this.isEffectiveAi() && this.isInWater()) {
            this.moveRelative(this.getSpeed(), travelVector);
            this.move(MoverType.SELF, this.getDeltaMovement());
            if (this.jumping) {
                this.setDeltaMovement(this.getDeltaMovement().scale(1D));
                this.setDeltaMovement(this.getDeltaMovement().add(0.0D, 0.72D, 0.0D));
            } else {
                this.setDeltaMovement(this.getDeltaMovement().scale(0.4D));
                this.setDeltaMovement(this.getDeltaMovement().add(0.0D, -0.08D, 0.0D));
            }

        } else {
            super.travel(travelVector);
        }

    }

}
