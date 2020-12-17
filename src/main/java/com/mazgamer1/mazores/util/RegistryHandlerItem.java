package com.mazgamer1.mazores.util;

import com.mazgamer1.mazores.items.CoalApple;
import com.mazgamer1.mazores.items.ItemBase;
import com.mazgamer1.mazores.items.RubyApple;
import com.mazgamer1.mazores.mazores;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandlerItem {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, mazores.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items, to create another item, add it here, then go to en_us.json template: public static final RegistryObject<Item> [ITEM NAME] = ITEMS.register("[ITEM NAME]", ItemBase::new);
    public static final RegistryObject<Item> COAL_NUGGET = ITEMS.register("coal_nugget", ItemBase::new);
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<CoalApple> COAL_APPLE = ITEMS.register("coal_apple", CoalApple::new);
    public static final RegistryObject<RubyApple> RUBY_APPLE = ITEMS.register("ruby_apple", RubyApple::new);

}
