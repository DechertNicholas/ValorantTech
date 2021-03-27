package net.requiemlabs.valoranttech.setup;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.requiemlabs.valoranttech.ValorantTech;

public class ModTags {
    public static final class Blocks {
        public static final ITag.INamedTag<Block> ORES_VALORIUM = forge("ores/valorium");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_VALORIUM = forge("storage_blocks/valorium");

        private static ITag.INamedTag<Block> forge(String path) {
            return BlockTags.createOptional(new ResourceLocation("forge", path));
        }

        private static ITag.INamedTag<Block> mod(String path) {
            return BlockTags.createOptional(new ResourceLocation(ValorantTech.MOD_ID, path));
        }
    }

    public static final class Items {
        public static final ITag.INamedTag<Item> ORES_VALORIUM = forge("ores/valorium");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_VALORIUM = forge("storage_blocks/valorium");
        public static final ITag.INamedTag<Item>  INGOTS_VALORIUM = forge("ingots/valorium");

        private static ITag.INamedTag<Item> forge(String path) {
            return ItemTags.createOptional(new ResourceLocation("forge", path));
        }

        private static ITag.INamedTag<Item> mod(String path) {
            return ItemTags.createOptional(new ResourceLocation(ValorantTech.MOD_ID, path));
        }
    }
}
