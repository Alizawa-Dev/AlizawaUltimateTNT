package com.alizawa.alizawaultimatetnt.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.TNTEntity;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class MineTNTEntity extends TNTEntity {

    @Override
    protected void explode() {



        //double offsetX = random.nextGaussian() * 0.02;
        //double offsetY = random.nextGaussian() * 0.02;
        //double offsetZ = random.nextGaussian() * 0.02;
        //this.level.addParticle(ParticleTypes.LAVA, getX(), getY() + 3.0, getZ(), offsetX, offsetY, offsetZ);
        //this.level.addParticle(ParticleTypes.FLAME, getX(), getY() + 3.0, getZ(), offsetX, offsetY, offsetZ);
        this.level.explode(this, this.getX(), getY() - 20.0, getZ(), 10.0F, Explosion.Mode.DESTROY);

    }


    public MineTNTEntity(EntityType<? extends TNTEntity> p_i50216_1_, World p_i50216_2_) {
        super(p_i50216_1_, p_i50216_2_);
    }

    public MineTNTEntity(World p_i1730_1_, double p_i1730_2_, double p_i1730_4_, double p_i1730_6_, @Nullable LivingEntity p_i1730_8_) {
        super(p_i1730_1_, p_i1730_2_, p_i1730_4_, p_i1730_6_, p_i1730_8_);

    }
}
