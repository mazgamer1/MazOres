package com.mazgamer1.mazores;

import com.mazgamer1.mazores.util.RegistryHandlerArmor;
import com.mazgamer1.mazores.util.RegistryHandlerBlock;
import com.mazgamer1.mazores.util.RegistryHandlerItem;
import com.mazgamer1.mazores.util.RegistryHandlerTool;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod ("mazores")
public class mazores
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "mazores";

    public mazores() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandlerItem.init();
        RegistryHandlerBlock.init();
        RegistryHandlerTool.init();
        RegistryHandlerArmor.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) { }

    private void doClientStuff(final FMLClientSetupEvent event) { }

    public static final ItemGroup TAB_MISC = new ItemGroup("mazorestab") {
        @Override
        public ItemStack createIcon() { return new ItemStack(RegistryHandlerItem.COAL_NUGGET.get()); }
    };
    public static final ItemGroup TAB_ARMOR = new ItemGroup("mazorestabar") {
        @Override
        public ItemStack createIcon() { return new ItemStack(RegistryHandlerArmor.COAL_CHESTPLATE.get()); }
    };
    public static final ItemGroup TAB_TOOLS = new ItemGroup("mazorestabtool") {
        @Override
        public ItemStack createIcon() { return new ItemStack(RegistryHandlerTool.COAL_SWORD.get()); }
    };
    public static final ItemGroup TAB_FOOD = new ItemGroup("mazorestabfood") {
        @Override
        public ItemStack createIcon() { return new ItemStack(RegistryHandlerItem.COAL_APPLE.get()); }
    };
}
