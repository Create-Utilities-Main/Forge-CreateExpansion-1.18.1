package com.legendreaper.create_expansion;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public interface IRegisterTools extends IDefaultResourceLocation {

   //Blocks Register
   DeferredRegister<Block> REGISTER_BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CreateExpansion.MOD_ID);
    DeferredRegister<BlockEntityType<?>> REGISTER_TILE_ENTITIES  = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, CreateExpansion.MOD_ID);
    //Item Register
    DeferredRegister<Item> REGISTER_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateExpansion.MOD_ID);
    //Entities Register
     DeferredRegister<EntityType<?>> REGISTER_ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, CreateExpansion.MOD_ID);
    //SoundsRegister
    DeferredRegister<SoundEvent> REGISTER_SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CreateExpansion.MOD_ID);

     static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = REGISTER_BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    static <T extends Item>RegistryObject<T> registerItem(String name, Supplier<T> item, CreativeModeTab tab) {
        RegistryObject<T> toReturn = REGISTER_ITEMS.register(name, item);
        return toReturn;
    }
    static  ResourceLocation createResourceLocation(String name) {
        ResourceLocation DEFAULT_RESOURCE_LOCATION = new ResourceLocation(CreateExpansion.MOD_ID + name);
        return DEFAULT_RESOURCE_LOCATION;
    }
    static <T extends SoundEvent>RegistryObject<T> registerSound(Supplier<T> soundSupplier, String name) {
        RegistryObject<T> toReturn = REGISTER_SOUNDS.register(name, soundSupplier);
        return toReturn;
    }


   static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        ModItems.REGISTER_ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }
    static <T extends Block> void registerBlockItemTab(String name, RegistryObject<T> block, CreativeModeTab tab) {
        ModItems.REGISTER_ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeTabs.DEFAULT_TAB)));
    }




}
