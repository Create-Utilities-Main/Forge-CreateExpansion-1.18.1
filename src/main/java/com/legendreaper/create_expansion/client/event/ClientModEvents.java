package com.legendreaper.create_expansion.client.event;

import com.legendreaper.create_expansion.CreateExpansion;
import com.legendreaper.create_expansion.ModEntities;
import com.legendreaper.create_expansion.client.model.NileCrocodileModel;
import com.legendreaper.create_expansion.client.render.NileCrocodileRender;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CreateExpansion.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class ClientModEvents {
    private ClientModEvents() {

    }
    @SubscribeEvent
    public static  void clientSetup(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(NileCrocodileModel.LAYER_LOCATION, NileCrocodileModel::createBodyLayer);
    }
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterRenderers event) {
    event.registerEntityRenderer(ModEntities.NILE_CROCODILE.get(), NileCrocodileRender::new);
    }
}
