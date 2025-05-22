package com.github.boxedboi.boxedsshenanigans.item;

import com.github.boxedboi.boxedsshenanigans.BoxedsShenanigans;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item CLOTH = registerItem("cloth", new Item(new FabricItemSettings()));


    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(CLOTH);
    }

    /**
     * Register an {@link Item} in the registry.
     * @param id {@link String} to use as an id in the registry
     * @param item {@link Item} to put in the registry
     * @return the {@link Item} registered
     */
    private static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BoxedsShenanigans.MOD_ID, id), item);
    }

    public static void register() {
        BoxedsShenanigans.LOGGER.info("Registering Mod Items for " + BoxedsShenanigans.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }

}

