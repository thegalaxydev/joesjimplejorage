package com.galaxy.jjj.mixin;

import com.galaxy.jjj.event.BlockBreakCallback;
import com.galaxy.jjj.event.BlockPlaceCallback;
import net.fabricmc.api.EnvType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Block.class)
public class BlockMixin {
	@Inject(method = "playerWillDestroy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/player/Player;)V", at = @At("HEAD"))
	private void onBlockRemoved(Level level, BlockPos pos, BlockState state, Player player, CallbackInfo ci)
	{
		InteractionResult result = BlockBreakCallback.EVENT.invoker().interact(level, pos, state, player);
	}

	@Inject(method = "setPlacedBy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)V", at = @At("HEAD"))
	private void onBlockPlaced(Level level, BlockPos pos, BlockState state, LivingEntity entity, ItemStack stack, CallbackInfo ci)
	{
		InteractionResult result = BlockPlaceCallback.EVENT.invoker().interact(level, pos, state, entity, stack);
	}
}
