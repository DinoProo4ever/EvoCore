package com.dinoproo.evocore;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EvoCore implements ModInitializer {
	public static final String MOD_ID = "evocore";
	public static final Logger LOGGER = LoggerFactory.getLogger("EvoCore");

	@Override
	public void onInitialize() {
		LOGGER.info("[EvoCore] Engine of Vital Origins starting up...");
	}
}