package com.galaxy.jjj.block.inventory_connector;

import com.galaxy.jjj.JoesJimpleJorage;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import com.tom.storagemod.StorageMod;

public class InventoryConnector extends BaseEntityBlock implements EntityBlock {

    public InventoryConnector(Properties props) {
        super(props);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return null;
    }
}
