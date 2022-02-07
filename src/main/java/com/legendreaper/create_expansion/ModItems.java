package com.legendreaper.create_expansion;

import com.legendreaper.create_expansion.content.items.WateringCanItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

public class ModItems implements IRegisterTools {



    public static void register(IEventBus eventBus) {

        REGISTER_ITEMS.register(eventBus);
    }
    /*Supplier<String> ne = () -> "a";
    Runnable runnable = () -> System.out.println("hell");
    */

    public static final  RegistryObject<Item> EMPTY_SPOOL = IRegisterTools.registerItem("empty_spool", () -> new Item(new Item.Properties().durability(120).tab(ModCreativeTabs.DEFAULT_TAB)), ModCreativeTabs.DEFAULT_TAB);
    public static final RegistryObject<WateringCanItem> WATERING_CAN = IRegisterTools.registerItem("watering_can", () -> new WateringCanItem(new Item.Properties().durability(15).tab(ModCreativeTabs.DEFAULT_TAB)), ModCreativeTabs.DEFAULT_TAB);
}
