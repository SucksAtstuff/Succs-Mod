package net.succ.succsmod.worldgen;

// Import statements for necessary classes from Minecraft and SuccsMod
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.minecraftforge.common.Tags;
import net.succ.succsmod.SuccsMod;
import net.succ.succsmod.block.ModBlocks;
import net.succ.succsmod.util.ModTags;

import java.util.List;

public class ModConfiguredFeatures {

    // Define ResourceKeys for custom configured features (Atherium ore and Deepslate Atherium ore)
    public static final ResourceKey<ConfiguredFeature<?,?>> ATHERIUM_ORE_KEY = registerKey("atherium_ore");
    public static final ResourceKey<ConfiguredFeature<?,?>> DEEPSLATE_ATHERIUM_ORE_KEY = registerKey("deepslate_atherium_ore");
    public static final ResourceKey<ConfiguredFeature<?,?>> NETHER_ATHERIUM_ORE_KEY = registerKey("nether_atherium_ore");
    public static final ResourceKey<ConfiguredFeature<?,?>> END_ATHERIUM_ORE_KEY = registerKey("end_atherium_ore");
    public static final ResourceKey<ConfiguredFeature<?,?>> RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?,?>> DEEPSLATE_RUBY_ORE_KEY = registerKey("deepslate_ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?,?>> NETHER_RUBY_ORE_KEY = registerKey("nether_ruby_ore");

    public static final ResourceKey<ConfiguredFeature<?,?>> SAPPHIRE_ORE_KEY = registerKey("sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?,?>> DEEPSLATE_SAPPHIRE_ORE_KEY = registerKey("deepslate_sapphire_ore");


    // Method to register configured features during the bootstrap phase
    public static void bootstrap(BootstapContext<ConfiguredFeature<?,?>> context) {
        // Define RuleTests for blocks that can be replaced by ores
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceable = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceable = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endStoneReplaceable = new BlockMatchTest(Blocks.END_STONE);

        // Define target block states for Atherium ores
        List<OreConfiguration.TargetBlockState> atheriumOres = List.of(
                OreConfiguration.target(stoneReplaceable, ModBlocks.ATHERIUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_ATHERIUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(netherrackReplaceable, ModBlocks.NETHER_ATHERIUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(endStoneReplaceable, ModBlocks.END_ATHERIUM_ORE.get().defaultBlockState())
        );

        // Register Atherium ore configured feature
        // pSize represents the size of the ore vein (number of blocks)
        register(context, ATHERIUM_ORE_KEY, Feature.ORE, new OreConfiguration(atheriumOres, 3));

        // Register Deepslate Atherium ore configured feature
        // pSize represents the size of the ore vein (number of blocks)
        register(context, DEEPSLATE_ATHERIUM_ORE_KEY, Feature.ORE, new OreConfiguration(atheriumOres, 3));

        // Register Nether Atherium ore configured feature
        // pSize represents the size of the ore vein (number of blocks)
        register(context, NETHER_ATHERIUM_ORE_KEY, Feature.ORE, new OreConfiguration(atheriumOres, 3));

        // Register End Atherium ore configured feature
        // pSize represents the size of the ore vein (number of blocks)
        register(context, END_ATHERIUM_ORE_KEY, Feature.ORE, new OreConfiguration(atheriumOres, 5));


        // Define target block states for Ruby ores
        List<OreConfiguration.TargetBlockState> rubyOres = List.of(
                OreConfiguration.target(stoneReplaceable, ModBlocks.RUBY_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState()),
                OreConfiguration.target(netherrackReplaceable, ModBlocks.NETHER_RUBY_ORE.get().defaultBlockState()),
                OreConfiguration.target(endStoneReplaceable, ModBlocks.END_RUBY_ORE.get().defaultBlockState())
        );

        // Register Ruby ore configured feature
        // pSize represents the size of the ore vein (number of blocks)
        register(context, RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(rubyOres, 6));

        // Register Deepslate Ruby ore configured feature
        // pSize represents the size of the ore vein (number of blocks)
        register(context, DEEPSLATE_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(rubyOres, 4));

        // Register Nether Ruby ore configured feature
        // pSize represents the size of the ore vein (number of blocks)
        register(context, NETHER_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(rubyOres, 8));



        // Define target block states for Sapphire ores
        List<OreConfiguration.TargetBlockState> sapphireOres = List.of(
                OreConfiguration.target(stoneReplaceable, ModBlocks.SAPPHIRE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState()),
                OreConfiguration.target(netherrackReplaceable, ModBlocks.NETHER_SAPPHIRE_ORE.get().defaultBlockState())

        );

        // Register Sapphire ore configured feature
        // pSize represents the size of the ore vein (number of blocks)
        register(context, SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(sapphireOres, 10));

        // Register Deepslate Sapphire ore configured feature
        // pSize represents the size of the ore vein (number of blocks)
        register(context, DEEPSLATE_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(sapphireOres, 8));





    }

    // Utility method to create a ResourceKey for a ConfiguredFeature using the mod ID and a given name
    public static ResourceKey<ConfiguredFeature<?,?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(SuccsMod.MOD_ID, name));
    }

    // Method to register a ConfiguredFeature with the given key, feature, and configuration
    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?,?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?,?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
