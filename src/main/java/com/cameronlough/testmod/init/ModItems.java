package com.cameronlough.testmod.init;

import com.cameronlough.testmod.TestMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ForgeRegistries;

import java.rmi.registry.Registry;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);

    public static RegistryObject<Item> HAMMER = ITEMS.register("hammer",
            () -> new Item(new Item.Properties().group(ModItemGroup.instance)));

    public static class ModItemGroup extends ItemGroup {
        public static final ModItemGroup instance = new ModItemGroup(ItemGroup.GROUPS.length,"testmod");
        private ModItemGroup(int index, String label){
            super(index,label);
        }
        @Override
        public ItemStack createIcon() {
            return new ItemStack(HAMMER.get());
        }
    }

}
