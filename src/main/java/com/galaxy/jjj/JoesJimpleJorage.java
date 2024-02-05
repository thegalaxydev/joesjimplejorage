package com.galaxy.jjj;

import com.galaxy.jjj.block.ModBlocks;
import com.galaxy.jjj.event.BlockBreakCallback;
import com.galaxy.jjj.event.BlockPlaceCallback;
import com.galaxy.jjj.item.ModCreativeModeTabs;
import com.galaxy.jjj.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.level.block.Blocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JoesJimpleJorage implements ModInitializer {
	public static final String MOD_ID = "joesjimplejorage";
    public static final Logger LOGGER = LoggerFactory.getLogger("joesjimplejorage");

	@Override
	public void onInitialize() {

//		BlockBreakCallback.EVENT.register((level, pos, state, player) -> {
//			if (level.isClientSide)
//				return InteractionResult.FAIL;
//
//			LOGGER.info("Block broken at " + pos.getX() + ", " + pos.getY() + ", " + pos.getZ());
//			return InteractionResult.PASS;
//		});
//
//		BlockPlaceCallback.EVENT.register((level, pos, state, entity, stack) -> {
//			if (level.isClientSide)
//				return InteractionResult.FAIL;
//
//			LOGGER.info("Block placed at " + pos.getX() + ", " + pos.getY() + ", " + pos.getZ());
//			return InteractionResult.PASS;
//		});


		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModCreativeModeTabs.registerCreativeModeTabs();

		LOGGER.info("Hello Fabric world!");
	}
}