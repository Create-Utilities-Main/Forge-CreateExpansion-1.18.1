package com.legendreaper.create_expansion;

import net.minecraft.resources.ResourceLocation;

public interface IDefaultResourceLocation {

    static ResourceLocation createResourceLocation(String name) {
        ResourceLocation DEFAULT_RESOURCE_LOCATION = new ResourceLocation(CreateExpansion.MOD_ID + name);
        return DEFAULT_RESOURCE_LOCATION;
    }

}
