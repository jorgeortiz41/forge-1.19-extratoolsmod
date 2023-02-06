package net.jorgeortiz.extratoolsmod.item;

import net.jorgeortiz.extratoolsmod.ExtraToolsMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExtraToolsMod.MOD_ID);

    //d800ff(216,0,255)"purple", af00ff(175,0,255)"pink",
    public static final RegistryObject<Item> RAW_CRYING_OBSIDIAN = ITEMS.register("raw_crying_obsidian",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EXTRATOOLS_TAB)));


    public static final RegistryObject<Item> CRYING_INGOT = ITEMS.register("crying_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EXTRATOOLS_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
