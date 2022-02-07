package com.legendreaper.create_expansion;

import com.legendreaper.create_expansion.content.entities.NileCrocodileEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static DeferredRegister<EntityType<?>> REGISTER_ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, CreateExpansion.MOD_ID);

    public static final RegistryObject<EntityType<NileCrocodileEntity>> NILE_CROCODILE = REGISTER_ENTITIES.register("nile_crocodile", () -> EntityType.Builder.of(NileCrocodileEntity::new, MobCategory.CREATURE).sized(2.25F, 0.75F)
            .build(new ResourceLocation(CreateExpansion.MOD_ID, "nile_crocodile").toString()));

    public static void register(IEventBus eventBus) {

        REGISTER_ENTITIES.register(eventBus);
    }

}
