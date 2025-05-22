package com.github.boxedboi.boxedsshenanigans.item;

import com.github.boxedboi.boxedsshenanigans.BoxedsShenanigans;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    /**
     * Register a {@link Block} in the registry.
     * @param id {@link String} to use as an id in the registry
     * @param block {@link Block} to put in the registry
     * @return the {@link Block} registered
     */
    private static Block registerBlock(String id, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(BoxedsShenanigans.MOD_ID, id), block);
    }

    public static void register() {
        BoxedsShenanigans.LOGGER.info("Registering Mod Blocks for " + BoxedsShenanigans.MOD_ID);
    }

}

