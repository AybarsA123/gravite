package net.teknoaybi.gravite.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.level.ItemLike;
import net.teknoaybi.gravite.block.ModBlocks;
import net.teknoaybi.gravite.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                List<ItemLike> GRAVITE_SMELTABLES = List.of(ModItems.RAW_GRAVITE);

                oreSmelting(GRAVITE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.GRAVITE, 0.25f, 200, "gravite");
                oreBlasting(GRAVITE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.GRAVITE, 0.25f, 100, "gravite");


                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.GRAVITE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAVITE_BLOCK);
            }
        };
    }

    @Override
    public String getName() {
        return "Gravite Mod Recipes";
    }
}
