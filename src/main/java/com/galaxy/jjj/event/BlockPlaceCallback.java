package com.galaxy.jjj.event;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public interface BlockPlaceCallback {
	Event<BlockPlaceCallback> EVENT = EventFactory.createArrayBacked(BlockPlaceCallback.class,
			(listeners) -> (level, pos, state, entity, stack) -> {
				for (BlockPlaceCallback listener : listeners) {
					InteractionResult result = listener.interact(level, pos, state, entity, stack);

					if (result != InteractionResult.PASS) {
						return result;
					}
				}

				return InteractionResult.PASS;
			});


	InteractionResult interact(Level level, BlockPos pos, BlockState state, LivingEntity entity, ItemStack stack);
}
