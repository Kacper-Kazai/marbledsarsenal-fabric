package dev.kazai.marbledsarsenal;

import dev.kazai.marbledsarsenal.item.MarbledsArsenalCreativeModeTabs;
import dev.kazai.marbledsarsenal.item.MarbledsArsenalItems;
import net.fabricmc.api.ModInitializer;

public class MarbledsArsenal implements ModInitializer {
	public static final String MODID = "marbledsarsenal";

	@Override
	public void onInitialize() {
		MarbledsArsenalItems.register();
		MarbledsArsenalCreativeModeTabs.register();
	}
}