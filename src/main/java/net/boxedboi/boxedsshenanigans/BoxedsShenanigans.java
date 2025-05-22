package net.boxedboi.boxedsshenanigans;

import net.boxedboi.boxedsshenanigans.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BoxedsShenanigans implements ModInitializer {
	public static final String MOD_ID = "boxedshenanigans";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

		LOGGER.info("I love my fancy netherite armor :)");
	}
}