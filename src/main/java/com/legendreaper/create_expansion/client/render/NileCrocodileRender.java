package com.legendreaper.create_expansion.client.render;

import com.legendreaper.create_expansion.CreateExpansion;
import com.legendreaper.create_expansion.client.model.NileCrocodileModel;
import com.legendreaper.create_expansion.content.entities.NileCrocodileEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;


public class NileCrocodileRender <Type extends NileCrocodileEntity> extends MobRenderer <Type, NileCrocodileModel<Type>> {
    private static final ResourceLocation REGULAR_VARIANT = new ResourceLocation( CreateExpansion.MOD_ID, "textures/entity/nile_crocodile.png");


    public NileCrocodileRender(EntityRendererProvider.Context context) {
        super(context, new NileCrocodileModel(context.getModelSet().bakeLayer(NileCrocodileModel.LAYER_LOCATION)), .2f);
    }


    @Override
    public ResourceLocation getTextureLocation(NileCrocodileEntity entity) {
        return REGULAR_VARIANT;
    }
}