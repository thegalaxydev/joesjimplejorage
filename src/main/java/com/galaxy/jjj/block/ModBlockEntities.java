package com.galaxy.jjj.block;

import com.galaxy.jjj.JoesJimpleJorage;
import com.galaxy.jjj.block.inventory_connector.InventoryConnectorEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class ModBlockEntities {
	public static final BlockEntityType<InventoryConnectorEntity> INVENTORY_CONNECTOR_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,new ResourceLocation(JoesJimpleJorage.MOD_ID, "inventory_connector_entity"),
			FabricBlockEntityTypeBuilder.create(InventoryConnectorEntity::new,ModBlocks.INVENTORY_CONNECTOR).build());
}
