package com.alizawa.alizawaultimatetnt.blocks;

import com.alizawa.alizawaultimatetnt.entity.DragonBreathTNTEntity;
import com.alizawa.alizawaultimatetnt.util.RegistryHandler;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.LivingEntity;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class DragonBreathTNT extends TNTBlock  {
    public DragonBreathTNT(Properties properties) {
        super(AbstractBlock.Properties.of(Material.EXPLOSIVE)
                .instabreak()
                .sound(SoundType.GRASS)
                .lightLevel(value -> 25)
                .strength(4.0F, 5.0F)

        );


    }
    @Override
    public void catchFire(BlockState state, World world, BlockPos pos, Direction direction, @Nullable LivingEntity igniter){
        if (!world.isClientSide()) {
            DragonBreathTNTEntity entity = new DragonBreathTNTEntity(RegistryHandler.DRAGON_BREATH_TNT_ENTITY.get(), world);
            entity.setPos(pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5);
            world.addFreshEntity(entity);
            world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.TNT_PRIMED, SoundCategory.BLOCKS, 1.0F, 1.0F);
            world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.ENDER_DRAGON_GROWL, SoundCategory.BLOCKS, 2.0F, 2.0F);
            world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.ENDER_DRAGON_AMBIENT, SoundCategory.BLOCKS, 2.0F, 2.0F);
            spawnParticles(world, pos.getX(), pos.getY() + 0.5, pos.getZ() + 0.02);
        }
        {
            spawnParticles(world, pos.getX(), pos.getY() + 1.0, pos.getZ() + 0.08);
            explode(world, pos);
            spawnParticles(world, pos.getX(), pos.getY() + 1.5, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 1.2, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 1.5, pos.getZ());
            spawnParticles(world, pos.getX()  , pos.getY() + 1.5, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 2.0, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 2.0, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 1.0, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 1.0, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 1.0, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 2.0, pos.getZ());
            spawnParticles2(world, pos.getX() , pos.getY() + 10.0, pos.getZ());
            spawnParticles2(world, pos.getX() , pos.getY() + 10.0, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 4.0, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 5.0, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 6.0, pos.getZ());
            spawnParticles2(world, pos.getX() , pos.getY() + 7.0, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 12.0, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 13.0, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 14.0, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 15.0, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 18.0, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 20.0, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 22.0, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 24.0, pos.getZ() );
            spawnParticles2(world, pos.getX() , pos.getY() + 0.1, pos.getZ() );
            spawnParticles(world, pos.getX() , pos.getY() + 0.1, pos.getZ() );
            spawnParticles(world, pos.getX() , pos.getY() + 1.0, pos.getZ() );
            spawnParticles(world, pos.getX() , pos.getY() + 1.0, pos.getZ() );
            spawnParticles(world, pos.getX() , pos.getY() + 2.0, pos.getZ() );
            spawnParticles(world, pos.getX() , pos.getY() + 2.0, pos.getZ() );
            spawnParticles(world, pos.getX() , pos.getY() + 3.0, pos.getZ() );
            spawnParticles(world, pos.getX() , pos.getY() + 3.0, pos.getZ() );
            spawnParticles(world, pos.getX() , pos.getY() + 5.0, pos.getZ() );
            spawnParticles(world, pos.getX() , pos.getY() + 5.0, pos.getZ() );
            spawnParticles(world, pos.getX() , pos.getY() + 0.1, pos.getZ() );
            spawnParticles(world, pos.getX() , pos.getY() + 0.1, pos.getZ() );
            spawnParticles(world, pos.getX() , pos.getY() + 0.5, pos.getZ() );
            spawnParticles(world, pos.getX() , pos.getY() + 0.5, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 1.0, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 1.0, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 2.0, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 2.0, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 4.0, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 4.0, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 6.0, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 6.0, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 8.0, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 10.0, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 12.0, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 14.0, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 16.0, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 18.0, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 20.0, pos.getZ());
            spawnParticles(world, pos.getX() , pos.getY() + 22.0, pos.getZ());

        }
    }
        // 生成粒子效果

    private void spawnParticles(World world, double x, double y, double z) {
        for (int i = 0; i < 1000; i++) {
            double offsetX = world.random.nextGaussian() * 0.5;
            double offsetY = world.random.nextGaussian() * 0.5;
            double offsetZ = world.random.nextGaussian() * 0.5;
            world.addParticle(ParticleTypes.DRAGON_BREATH, x, y, z, offsetX, offsetY, offsetZ);
            world.addParticle(ParticleTypes.FLAME, x, y, z, offsetX, offsetY, offsetZ);
            world.addParticle(ParticleTypes.LAVA, x, y, z, offsetX, offsetY, offsetZ);
            world.addParticle(ParticleTypes.WITCH, x, y, z, offsetX, offsetY, offsetZ);
        }
    }
    private void spawnParticles2(World world, double x, double y, double z) {
        for (int i = 0; i < 800; i++) {
            double offsetX = world.random.nextGaussian() * 0.5;
            double offsetY = world.random.nextGaussian() * 0.5;
            double offsetZ = world.random.nextGaussian() * 0.5;
            world.addParticle(ParticleTypes.LARGE_SMOKE, x, y, z, offsetX, offsetY, offsetZ);
            world.addParticle(ParticleTypes.CLOUD, x, y, z, offsetX, offsetY, offsetZ);
            world.addParticle(ParticleTypes.LAVA, x, y, z, offsetX, offsetY, offsetZ);
        }
    }
}

