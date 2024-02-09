package com.alizawa.alizawaultimatetnt.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class NetherWand extends Item {
    public NetherWand(Properties properties) {
        super(properties);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attcker) {
        target.addEffect(new EffectInstance(Effects.LEVITATION, 25, 3));
        target.addEffect(new EffectInstance(Effects.DIG_SLOWDOWN, 25, 2));
        target.addEffect(new EffectInstance(Effects.WITHER,25,8));
        spawnParticles(attcker.level, target.getX(), target.getY(), target.getZ());
        return super.hurtEnemy(stack, target, attcker);
    }

    public void spawnParticles(World world, double x, double y, double z) {
        for (int i = 0; i < 200; i++) {
            double offsetX = world.random.nextGaussian() * 0.5;
            double offsetY = world.random.nextGaussian() * 0.5;
            double offsetZ = world.random.nextGaussian() * 0.5;
            world.addParticle(ParticleTypes.WITCH, x, y, z, offsetX, offsetY, offsetZ);
        }
    }
}
