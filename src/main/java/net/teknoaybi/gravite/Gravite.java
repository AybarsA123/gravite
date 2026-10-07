package net.teknoaybi.gravite;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import net.teknoaybi.gravite.block.ModBlocks;
import net.teknoaybi.gravite.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Gravite implements ModInitializer {
	public static final String MOD_ID = "gravite";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
