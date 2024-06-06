package net.tanuv.vunatssololeveling.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.tanuv.vunatssololeveling.VunatsSoloLeveling;

public class ModItemGroups {
    public static final ItemGroup VUNATS_SOLO_LEVELING_GROUP = Registry.register(Registries.ITEM_GROUP,
        new Identifier(VunatsSoloLeveling.MOD_ID, "vunats_solo_leveling"),
        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.vunats_solo_leveling"))
                .icon(() -> new ItemStack(ModItems.KASKAS_VENOM_FANG)).entries(((displayContext, entries) -> {
                    entries.add(ModItems.KASKAS_VENOM_FANG);
                })).build());

    public static void registerItemGroups() {
        VunatsSoloLeveling.LOGGER.info("Registering Item Groups for " + VunatsSoloLeveling.MOD_ID);
    }
}