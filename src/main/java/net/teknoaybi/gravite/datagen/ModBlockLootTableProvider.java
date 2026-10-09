package net.teknoaybi.gravite.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.teknoaybi.gravite.block.ModBlocks;
import net.teknoaybi.gravite.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider {
    public ModBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {
        dropSelf(ModBlocks.GRAVITE_BLOCK);

        add(ModBlocks.GRAVITE_ORE, createOreDrop(ModBlocks.GRAVITE_ORE, ModItems.RAW_GRAVITE));
    }
}
