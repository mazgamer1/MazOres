package com.mazgamer1.mazores.armor;

import com.mazgamer1.mazores.mazores;
import com.mazgamer1.mazores.util.RegistryHandlerItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum MazOresArmorMaterial  implements IArmorMaterial {
    COAL(mazores.MOD_ID + ":coal", 1, new int[] { 3, 4, 5 , 2}, 18,
            SoundEvents.BLOCK_ANVIL_FALL, 0.0F , () -> {return Ingredient.fromItems(Items.COAL_BLOCK);}),

    RUBY(mazores.MOD_ID + ":ruby", 1, new int[] { 5, 7, 6 , 3}, 20,
    SoundEvents.BLOCK_ANVIL_FALL, 1.0F , () -> {return Ingredient.fromItems(RegistryHandlerItem.RUBY.get());});

    private static final int[] MAX_DAMAGE_ARRAY = new int[] { 2, 4, 3, 1};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmoutArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;

    MazOresArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmoutArray, int enchantability, SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial) {

        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmoutArray = damageReductionAmoutArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
    }
    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex() * this.maxDamageFactor];
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmoutArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.get();
    }
    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }
}
