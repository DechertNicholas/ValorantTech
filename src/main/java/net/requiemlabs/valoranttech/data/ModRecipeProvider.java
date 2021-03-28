package net.requiemlabs.valoranttech.data;

import net.minecraft.data.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.requiemlabs.valoranttech.ValorantTech;
import net.requiemlabs.valoranttech.setup.ModBlocks;
import net.requiemlabs.valoranttech.setup.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapeless(ModItems.VALORIUM_INGOT.get(), 9)
                .requires(ModBlocks.VALORIUM_BLOCK.get())
                .unlockedBy("has_item", has(ModItems.VALORIUM_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.VALORIUM_BLOCK.get())
                .define('#', ModItems.VALORIUM_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_item", has(ModItems.VALORIUM_INGOT.get()))
                .save(consumer);

        CookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.VALORIUM_ORE.get()), ModItems.VALORIUM_INGOT.get(), 0.7f, 200)
                .unlockedBy("has_item", has(ModBlocks.VALORIUM_ORE.get()))
                .save(consumer, modId("valorium_ingot_smelting"));

        CookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.VALORIUM_ORE.get()), ModItems.VALORIUM_INGOT.get(), 0.7f, 100)
                .unlockedBy("has_item", has(ModBlocks.VALORIUM_ORE.get()))
                .save(consumer, modId("valorium_ingot_blasting"));
    }

    private static ResourceLocation modId(String path) {
        return new ResourceLocation(ValorantTech.MOD_ID, path);
    }
}
