package com.alizawa.alizawaultimatetnt.blocks;

import com.alizawa.alizawaultimatetnt.entity.FireTNTEntity;
import com.alizawa.alizawaultimatetnt.util.RegistryHandler;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.LivingEntity;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class AlizawaHead extends TNTBlock {
    public AlizawaHead(Properties properties) {
        super(AbstractBlock.Properties.of(Material.EXPLOSIVE).instabreak()
                .sound(SoundType.GRASS).lightLevel(value -> 55).strength(2.0F, 20.0F)
                );
    }

    @Override
    public void catchFire(BlockState state, World world, BlockPos pos, Direction direction, @Nullable LivingEntity igniter){
        if (!world.isClientSide()) {
            FireTNTEntity entity = new FireTNTEntity(RegistryHandler.FIRE_TNT_ENTITY.get(), world);
            entity.setPos(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5);
            world.addFreshEntity(entity);
            world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.TNT_PRIMED, SoundCategory.BLOCKS, 1.0F, 1.0F);
            world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.FIRE_AMBIENT, SoundCategory.BLOCKS, 2.0F, 2.0F);
            world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.CREEPER_PRIMED, SoundCategory.BLOCKS, 2.0F, 2.0F);
            spawnParticles(world, pos.getX() , pos.getY() + 0.5, pos.getZ());
        }
        {
            spawnParticles(world, pos.getX() + 0.5, pos.getY() + 1.0, pos.getZ() + 0.5);
            explode(world, pos);
        }
    }

    //生成粒子效果

    public void spawnParticles(World world, double x, double y, double z) {
        for (int i = 0; i < 300; i++) {
            double offsetX = world.random.nextGaussian() * 0.1;
            double offsetY = world.random.nextGaussian() * 0.1;
            double offsetZ = world.random.nextGaussian() * 0.1;
            world.addParticle(ParticleTypes.HEART, x, y, z, offsetX, offsetY, offsetZ);
        }
    }
}
