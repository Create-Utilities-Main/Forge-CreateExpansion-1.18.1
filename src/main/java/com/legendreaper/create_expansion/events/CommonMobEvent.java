package com.legendreaper.create_expansion.events;

import com.legendreaper.create_expansion.CreateExpansion;
import com.legendreaper.create_expansion.ModEntities;
import com.legendreaper.create_expansion.content.entities.NileCrocodileEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;



@Mod.EventBusSubscriber(modid = CreateExpansion.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonMobEvent {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
      event.put(ModEntities.NILE_CROCODILE.get(), NileCrocodileEntity.createAttributes().build());
    }
}
