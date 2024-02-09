package com.alizawa.alizawaultimatetnt.blocks;

import com.alizawa.alizawaultimatetnt.entity.FireTNTEntity;
import com.alizawa.alizawaultimatetnt.entity.MineTNTEntity;
import com.alizawa.alizawaultimatetnt.util.RegistryHandler;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.TNTBlock;
import net.minecraft.block.material.Material;
import net.minecraft.entity.LivingEntity;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class MineTNT extends TNTBlock {
    public MineTNT(Properties properties) {
        super(AbstractBlock.Properties.of(Material.EXPLOSIVE).instabreak()
                .strength(3.0F, 4.0F)
                .sound(SoundType.STONE)
                .lightLevel(value -> 10)

        );
    }

    @Override
    public void catchFire(BlockState state, World world, BlockPos pos, Direction direction, @Nullable LivingEntity igniter){
        if (!world.isClientSide()) {
            MineTNTEntity entity = new MineTNTEntity(RegistryHandler.MINE_TNT_ENTITY.get(), world);
            entity.setPos(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5);
            world.addFreshEntity(entity);
            world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.TNT_PRIMED, SoundCategory.BLOCKS, 1.0F, 1.0F);
            world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.FIRE_AMBIENT, SoundCategory.BLOCKS, 2.0F, 2.0F);
            world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.CREEPER_PRIMED, SoundCategory.BLOCKS, 2.0F, 2.0F);
            spawnParticles(world, pos.getX() , pos.getY() + 0.5, pos.getZ());
        }
        {
            spawnParticles(world, pos.getX(), pos.getY() - 0.1, pos.getZ());
            spawnParticles(world, pos.getX(), pos.getY() - 1.0, pos.getZ());
            spawnParticles(world, pos.getX(), pos.getY() - 2.0, pos.getZ());
            spawnParticles(world, pos.getX(), pos.getY() - 3.0, pos.getZ());
            spawnParticles(world, pos.getX(), pos.getY() - 5.0, pos.getZ());
            spawnParticles(world, pos.getX(), pos.getY() - 7.0, pos.getZ());
            spawnParticles(world, pos.getX(), pos.getY() - 10.0, pos.getZ());
            spawnParticles(world, pos.getX(), pos.getY() - 12.0, pos.getZ());
            spawnParticles(world, pos.getX(), pos.getY() - 14.0, pos.getZ());
            spawnParticles(world, pos.getX(), pos.getY() - 16.0, pos.getZ());
            spawnParticles(world, pos.getX(), pos.getY() - 18.0, pos.getZ());
            spawnParticles2(world, pos.getX(), pos.getY() - 20.0, pos.getZ());
            spawnParticles2(world, pos.getX(), pos.getY() - 21.0, pos.getZ());
            explode(world, pos);
        }
    }

    //生成粒子效果

    public void spawnParticles(World world, double x, double y, double z) {
        for (int i = 0; i < 500; i++) {
            double offsetX = world.random.nextGaussian() * 0.1;
            double offsetY = world.random.nextGaussian() * 0.1;
            double offsetZ = world.random.nextGaussian() * 0.1;
            world.addParticle(ParticleTypes.SMOKE, x, y, z, offsetX, offsetY, offsetZ);
        }
    }
    public void spawnParticles2(World world, double x, double y, double z) {
        for (int i = 0; i < 500; i++) {
            double offsetX = world.random.nextGaussian() * 0.1;
            double offsetY = world.random.nextGaussian() * 0.1;
            double offsetZ = world.random.nextGaussian() * 0.1;
            world.addParticle(ParticleTypes.LARGE_SMOKE, x, y, z, offsetX, offsetY, offsetZ);
        }
    }
}
