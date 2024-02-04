package com.galaxy.jjj.util;

import com.galaxy.jjj.JoesJimpleJorage;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {

        private static TagKey<Block> createTag(String name)
        {
            return TagKey.create(Registries.BLOCK, new ResourceLocation(JoesJimpleJorage.MOD_ID, name));
        }
    }

    public static class Items {
        private static TagKey<Item> createTag(String name)
        {
            return TagKey.create(Registries.ITEM, new ResourceLocation(JoesJimpleJorage.MOD_ID, name));
        }
    }
}
