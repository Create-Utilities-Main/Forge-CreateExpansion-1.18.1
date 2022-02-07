package com.legendreaper.create_expansion;

import com.legendreaper.create_expansion.content.blocks.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks implements IRegisterTools  {



    public static final RegistryObject<Block> MECHANICAL_TABLE = IRegisterTools.registerBlock("mechanical_table",
            () -> new MechanicalTableBlock(BlockBehaviour.Properties.of(Material.METAL).strength(12f)), ModCreativeTabs.DEFAULT_TAB);

    public static final RegistryObject<Block> ALTIMETER = IRegisterTools.registerBlock("altimeter",
            () -> new AltimeterBlock(BlockBehaviour.Properties.of(Material.METAL).strength(12f)), ModCreativeTabs.DEFAULT_TAB);

    public static final RegistryObject<Block> IMPULSER = IRegisterTools.registerBlock("impulser",
            () -> new ImpulserBlock(BlockBehaviour.Properties.of(Material.METAL).strength(12f)), ModCreativeTabs.DEFAULT_TAB);

    public static final RegistryObject<Block> PROPELLOR_MOTOR = IRegisterTools.registerBlock("propellor_motor",
            () -> new PropellorMotorBlock(BlockBehaviour.Properties.of(Material.METAL).strength(17f)), ModCreativeTabs.DEFAULT_TAB);

    public static final RegistryObject<Block> NEST_BLOCK = IRegisterTools.registerBlock("nest_block",
            () -> new NestBlock(BlockBehaviour.Properties.of(Material.GRASS).strength(0.2f).sound(SoundType.GRASS)), ModCreativeTabs.DEFAULT_TAB);

    public static final RegistryObject<Block> NEST_BLOCK_SLAB = IRegisterTools.registerBlock("nest_block_slab",
            () -> new NestBlockSlab(BlockBehaviour.Properties.of(Material.GRASS).strength(0.7f).sound(SoundType.GRASS)), ModCreativeTabs.DEFAULT_TAB);

    public static final RegistryObject<Block> PROPELLER = IRegisterTools.registerBlock("propeller",
            () -> new PropellerBlock(BlockBehaviour.Properties.of(Material.METAL).strength(0.2f).sound(SoundType.METAL).noOcclusion()), ModCreativeTabs.DEFAULT_TAB);





    public static void register(IEventBus eventBus) {
        REGISTER_BLOCKS.register(eventBus);
    }
    //public static final RegistryObject<Block> MECHANIC_TABLE;

}
