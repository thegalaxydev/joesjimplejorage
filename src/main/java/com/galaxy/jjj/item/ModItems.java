package com.galaxy.jjj.item;

import com.galaxy.jjj.JoesJimpleJorage;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static List<Item> ITEMS = new ArrayList<Item>();


    private static void registerCompatItems()
    {

    }


    private static Item registerItem(String name, Item item)
    {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(JoesJimpleJorage.MOD_ID, name), item);
    }
    public static void registerModItems() {
        JoesJimpleJorage.LOGGER.info("Registering mod items for " + JoesJimpleJorage.MOD_ID + "!");
        registerCompatItems();
    }
}
