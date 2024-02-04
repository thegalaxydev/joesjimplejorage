package com.galaxy.jjj.item;

import com.galaxy.jjj.JoesJimpleJorage;
import com.galaxy.jjj.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

public class ModCreativeModeTabs {
    public static CreativeModeTab TO_THE_MOON = null;
    public static void registerCreativeModeTabs()
    {
        TO_THE_MOON = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
                new ResourceLocation(JoesJimpleJorage.MOD_ID, "joesjimplejorage"),
                FabricItemGroup.builder().title(Component.translatable("tab.joesjimplejorage")).displayItems(((itemDisplayParameters, output) -> {
                            for (Item item : ModItems.ITEMS)
                            {
                                output.accept(item);
                            }

                            for (Block block : ModBlocks.BLOCKS)
                            {
                                output.accept(block);
                            }
                        }))
                        .build());

        JoesJimpleJorage.LOGGER.info("Registering creative mode tabs for " + JoesJimpleJorage.MOD_ID + "!");
    }
}
