package net.requiemlabs.valoranttech.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.requiemlabs.valoranttech.ValorantTech;
import net.requiemlabs.valoranttech.setup.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, ValorantTech.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.VALORIUM_BLOCK.get());
        simpleBlock(ModBlocks.VALORIUM_ORE.get());
    }
}
