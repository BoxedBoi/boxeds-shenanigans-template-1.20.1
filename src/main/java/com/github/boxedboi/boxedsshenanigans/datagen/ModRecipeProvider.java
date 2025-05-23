package com.github.boxedboi.boxedsshenanigans.datagen;

import com.github.boxedboi.boxedsshenanigans.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CLOTH, 1)
                .pattern("###")
                .pattern("#R#")
                .pattern("###")
                .input('#', Items.STRING)
                .input('R', Items.RED_DYE)
                .criterion(hasItem(Items.STRING), conditionsFromItem(Items.STRING))
                .criterion(hasItem(Items.RED_DYE), conditionsFromItem(Items.RED_DYE))
                .criterion(hasItem(ModItems.CLOTH), conditionsFromItem(ModItems.CLOTH))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CLOTH)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.SNACKIES, 3)
                .pattern("###")
                .pattern("#R#")
                .pattern("###")
                .input('#', Items.SUGAR)
                .input('R', Items.RED_DYE)
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
                .criterion(hasItem(Items.RED_DYE), conditionsFromItem(Items.RED_DYE))
                .criterion(hasItem(ModItems.SNACKIES), conditionsFromItem(ModItems.SNACKIES))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SNACKIES)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.SCARFED_NETHERITE_CHESTPLATE, 1)
                .pattern(" # ")
                .pattern(" N ")
                .pattern("   ")
                .input('#', ModItems.CLOTH)
                .input('N', Items.NETHERITE_CHESTPLATE)
                .criterion(hasItem(ModItems.CLOTH), conditionsFromItem(ModItems.CLOTH))
                .criterion(hasItem(Items.NETHERITE_CHESTPLATE), conditionsFromItem(Items.NETHERITE_CHESTPLATE))
                .criterion(hasItem(ModItems.SCARFED_NETHERITE_CHESTPLATE), conditionsFromItem(ModItems.SCARFED_NETHERITE_CHESTPLATE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SCARFED_NETHERITE_CHESTPLATE)));




        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.BOTTLE_OF_SNACKIES_JELLY,1)
                .input(Items.GLASS_BOTTLE)
                .input(ModItems.SNACKIES)
                .criterion(hasItem(ModItems.SNACKIES) ,conditionsFromItem(ModItems.SNACKIES))
                .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(Items.GLASS_BOTTLE))
                .criterion(hasItem(ModItems.BOTTLE_OF_SNACKIES_JELLY), conditionsFromItem(ModItems.BOTTLE_OF_SNACKIES_JELLY))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.BOTTLE_OF_SNACKIES_JELLY)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, Items.NETHERITE_CHESTPLATE,1)
                .input(ModItems.SCARFED_NETHERITE_CHESTPLATE)
                .criterion(hasItem(ModItems.SCARFED_NETHERITE_CHESTPLATE), conditionsFromItem(ModItems.SCARFED_NETHERITE_CHESTPLATE))
                .offerTo(exporter,new Identifier(getRecipeName(Items.NETHERITE_CHESTPLATE)));
    }

    public static void offerCustomUpgradeRecipe(Consumer<RecipeJsonProvider> exporter, Item input, RecipeCategory category, Item result, Item template, Item material) {
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(template), Ingredient.ofItems(input), Ingredient.ofItems(material), category, result
                )
                .criterion(hasItem(material), conditionsFromItem(material))
                .offerTo(exporter, getItemPath(result) + "_smithing");
    }



















}
