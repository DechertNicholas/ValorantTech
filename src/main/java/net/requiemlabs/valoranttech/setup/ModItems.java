package net.requiemlabs.valoranttech.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> VALORIUM_INGOT = Registration.ITEMS.register("valorium_ingot", () ->
        new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static void register() {
    }
}
