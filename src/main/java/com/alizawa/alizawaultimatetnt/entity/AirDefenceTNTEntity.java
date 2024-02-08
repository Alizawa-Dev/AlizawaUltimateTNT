package com.alizawa.alizawaultimatetnt.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.TNTEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class AirDefenceTNTEntity extends TNTEntity {
    @Override
    protected void explode() {
        //for (int i = 0; i < 3000; i++) {
            //double offsetX = random.nextGaussian() * 0.02;
            //double offsetY = random.nextGaussian() * 0.02;
            //double offsetZ = random.nextGaussian() * 0.02;
            //this.level.addParticle(ParticleTypes.LAVA, getX(), getY() + 1.0, getZ(), offsetX, offsetY, offsetZ);
           // this.level.addParticle(ParticleTypes.LAVA, getX(), getY() + 3.0, getZ(), offsetX, offsetY, offsetZ);
        //}

        //double offsetX = random.nextGaussian() * 0.02;
        //double offsetY = random.nextGaussian() * 0.02;
       // double offsetZ = random.nextGaussian() * 0.02;
        //this.level.addParticle(ParticleTypes.LAVA, getX(), getY() + 3.0, getZ(), offsetX, offsetY, offsetZ);
        //this.level.addParticle(ParticleTypes.FLAME, getX(), getY() + 3.0, getZ(), offsetX, offsetY, offsetZ);
        this.level.explode(this, this.getX(), getY() + 20.0, getZ(), 8.0F, Explosion.Mode.DESTROY);

    }


    public AirDefenceTNTEntity(EntityType<? extends TNTEntity> p_i50216_1_, World p_i50216_2_) {
        super(p_i50216_1_, p_i50216_2_);
    }

    public AirDefenceTNTEntity(World p_i1730_1_, double p_i1730_2_, double p_i1730_4_, double p_i1730_6_, @Nullable LivingEntity p_i1730_8_) {
        super(p_i1730_1_, p_i1730_2_, p_i1730_4_, p_i1730_6_, p_i1730_8_);

    }

}
