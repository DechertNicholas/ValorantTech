package net.requiemlabs.valoranttech.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.requiemlabs.valoranttech.ValorantTech;

import javax.annotation.Nonnull;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ValorantTech.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
//        withExistingParent("valorium_block", modLoc("block/valorium_block"));
//        withExistingParent("valorium_ore", modLoc("block/valorium_ore"));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        getBuilder("valorium_ingot").parent(itemGenerated).texture("layer0", "item/valorium_ingot");
    }
}
