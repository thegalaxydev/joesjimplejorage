package com.galaxy.jjj.block.inventory_connector;

import com.galaxy.jjj.block.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class InventoryConnectorEntity extends BlockEntity {
	public InventoryConnectorEntity(BlockPos blockPos, BlockState blockState) {
		super(ModBlockEntities.INVENTORY_CONNECTOR_ENTITY,blockPos, blockState);
	}
}
