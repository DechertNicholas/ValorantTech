package net.requiemlabs.valoranttech.data;

import net.minecraft.data.*;
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
    }
}
