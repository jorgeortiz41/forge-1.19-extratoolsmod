package net.jorgeortiz.extratoolsmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab EXTRATOOLS_TAB = new CreativeModeTab("extratoolstab") {
        @Override
        public ItemStack makeIcon() {
            //return crying sword and crying ingots
            return new ItemStack(ModItems.CRYING_INGOT.get());
            
        }
    };

}
