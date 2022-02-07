package com.legendreaper.create_expansion;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class ModTileEntities {

    public static BlockEntityType registerTileEntity(BlockEntityType.Builder builder, String entityName){
        ResourceLocation nameLoc = new ResourceLocation(CreateExpansion.MOD_ID, entityName);
        return (BlockEntityType) builder.build(null).setRegistryName(nameLoc);
    }

}

