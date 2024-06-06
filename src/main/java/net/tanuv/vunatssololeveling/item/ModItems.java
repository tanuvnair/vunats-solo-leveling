package net.tanuv.vunatssololeveling.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tanuv.vunatssololeveling.VunatsSoloLeveling;

public class ModItems {
    public static final Item KASKAS_VENOM_FANG = registerItem("kaskas_venom_fang", new SwordItem(ModToolMaterial.KASKA, new SwordItem.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(VunatsSoloLeveling.MOD_ID, name), item);
    }

    public static void registerModItems() {
        VunatsSoloLeveling.LOGGER.info("Registering Mod Items for " + VunatsSoloLeveling.MOD_ID);
    }
}
