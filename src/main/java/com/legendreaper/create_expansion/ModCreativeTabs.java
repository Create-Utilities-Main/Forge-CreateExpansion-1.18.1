package com.legendreaper.create_expansion;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTabs {
   public static final CreativeModeTab DEFAULT_TAB = new CreativeModeTab("defaultCreativeTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.WATERING_CAN.get());
        }
    };
    public static final CreativeModeTab ELECTRIC_TAB = new CreativeModeTab("electricCreativeTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.EMPTY_SPOOL.get());
        }
    };
}
 //return new ItemStack(ModItems.WATERING_CAN.get());