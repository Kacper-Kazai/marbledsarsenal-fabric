package dev.kazai.marbledsarsenal;

import dev.kazai.marbledsarsenal.item.client.MarbledsArsenalClientItems;
import net.fabricmc.api.ClientModInitializer;

public class MarbledsArsenalClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		MarbledsArsenalClientItems.register();
	}
}