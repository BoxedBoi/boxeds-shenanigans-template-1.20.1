package com.github.boxedboi.boxedsshenanigans.item;

import com.github.boxedboi.boxedsshenanigans.BoxedsShenanigans;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item CLOTH = registerItem("cloth", new Item(new FabricItemSettings()));
    public static final Item SNACKIES = registerItem("snackies", new Item(new FabricItemSettings().food(ModFoodComponents.SNACKIES)));
    public static final Item BOTTLE_OF_SNACKIES_JELLY = registerItem("bottle_of_snackies_jelly", new Item(new FabricItemSettings().food(ModFoodComponents.BOTTLE_OF_SNACKIES_JELLY)));
public static final Item SCARFED_NETHERITE_CHESTPLATE = registerItem("scarfed_netherite_chestplate",
        new ArmorItem(ModArmorMaterials.SCARFED, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(CLOTH);
    }

    private static void addItemsToFoodAndDrinkTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(SNACKIES);
        entries.add(BOTTLE_OF_SNACKIES_JELLY);
    }

    private static void addItemsToCombatTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(SCARFED_NETHERITE_CHESTPLATE);
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
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodAndDrinkTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatTabItemGroup);
    }

}

