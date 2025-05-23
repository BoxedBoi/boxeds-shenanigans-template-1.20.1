package com.github.boxedboi.boxedsshenanigans.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent SNACKIES = new FoodComponent.Builder().hunger(5).saturationModifier(0.25f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200), 0.25f).build();
    public static final FoodComponent BOTTLE_OF_SNACKIES_JELLY = new FoodComponent.Builder().hunger(8).saturationModifier(0.23f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200), 1).build();
}

