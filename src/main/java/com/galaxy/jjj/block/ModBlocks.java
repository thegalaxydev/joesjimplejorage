package com.galaxy.jjj.block;

import com.galaxy.jjj.JoesJimpleJorage;
import com.galaxy.jjj.block.inventory_connector.InventoryConnector;
import com.galaxy.jjj.block.inventory_connector.InventoryConnectorEntity;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.material.PushReaction;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    //public static final Block MOON_BLOCK = registerBlock("moon_block",
    //        new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block INVENTORY_CONNECTOR = registerBlock("inventory_connector",
            new InventoryConnector(FabricBlockSettings.create().sound(SoundType.WOOD).strength(2.0f, 3.0f)));

    public static List<Block> BLOCKS = new ArrayList<Block>();

    private static void registerCompatBlocks()
    {

    }

    private static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(JoesJimpleJorage.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block)
    {
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(JoesJimpleJorage.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        registerCompatBlocks();

        BLOCKS.add(INVENTORY_CONNECTOR);

        JoesJimpleJorage.LOGGER.info("Registering mod blocks for " + JoesJimpleJorage.MOD_ID + "!");
    }
}
