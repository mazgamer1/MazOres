package com.mazgamer1.mazores.util;

import com.mazgamer1.mazores.armor.MazOresArmorMaterial;
import com.mazgamer1.mazores.mazores;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandlerArmor {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, mazores.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, mazores.MOD_ID);

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
}
    // Coal

    public static final RegistryObject<ArmorItem> COAL_HELMET = ITEMS.register("coal_helmet", () ->
        new ArmorItem(MazOresArmorMaterial.COAL, EquipmentSlotType.HEAD, new Item.Properties().group(mazores.TAB_ARMOR).maxStackSize(1)));

    public static final RegistryObject<ArmorItem> COAL_CHESTPLATE = ITEMS.register("coal_chestplate", () ->
            new ArmorItem(MazOresArmorMaterial.COAL, EquipmentSlotType.CHEST, new Item.Properties().group(mazores.TAB_ARMOR).maxStackSize(1)));

    public static final RegistryObject<ArmorItem> COAL_LEGGINGS = ITEMS.register("coal_leggings", () ->
            new ArmorItem(MazOresArmorMaterial.COAL, EquipmentSlotType.LEGS, new Item.Properties().group(mazores.TAB_ARMOR).maxStackSize(1)));

    public static final RegistryObject<ArmorItem> COAL_BOOTS= ITEMS.register("coal_boots", () ->
            new ArmorItem(MazOresArmorMaterial.COAL, EquipmentSlotType.FEET, new Item.Properties().group(mazores.TAB_ARMOR).maxStackSize(1)));
    // Ruby

    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet", () ->
            new ArmorItem(MazOresArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(mazores.TAB_ARMOR).maxStackSize(1)));

    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () ->
            new ArmorItem(MazOresArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(mazores.TAB_ARMOR).maxStackSize(1)));

    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () ->
            new ArmorItem(MazOresArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(mazores.TAB_ARMOR).maxStackSize(1)));

    public static final RegistryObject<ArmorItem> RUBY_BOOTS= ITEMS.register("ruby_boots", () ->
            new ArmorItem(MazOresArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(mazores.TAB_ARMOR).maxStackSize(1)));



}
