package com.legendreaper.create_expansion;

import com.legendreaper.create_expansion.client.render.NileCrocodileRender;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CreateExpansion.MOD_ID)
public class CreateExpansion
{
   public static final RenderType cutoutRenderType = RenderType.cutout();
    public static final String MOD_ID = "create_expansion";

    private static final Logger LOGGER = LogManager.getLogger();

    public CreateExpansion() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModBlocks.register(eventBus);
        ModItems.register(eventBus);
        ModEntities.register(eventBus);
        eventBus.addListener(this::setup);
         ModSounds.register(eventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        RenderType translucentRenderType = RenderType.translucent();



        ItemBlockRenderTypes.setRenderLayer(ModBlocks.NEST_BLOCK.get(), cutoutRenderType);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PROPELLOR_MOTOR.get(), cutoutRenderType);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ALTIMETER.get(), cutoutRenderType);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.NEST_BLOCK_SLAB.get(), cutoutRenderType);
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MECHANICAL_TABLE.get(), cutoutRenderType);

        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }


    @SubscribeEvent
    public static void onRegisterRenderer(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.NILE_CROCODILE.get(), NileCrocodileRender::new);
    }



}
