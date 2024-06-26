package net.succ.succsmod.datagen;

// Import statements for necessary classes from Minecraft and SuccsMod
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.succ.succsmod.SuccsMod;
import net.succ.succsmod.block.ModBlocks;
import net.succ.succsmod.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    // List of smeltable Atherium ores
    public static final List<ItemLike> ATHERIUM_SMELTABLES = List.of(ModBlocks.ATHERIUM_ORE.get(), ModBlocks.DEEPSLATE_ATHERIUM_ORE.get());

    // Constructor for the ModRecipeProvider class
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    // Method to build and register all recipes
    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        // Register smelting and blasting recipes for Atherium ores
        oreBlasting(pWriter, ATHERIUM_SMELTABLES, RecipeCategory.MISC, ModItems.ATHERIUM.get(), 0.25f, 100, "atherium");
        oreSmelting(pWriter, ATHERIUM_SMELTABLES, RecipeCategory.MISC, ModItems.ATHERIUM.get(), 0.25f, 200, "atherium");

        // Register shaped recipe for Atherium Block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ATHERIUM_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ATHERIUM.get())
                .unlockedBy(getHasName(ModItems.ATHERIUM.get()), has(ModItems.ATHERIUM.get()))
                .save(pWriter);

        // Register shaped recipe for Gold Handle
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GOLD_HANDLE.get())
                .pattern("   ")
                .pattern(" G ")
                .pattern(" G ")
                .define('G', Items.GOLD_INGOT)
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                .save(pWriter);

        // Register shaped recipe for Atherium Pickaxe
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ATHERIUM_PICKAXE.get())
                .pattern("AAA")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.ATHERIUM.get())
                .define('S', ModItems.GOLD_HANDLE.get())
                .unlockedBy(getHasName(ModItems.ATHERIUM.get()), has(ModItems.ATHERIUM.get()))
                .save(pWriter);

        // Register shaped recipe for Atherium Axe
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ATHERIUM_AXE.get())
                .pattern("AA ")
                .pattern("AS ")
                .pattern(" S ")
                .define('A', ModItems.ATHERIUM.get())
                .define('S', ModItems.GOLD_HANDLE.get())
                .unlockedBy(getHasName(ModItems.ATHERIUM.get()), has(ModItems.ATHERIUM.get()))
                .save(pWriter);

        // Register shaped recipe for Atherium Shovel
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ATHERIUM_SHOVEL.get())
                .pattern(" A ")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.ATHERIUM.get())
                .define('S', ModItems.GOLD_HANDLE.get())
                .unlockedBy(getHasName(ModItems.ATHERIUM.get()), has(ModItems.ATHERIUM.get()))
                .save(pWriter);

        // Register shaped recipe for Atherium Hoe
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ATHERIUM_HOE.get())
                .pattern("AA ")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.ATHERIUM.get())
                .define('S', ModItems.GOLD_HANDLE.get())
                .unlockedBy(getHasName(ModItems.ATHERIUM.get()), has(ModItems.ATHERIUM.get()))
                .save(pWriter);

        // Register shaped recipe for Atherium Sword
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ATHERIUM_SWORD.get())
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" S ")
                .define('A', ModItems.ATHERIUM.get())
                .define('S', ModItems.GOLD_HANDLE.get())
                .unlockedBy(getHasName(ModItems.ATHERIUM.get()), has(ModItems.ATHERIUM.get()))
                .save(pWriter);

        // Register shapeless recipe to convert Atherium Block back to Atherium items
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ATHERIUM.get(), 9)
                .requires(ModBlocks.ATHERIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.ATHERIUM_BLOCK.get()), has(ModBlocks.ATHERIUM_BLOCK.get()))
                .save(pWriter);
    }

    // Helper method to register smelting recipes for ores
    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_smelting");
    }

    // Helper method to register blasting recipes for ores
    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    // General helper method to register cooking recipes (both smelting and blasting)
    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup)
                    .unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, SuccsMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
