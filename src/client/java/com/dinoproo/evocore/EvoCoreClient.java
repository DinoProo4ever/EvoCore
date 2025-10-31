package com.dinoproo.evocore;

import net.fabricmc.api.ClientModInitializer;

public class EvoCoreClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
        EvoCore.LOGGER.info("[EvoCore] Client initialized.");
	}
}