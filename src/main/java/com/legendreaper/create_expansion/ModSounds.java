package com.legendreaper.create_expansion;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds implements IRegisterTools {
    private static final ResourceLocation CROCODILE_DEATH_RL = new ResourceLocation("create_expansion:sounds/entity/nile_crocodile.orgg");
   public static RegistryObject<SoundEvent> CROCODILE_DEATH = IRegisterTools.registerSound(() -> new SoundEvent(CROCODILE_DEATH_RL), "entity.nile_crocodile.death");
    public static void register(IEventBus eventBus) {
        REGISTER_SOUNDS.register(eventBus);
    }


}
