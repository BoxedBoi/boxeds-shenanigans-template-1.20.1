package net.boxedboi.boxedsshenanigans.item;

import net.boxedboi.boxedsshenanigans.BoxedsShenanigans;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item CLOTH = registerItem(new Item(new FabricItemSettings()));

    private static void addItemsToIngridientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(CLOTH);
    }


private static Item registerItem(Item item){
    return Registry.register(Registries.ITEM, new Identifier(BoxedsShenanigans.MOD_ID, "cloth"), item);
}

    public static void registerModItems() {
        BoxedsShenanigans.LOGGER.info("Registering Mod Items for" + BoxedsShenanigans.MOD_ID);
    
ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngridientTabItemGroup);
    }

    }

