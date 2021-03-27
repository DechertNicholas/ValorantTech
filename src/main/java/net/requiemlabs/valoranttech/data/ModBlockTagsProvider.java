package net.requiemlabs.valoranttech.data;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeBlockTagsProvider;
import net.requiemlabs.valoranttech.ValorantTech;
import net.requiemlabs.valoranttech.setup.ModBlocks;
import net.requiemlabs.valoranttech.setup.ModTags;

import javax.annotation.Nullable;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, ValorantTech.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        tag(ModTags.Blocks.ORES_VALORIUM).add(ModBlocks.VALORIUM_ORE.get());
        tag(Tags.Blocks.ORES).addTag(ModTags.Blocks.ORES_VALORIUM);
        tag(ModTags.Blocks.STORAGE_BLOCKS_VALORIUM).add(ModBlocks.VALORIUM_BLOCK.get());
        tag(Tags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_VALORIUM);
    }
}
