package com.galaxy.jjj.block;

import com.galaxy.jjj.JoesJimpleJorage;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    //public static final Block MOON_BLOCK = registerBlock("moon_block",
    //        new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static List<Block> BLOCKS = new ArrayList<Block>() {};

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
        JoesJimpleJorage.LOGGER.info("Registering mod blocks for " + JoesJimpleJorage.MOD_ID + "!");
    }
}
