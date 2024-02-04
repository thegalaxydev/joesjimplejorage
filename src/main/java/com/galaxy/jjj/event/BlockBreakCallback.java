package com.galaxy.jjj.event;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.world.InteractionResult;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.core.BlockPos;

public interface BlockBreakCallback {

	Event<BlockBreakCallback> EVENT = EventFactory.createArrayBacked(BlockBreakCallback.class,
			(listeners) -> (level, pos, state, player) -> {
				for (BlockBreakCallback listener : listeners) {
					InteractionResult result = listener.interact(level, pos, state, player);

					if (result != InteractionResult.PASS) {
						return result;
					}
				}

				return InteractionResult.PASS;
			});


	InteractionResult interact(Level level, BlockPos pos, BlockState state, Player player);
}
