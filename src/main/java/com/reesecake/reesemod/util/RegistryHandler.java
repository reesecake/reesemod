package com.reesecake.reesemod.util;

import com.reesecake.reesemod.ReeseMod;
import com.reesecake.reesemod.armor.ModArmorMaterial;
import com.reesecake.reesemod.blocks.BlockItemBase;
import com.reesecake.reesemod.blocks.ReeseBlock;
import com.reesecake.reesemod.blocks.ReeseOre;
import com.reesecake.reesemod.blocks.ReeseTorch;
import com.reesecake.reesemod.items.ItemBase;
import com.reesecake.reesemod.items.ProteinShake;
import com.reesecake.reesemod.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.TorchBlock;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ReeseMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ReeseMod.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> REESE_ITEM = ITEMS.register("reese_item", ItemBase::new);
    public static final RegistryObject<ProteinShake> PROTEIN_SHAKE = ITEMS.register("protein_shake", ProteinShake::new);

    // Tools
    public static final RegistryObject<SwordItem> REESE_SWORD = ITEMS.register("reese_sword", () ->
            new SwordItem(ModItemTier.REESE, 2, -2.4F, new Item.Properties().group(ReeseMod.TAB)));

    public static final RegistryObject<PickaxeItem> REESE_PICKAXE = ITEMS.register("reese_pickaxe", () ->
            new PickaxeItem(ModItemTier.REESE, 0, -2.0F, new Item.Properties().group(ReeseMod.TAB)));

    // Armor
    public static final RegistryObject<ArmorItem> REESE_HELMET = ITEMS.register("reese_helmet", () ->
            new ArmorItem(ModArmorMaterial.REESE, EquipmentSlotType.HEAD, new Item.Properties().group(ReeseMod.TAB)));
    public static final RegistryObject<ArmorItem> REESE_CHESTPLATE = ITEMS.register("reese_chestplate", () ->
            new ArmorItem(ModArmorMaterial.REESE, EquipmentSlotType.CHEST, new Item.Properties().group(ReeseMod.TAB)));
    public static final RegistryObject<ArmorItem> REESE_LEGGINGS = ITEMS.register("reese_leggings", () ->
            new ArmorItem(ModArmorMaterial.REESE, EquipmentSlotType.LEGS, new Item.Properties().group(ReeseMod.TAB)));
    public static final RegistryObject<ArmorItem> REESE_BOOTS = ITEMS.register("reese_boots", () ->
            new ArmorItem(ModArmorMaterial.REESE, EquipmentSlotType.FEET, new Item.Properties().group(ReeseMod.TAB)));

    // Blocks
    public static final RegistryObject<Block> REESE_BLOCK = BLOCKS.register("reese_block", ReeseBlock::new);
    public static final RegistryObject<OreBlock> REESE_ORE = BLOCKS.register("reese_ore", ReeseOre::new);
    public static final RegistryObject<Block> REESE_TORCH = BLOCKS.register("reese_torch", ReeseTorch::new);

    // Block Items
    public static final RegistryObject<Item> REESE_BLOCK_ITEM = ITEMS.register("reese_block", () -> new BlockItemBase(REESE_BLOCK.get()));
    public static final RegistryObject<Item> REESE_ORE_ITEM = ITEMS.register("reese_ore", () -> new BlockItemBase(REESE_ORE.get()));
    public static final RegistryObject<Item> REESE_TORCH_ITEM = ITEMS.register("reese_torch", () -> new BlockItemBase(REESE_TORCH.get()));
}
