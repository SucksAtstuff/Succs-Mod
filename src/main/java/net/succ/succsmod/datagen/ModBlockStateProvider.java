package net.succ.succsmod.datagen;

// Import statements for necessary classes from Minecraft, Forge, and SuccsMod
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.succ.succsmod.SuccsMod;
import net.succ.succsmod.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {

    // Constructor for ModBlockStateProvider, takes PackOutput and ExistingFileHelper as parameters
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SuccsMod.MOD_ID, exFileHelper);
    }

    // Override method to register block states and models
    @Override
    protected void registerStatesAndModels() {
        // Register block states and item models for Atherium Block
        blockWithItem(ModBlocks.ATHERIUM_BLOCK);

        // Register block states and item models for Atherium Ore and Deepslate Atherium Ore
        blockWithItem(ModBlocks.ATHERIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_ATHERIUM_ORE);
        blockWithItem(ModBlocks.NETHER_ATHERIUM_ORE);
        blockWithItem(ModBlocks.END_ATHERIUM_ORE);

        // Register block states and item models for Ruby Ore and Deepslate Ruby Ore
        blockWithItem(ModBlocks.RUBY_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockWithItem(ModBlocks.NETHER_RUBY_ORE);
        blockWithItem(ModBlocks.END_RUBY_ORE);

        // Register block states and item models for Ruby Block
        blockWithItem(ModBlocks.RUBY_BLOCK);

        // Register block states and item models for Sapphire Ore and Deepslate Sapphire Ore
        blockWithItem(ModBlocks.SAPPHIRE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.NETHER_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.END_SAPPHIRE_ORE);


        // Register block states and item models for Sapphire Block
        blockWithItem(ModBlocks.SAPPHIRE_BLOCK);

        // Register block states and item models for Sunstone Ore and Deepslate Sunstone Ore
        blockWithItem(ModBlocks.SUNSTONE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SUNSTONE_ORE);
        blockWithItem(ModBlocks.NETHER_SUNSTONE_ORE);
        blockWithItem(ModBlocks.END_SUNSTONE_ORE);

        // Register block states and item models for Sunstone Block
        blockWithItem(ModBlocks.SUNSTONE_BLOCK);

        horizontalBlock(ModBlocks.GEM_POLISHING_TABLE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/gem_polishing_table")));
    }

    // Helper method to register block states and item models for a given block
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        // Calls the simpleBlockWithItem method with the block and its model
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
