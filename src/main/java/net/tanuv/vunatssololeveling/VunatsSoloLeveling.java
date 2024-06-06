package net.tanuv.vunatssololeveling;

import net.fabricmc.api.ModInitializer;

import net.tanuv.vunatssololeveling.item.ModItemGroups;
import net.tanuv.vunatssololeveling.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VunatsSoloLeveling implements ModInitializer {
	public static final String MOD_ID = "vunats-solo-leveling";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}