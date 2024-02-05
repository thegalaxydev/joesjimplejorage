package com.galaxy.jjj;

import com.galaxy.jjj.datagen.ModBlockTagProvider;
import com.galaxy.jjj.datagen.ModItemTagProvider;
import com.galaxy.jjj.datagen.ModModelProvider;
import com.galaxy.jjj.datagen.ModLootTableProvider;
import com.galaxy.jjj.datagen.ModRecipeProvider;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class JoesJimpleJorageDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
