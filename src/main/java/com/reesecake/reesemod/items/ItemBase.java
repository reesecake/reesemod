package com.reesecake.reesemod.items;

import com.reesecake.reesemod.ReeseMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(ReeseMod.TAB));
    }
}
