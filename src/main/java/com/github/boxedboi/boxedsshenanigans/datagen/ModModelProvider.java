package com.github.boxedboi.boxedsshenanigans.datagen;

import com.github.boxedboi.boxedsshenanigans.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        /*
        to add another item model generation statement, add a new line like this:
        itemModelGenerator.register(ModItems.ITEM_NAME_ALL_CAPS, Models.MODEL_TYPE_OF_ITEM);
         */
        itemModelGenerator.register(ModItems.CLOTH, Models.GENERATED);
        itemModelGenerator.register(ModItems.SNACKIES, Models.GENERATED);
        itemModelGenerator.register(ModItems.BOTTLE_OF_SNACKIES_JELLY, Models.GENERATED);
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SCARFED_NETHERITE_CHESTPLATE));
    }
}
