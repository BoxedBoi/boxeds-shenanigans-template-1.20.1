package com.github.boxedboi.boxedsshenanigans;

import com.github.boxedboi.boxedsshenanigans.item.ModBlocks;
import com.github.boxedboi.boxedsshenanigans.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BoxedsShenanigans implements ModInitializer {

    public static final String MOD_ID = "boxeds-shenanigans";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.register();
        ModBlocks.register();

        LOGGER.info("I love my fancy netherite armor :)");
    }
}