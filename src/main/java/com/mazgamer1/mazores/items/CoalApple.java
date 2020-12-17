package com.mazgamer1.mazores.items;

import com.mazgamer1.mazores.mazores;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class CoalApple extends Item {
    public CoalApple() {
        super(new Item.Properties()
                .group(mazores.TAB_FOOD)
                .food(new Food.Builder()
                        .hunger(8)
                        .saturation(1.0F)
                        .effect(()-> new EffectInstance(Effects.HASTE , 7200, 2), 1f)
                        .effect(()-> new EffectInstance(Effects.NAUSEA , 20*20, 0), 1f)
                        .effect(()-> new EffectInstance(Effects.HUNGER , 20*20, 2), 0.1f)
                        .effect(()-> new EffectInstance(Effects.WITHER , 40*20, 2), 0.01f)
                        .setAlwaysEdible()
                        .fastToEat()
                        .build())
        );
    }
}
