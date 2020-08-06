package com.reesecake.reesemod.items;

import com.reesecake.reesemod.ReeseMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ProteinShake extends Item {
    public ProteinShake() {
        super(new Item.Properties()
                .group(ReeseMod.TAB)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(1.2f)
                        .effect(new EffectInstance(Effects.LEVITATION, 40, 1), 1.0f)
                        .effect(new EffectInstance(Effects.SLOW_FALLING, 60, 1), 1.0f)
                        .meat()
                        .setAlwaysEdible()
                        .build()
                )
        );
    }
}
