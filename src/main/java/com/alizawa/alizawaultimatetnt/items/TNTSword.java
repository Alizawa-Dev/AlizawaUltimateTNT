package com.alizawa.alizawaultimatetnt.items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class TNTSword extends Item {


    public TNTSword(Properties properties) {
        super(properties);
    }


    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attcker) {
        attcker.addEffect(new EffectInstance(Effects.MOVEMENT_SPEED, 1));
        target.addEffect(new EffectInstance(Effects.LUCK, 1));
        target.level.explode(attcker, target.getX(), target.getY(), target.getZ(), 2.5F, Explosion.Mode.NONE);
        spawnParticles(attcker.level, target.getX(), target.getY(), target.getZ());
        return super.hurtEnemy(stack, target, attcker);
    }

    private void spawnParticles(World world, double x, double y, double z) {
        for (int i = 0; i < 100; i++) {
            double offsetX = world.random.nextGaussian() * 0.5;
            double offsetY = world.random.nextGaussian() * 0.5;
            double offsetZ = world.random.nextGaussian() * 0.5;
            world.addParticle(ParticleTypes.FLAME, x, y, z, offsetX, offsetY, offsetZ);
        }


    }
}
