package com.alizawa.alizawaultimatetnt.tool;

import com.alizawa.alizawaultimatetnt.util.RegistryHandler;
import net.minecraft.client.renderer.SpriteAwareVertexBuilder;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum AUBItemTier implements IItemTier {

    TNT(4, 300, 15.0F, 3.0F , 16,
            () -> {return Ingredient.of(RegistryHandler.TNT_SWORD.get(), RegistryHandler.TNT_PICKAXE.get());}
    );

    private final int harvestLevel;
    private final int maxUses;
    private final float efficency;
    private final float attackDamage;
    private final int enchantment;
    private final Supplier<Ingredient> repairMaterial;

    AUBItemTier(int harvestLevel,int maxUses,float efficency, float attackDamage,int enchantment, Supplier<Ingredient> repairMaterial){
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.attackDamage = attackDamage;
        this.repairMaterial = repairMaterial;
        this.efficency = efficency;
        this.enchantment = enchantment;

    }


    @Override
    public int getUses() {
        return maxUses;
    }

    @Override
    public float getSpeed() {
        return efficency;
    }

    @Override
    public float getAttackDamageBonus() {
        return attackDamage;
    }

    @Override
    public int getLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantment;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairMaterial.get();
    }
}

