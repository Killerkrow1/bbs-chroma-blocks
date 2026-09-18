package net.killerkrow.chroma;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent REVERENCE_COCKTAIL = new FoodComponent.Builder().alwaysEdible().hunger(3).saturationModifier(0.33f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 300), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 300), 1)
            .build();

    public static final FoodComponent REVERENCE_COOKIE = new FoodComponent.Builder().alwaysEdible().hunger(2).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 200), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 300), 1)
            .build();

    public static final FoodComponent REVERENCE_TART = new FoodComponent.Builder().alwaysEdible().hunger(9).saturationModifier(0.67f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 600), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 450), 1)
            .build();

    public static final FoodComponent REVERENCE_TART_SLICE = new FoodComponent.Builder().alwaysEdible().hunger(3).saturationModifier(0.33f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 300), 1)
            .build();

    public static final FoodComponent REVERENCE_TEA = new FoodComponent.Builder().alwaysEdible().hunger(3).saturationModifier(0.33f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 300), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 300), 1)
            .build();

    public static final FoodComponent REVERENCE_WINE = new FoodComponent.Builder().alwaysEdible().hunger(3).saturationModifier(0.33f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 300), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 300), 1)
            .build();

    public static final FoodComponent REVERENCE_SAUCE = new FoodComponent.Builder().alwaysEdible().hunger(4).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 20, 20), 1)
            .build();

    public static final FoodComponent REVERENCE_ROLL = new FoodComponent.Builder().alwaysEdible().hunger(14).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 1200), 1)
            .build();

    public static final FoodComponent REVERENCE_ICE_CREAM = new FoodComponent.Builder().alwaysEdible().hunger(1).saturationModifier(1.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 300), 1)
            .build();

    public static final FoodComponent FRIED_REVERENCE_BERRY = new FoodComponent.Builder().alwaysEdible().hunger(3).saturationModifier(1.67f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 600), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 600), 1)
            .build();

    public static final FoodComponent REVERENCE_CAKE = new FoodComponent.Builder().alwaysEdible().hunger(10).saturationModifier(0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 300), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200), 1)
            .build();

    public static final FoodComponent REVERENCE_CAKE_SLICE = new FoodComponent.Builder().alwaysEdible().hunger(4).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 300), 1)
            .build();

    public static final FoodComponent REVERENCE_CUPCAKE = new FoodComponent.Builder().alwaysEdible().hunger(4).saturationModifier(0.75f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 300), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 300), 1)
            .build();

    public static final FoodComponent REVERENCE_JUICE = new FoodComponent.Builder().alwaysEdible().hunger(7).saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 300), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 300), 1)
            .build();

    public static final FoodComponent REVERENCE_PIE = new FoodComponent.Builder().alwaysEdible().hunger(12).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 600), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 300), 1)
            .build();

    public static final FoodComponent REVERENCE_PIE_SLICE = new FoodComponent.Builder().alwaysEdible().hunger(3).saturationModifier(0.33f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 300), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 60), 1)
            .build();
}