package com.mazgamer1.mazores.util;

import com.mazgamer1.mazores.mazores;
import com.mazgamer1.mazores.tools.MazOresItemTier;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.*;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

public class RegistryHandlerTool {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, mazores.MOD_ID);


    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }
    // Tools Coal
    public static final RegistryObject<SwordItem> COAL_SWORD = ITEMS.register("coal_sword", () ->
            new SwordItem(MazOresItemTier.COAL, 2, -2.4F, new Item.Properties().group(mazores.TAB_TOOLS).maxStackSize(1)));

    public static final RegistryObject<PickaxeItem> COAL_PICKAXE = ITEMS.register("coal_pickaxe", () ->
            new PickaxeItem(MazOresItemTier.COAL, 0, 2.8F, new Item.Properties().group(mazores.TAB_TOOLS).maxStackSize(1)));

    public static final RegistryObject<ShovelItem> COAL_SHOVEL = ITEMS.register("coal_shovel", () ->
            new ShovelItem(MazOresItemTier.COAL, 0, -3.0F, new Item.Properties().group(mazores.TAB_TOOLS).maxStackSize(1)));

    public static final RegistryObject<AxeItem> COAL_AXE = ITEMS.register("coal_axe", () ->
            new AxeItem(MazOresItemTier.COAL, 3, -3.0F, new Item.Properties().group(mazores.TAB_TOOLS).maxStackSize(1)));

    public static final RegistryObject<HoeItem> COAL_HOE = ITEMS.register("coal_hoe", () ->
            new HoeItem(MazOresItemTier.COAL, -1.0F, new Item.Properties().group(mazores.TAB_TOOLS).maxStackSize(1)));

    // Tools Ruby
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () ->
            new SwordItem(MazOresItemTier.RUBY, 5, -2.4F, new Item.Properties().group(mazores.TAB_TOOLS).maxStackSize(1)));

    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () ->
            new PickaxeItem(MazOresItemTier.RUBY, 0, 2.8F, new Item.Properties().group(mazores.TAB_TOOLS).maxStackSize(1)));

    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () ->
            new ShovelItem(MazOresItemTier.RUBY, 0, -3.0F, new Item.Properties().group(mazores.TAB_TOOLS).maxStackSize(1)));

    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () ->
            new AxeItem(MazOresItemTier.RUBY, 3, -3.0F, new Item.Properties().group(mazores.TAB_TOOLS).maxStackSize(1)));

    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () ->
            new HoeItem(MazOresItemTier.RUBY, -1.0F, new Item.Properties().group(mazores.TAB_TOOLS).maxStackSize(1)));

}

