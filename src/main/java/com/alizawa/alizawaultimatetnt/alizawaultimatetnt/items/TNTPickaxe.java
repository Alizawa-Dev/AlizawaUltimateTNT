package com.alizawa.alizawaultimatetnt.items;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class TNTPickaxe extends Item {
    public TNTPickaxe(Properties properties) {
        super(properties);
    }

    //镐子打人也会爆炸，但是过于逆天，所以全部注释掉了
    //@Override
    //public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attcker) {
    //    attcker.addEffect(new EffectInstance(Effects.MOVEMENT_SPEED, 5));
    //    target.addEffect(new EffectInstance(Effects.LUCK, 1));
    //    target.level.explode(attcker, target.getX(), target.getY(), target.getZ(), 3.0F, Explosion.Mode.BREAK);
    //    spawnParticles(target.level, target.getX() , target.getY(), target.getZ());
    //    return super.hurtEnemy(stack, target, attcker);
    //}
    @Override
    public boolean canAttackBlock(BlockState state, World world, BlockPos pos, PlayerEntity playerEntity) {
        playerEntity.level.explode(playerEntity, pos.getX(), pos.getY(), pos.getZ(), 4.0F, Explosion.Mode.DESTROY);
        spawnParticles(playerEntity.level, pos.getX(), pos.getY(), pos.getZ());
        spawnParticles2(playerEntity.level, pos.getX(), pos.getY(), pos.getZ());
        return !playerEntity.isUsingItem();
    }
    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attcker) {
        attcker.addEffect(new EffectInstance(Effects.MOVEMENT_SPEED, 2, 2));
        target.addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 2, 1));
        spawnParticles(attcker.level, target.getX(), target.getY(), target.getZ());
        return super.hurtEnemy(stack, target, attcker);
    }


    public void spawnParticles(World world, double x, double y, double z) {
        for (int i = 0; i < 100; i++) {
            double offsetX = world.random.nextGaussian() * 0.5;
            double offsetY = world.random.nextGaussian() * 0.5;
            double offsetZ = world.random.nextGaussian() * 0.5;
            world.addParticle(ParticleTypes.SMOKE, x, y, z, offsetX, offsetY, offsetZ);
            world.addParticle(ParticleTypes.LAVA, x, y, z, offsetX, offsetY, offsetZ);
        }
    }

    public void spawnParticles2(World world, double x, double y, double z) {
        for (int i = 0; i < 100; i++) {
            double offsetX = world.random.nextGaussian() * 0.5;
            double offsetY = world.random.nextGaussian() * 0.5;
            double offsetZ = world.random.nextGaussian() * 0.5;
            world.addParticle(ParticleTypes.FLAME, x, y, z, offsetX, offsetY, offsetZ);
        }
    }
}
