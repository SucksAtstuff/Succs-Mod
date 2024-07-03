package net.succ.succsmod.item;

// Import statements for necessary classes from Minecraft, Forge, and SuccsMod

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.succ.succsmod.SuccsMod;
import net.succ.succsmod.item.custom.*;

public class ModItems {

    // Create a DeferredRegister for items, using the mod ID
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SuccsMod.MOD_ID);

    // Register the Atherium items
    public static final RegistryObject<Item> DIRTY_ATHERIUM = ITEMS.register("dirty_atherium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ATHERIUM = ITEMS.register("atherium",
            () -> new Item(new Item.Properties()));

    // Register the Sunstone items
    public static final RegistryObject<Item> DIRTY_SUNSTONE = ITEMS.register("dirty_sunstone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SUNSTONE = ITEMS.register("sunstone",
            () -> new Item(new Item.Properties()));

    // Register the Ruby items
    public static final RegistryObject<Item> DIRTY_RUBY = ITEMS.register("dirty_ruby",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));

    // Register the Sapphire items
    public static final RegistryObject<Item> DIRTY_SAPPHIRE = ITEMS.register("dirty_sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

    // Register the Rock Candy item with food properties
    public static final RegistryObject<Item> ROCK_CANDY = ITEMS.register("rock_candy",
            () -> new Item(new Item.Properties().food(ModFoods.ROCK_CANDY)));

    // Register the Rock item
    public static final RegistryObject<Item> ROCK = ITEMS.register("rock",
            () -> new Item(new Item.Properties().food(ModFoods.ROCK)));

    // Register the Gold Handle item
    public static final RegistryObject<Item> GOLD_HANDLE = ITEMS.register("gold_handle",
            () -> new Item(new Item.Properties()));

    // Register the Atherium Sword item
    public static final RegistryObject<Item> ATHERIUM_SWORD = ITEMS.register("atherium_sword",
            () -> new SwordItem(ModToolTiers.ATHERIUM, 4, -2.4F, new Item.Properties()));

    // Register the Atherium Pickaxe item
    public static final RegistryObject<Item> ATHERIUM_PICKAXE = ITEMS.register("atherium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ATHERIUM, 2, -2.8F, new Item.Properties()));

    // Register the Atherium Axe item
    public static final RegistryObject<Item> ATHERIUM_AXE = ITEMS.register("atherium_axe",
            () -> new AxeItem(ModToolTiers.ATHERIUM, 7, -3F, new Item.Properties()));

    // Register the Atherium Shovel item
    public static final RegistryObject<Item> ATHERIUM_SHOVEL = ITEMS.register("atherium_shovel",
            () -> new ShovelItem(ModToolTiers.ATHERIUM, 2, -3F, new Item.Properties()));

    // Register the Atherium Hoe item
    public static final RegistryObject<Item> ATHERIUM_HOE = ITEMS.register("atherium_hoe",
            () -> new HoeItem(ModToolTiers.ATHERIUM, -4, 1F, new Item.Properties()));

    // Register the Atherium Hammer item
    public static final RegistryObject<Item> ATHERIUM_HAMMER = ITEMS.register("atherium_hammer",
            () -> new HammerItem(ModToolTiers.ATHERIUM, 10, -3.5F, new Item.Properties()));

    // Register the Atherium Paxel item
    public static final RegistryObject<Item> ATHERIUM_PAXEL = ITEMS.register("atherium_paxel",
            () -> new PaxelItem(ModToolTiers.ATHERIUM, 2, -2.5F, new Item.Properties()));

    // Register the Ruby Sword item
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModToolTiers.RUBY, 3, -2.4F, new Item.Properties()));

    // Register the Ruby Pickaxe item
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RUBY, 2, -2.8F, new Item.Properties()));

    // Register the Ruby Axe item
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModToolTiers.RUBY, 6, -3F, new Item.Properties()));

    // Register the Ruby Shovel item
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModToolTiers.RUBY, 2, -3F, new Item.Properties()));

    // Register the Ruby Hoe item
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ModToolTiers.RUBY, -3, 1F, new Item.Properties()));

    // Register the Sapphire Sword item
    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new LootingSwordItem(ModToolTiers.SAPPHIRE, 3, -2.4F, new Item.Properties()));

    // Register the Sapphire Pickaxe item
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new LootingPickaxeItem(ModToolTiers.SAPPHIRE, 2, -2.8F, new Item.Properties()));

    // Register the Sapphire Axe item
    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(ModToolTiers.SAPPHIRE, 6, -3F, new Item.Properties()));

    // Register the Sapphire Shovel item
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(ModToolTiers.SAPPHIRE, 2, -3F, new Item.Properties()));

    // Register the Sapphire Hoe item
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(ModToolTiers.SAPPHIRE, -3, 1F, new Item.Properties()));

    // Register the Sunstone Sword item
    public static final RegistryObject<Item> SUNSTONE_SWORD = ITEMS.register("sunstone_sword",
            () -> new FireSwordItem(ModToolTiers.SUNSTONE, 3, -2.4F, new Item.Properties()));

    // Register the Sunstone Pickaxe item
    public static final RegistryObject<Item> SUNSTONE_PICKAXE = ITEMS.register("sunstone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SUNSTONE, 2, -2.8F, new Item.Properties()));

    // Register the Sunstone Axe item
    public static final RegistryObject<Item> SUNSTONE_AXE = ITEMS.register("sunstone_axe",
            () -> new AxeItem(ModToolTiers.SUNSTONE, 6, -3F, new Item.Properties()));

    // Register the Sunstone Shovel item
    public static final RegistryObject<Item> SUNSTONE_SHOVEL = ITEMS.register("sunstone_shovel",
            () -> new ShovelItem(ModToolTiers.SUNSTONE, 2, -3F, new Item.Properties()));

    // Register the Sunstone Hoe item
    public static final RegistryObject<Item> SUNSTONE_HOE = ITEMS.register("sunstone_hoe",
            () -> new HoeItem(ModToolTiers.SUNSTONE, -3, 1F, new Item.Properties()));



    // Method to register the DeferredRegister to the event bus
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
