package net.teknoaybi.gravite;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.teknoaybi.gravite.datagen.ModBlockLootTableProvider;
import net.teknoaybi.gravite.datagen.ModBlockTagsProvider;
import net.teknoaybi.gravite.datagen.ModModelProvider;
import net.teknoaybi.gravite.datagen.ModRecipeProvider;

public class GraviteDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModBlockTagsProvider::new);
		pack.addProvider(ModBlockLootTableProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
