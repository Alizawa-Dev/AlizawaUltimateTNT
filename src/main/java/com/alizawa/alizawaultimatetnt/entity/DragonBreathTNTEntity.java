package com.alizawa.alizawaultimatetnt.entity;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.TNTEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.crafting.RecipeManager;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.tags.ITagCollectionSupplier;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.DynamicRegistries;
import net.minecraft.world.Explosion;
import net.minecraft.world.ITickList;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.AbstractChunkProvider;
import net.minecraft.world.storage.MapData;

import javax.annotation.Nullable;
import java.util.List;

public class DragonBreathTNTEntity extends TNTEntity {

    //修改TNT爆炸威力
    @Override
    protected void explode() {

        for (int i = 0; i < 2000; ++i) {
            this.level.addParticle(ParticleTypes.DRAGON_BREATH, this.getX(), this.getX(), this.getZ(), 0.5D, 0.5D, 0.5D);
        }
        for (int i = 0; i < 1000; i++) {
            double offsetX = random.nextGaussian() * 0.02;
            double offsetY = random.nextGaussian() * 0.02;
            double offsetZ = random.nextGaussian() * 0.02;
            this.level.addParticle(ParticleTypes.FLAME, getX(), getY(), getZ(), offsetX, offsetY, offsetZ);
        }
        this.level.explode(this, this.getX(), getY(), getZ(), 5.0F, Explosion.Mode.DESTROY);
        this.level.explode(this, this.getX() + 0.1, getY() + 5.0, getZ() + 0.1, 70.0F, Explosion.Mode.DESTROY);
        this.level.explode(this, this.getX() + 0.1, getY() + 10.0, getZ() + 0.1, 40.0F, Explosion.Mode.DESTROY);
        this.level.explode(this, this.getX() + 0.1, getY() + 15.0, getZ() + 0.1, 60.0F, Explosion.Mode.DESTROY);
        this.level.explode(this, this.getX() + 0.1, getY() + 25.0, getZ() + 0.1, 65.0F, Explosion.Mode.DESTROY);
        this.level.explode(this, this.getX() + 0.1, getY() + 35.0, getZ() + 0.1, 65.0F, Explosion.Mode.DESTROY);
        this.level.explode(this, this.getX() + 0.1, getY() + 45.0, getZ() + 0.1, 60.0F, Explosion.Mode.DESTROY);
        this.level.explode(this, this.getX() + 0.1, getY() - 8.0, getZ() + 0.1, 60.0F, Explosion.Mode.DESTROY);
        this.level.explode(this, this.getX() + 0.1, getY() - 16.0, getZ() + 0.1, 65.0F, Explosion.Mode.DESTROY);
        this.level.explode(this, this.getX() + 0.1, getY() - 26.0, getZ() + 0.1, 65.0F, Explosion.Mode.DESTROY);
        this.level.explode(this, this.getX() + 0.1, getY() - 40.0, getZ() + 0.1, 80.0F, Explosion.Mode.DESTROY);
        //spawnParticles(world, pos.getX() + 0.08, pos.getY() + 0.08, pos.getZ() + 0.08);

    }

    public DragonBreathTNTEntity(EntityType<? extends TNTEntity> p_i50216_1_, World p_i50216_2_) {
        super(p_i50216_1_, p_i50216_2_);
    }


    public DragonBreathTNTEntity(World p_i1730_1_, double p_i1730_2_, double p_i1730_4_, double p_i1730_6_, @Nullable LivingEntity p_i1730_8_) {
        super(p_i1730_1_, p_i1730_2_, p_i1730_4_, p_i1730_6_, p_i1730_8_);
    }


    private void spawnParticles(World world, double x, double y, double z) {
        for (int i = 0; i < 100; i++) {
            double offsetX = world.random.nextGaussian() * 0.1;
            double offsetY = world.random.nextGaussian() * 0.1;
            double offsetZ = world.random.nextGaussian() * 0.1;
            world.addParticle(ParticleTypes.DRAGON_BREATH, x, y, z, offsetX, offsetY, offsetZ);
            world.addParticle(ParticleTypes.FLAME, x, y, z, offsetX, offsetY, offsetZ);
            world.addParticle(ParticleTypes.WITCH, x, y, z, offsetX, offsetY, offsetZ);
        }

    }}
