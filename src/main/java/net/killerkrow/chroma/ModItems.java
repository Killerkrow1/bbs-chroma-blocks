package net.killerkrow.chroma;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item REVERENCE_COCKTAIL = registerItem("reverence_cocktail",
            new CocktailItem(new FabricItemSettings().food(ModFoodComponents.REVERENCE_COCKTAIL)));
    public static final Item REVERENCE_TEA = registerItem("reverence_tea",
            new CocktailItem(new FabricItemSettings().food(ModFoodComponents.REVERENCE_TEA)));
    public static final Item REVERENCE_WINE = registerItem("reverence_wine",
            new CocktailItem(new FabricItemSettings().food(ModFoodComponents.REVERENCE_WINE)));
    public static final Item REVERENCE_JUICE = registerItem("reverence_juice",
            new CocktailItem(new FabricItemSettings().food(ModFoodComponents.REVERENCE_JUICE)));

    public static final Item REVERENCE_CUPCAKE = registerItem("reverence_cupcake",
            new Item(new FabricItemSettings().food(ModFoodComponents.REVERENCE_CUPCAKE)));
    public static final Item REVERENCE_CAKE = registerItem("reverence_cake",
            new Item(new FabricItemSettings().food(ModFoodComponents.REVERENCE_CAKE)));
    public static final Item REVERENCE_CAKE_SLICE = registerItem("reverence_cake_slice",
            new Item(new FabricItemSettings().food(ModFoodComponents.REVERENCE_CAKE_SLICE)));
    public static final Item REVERENCE_PIE = registerItem("reverence_pie",
            new Item(new FabricItemSettings().food(ModFoodComponents.REVERENCE_PIE)));
    public static final Item REVERENCE_PIE_SLICE = registerItem("reverence_pie_slice",
            new Item(new FabricItemSettings().food(ModFoodComponents.REVERENCE_PIE_SLICE)));

    public static final Item REVERENCE_COOKIE = registerItem("reverence_cookie",
            new Item(new FabricItemSettings().food(ModFoodComponents.REVERENCE_COOKIE)));
    public static final Item REVERENCE_TART = registerItem("reverence_tart",
            new Item(new FabricItemSettings().food(ModFoodComponents.REVERENCE_TART)));
    public static final Item REVERENCE_TART_SLICE = registerItem("reverence_tart_slice",
            new Item(new FabricItemSettings().food(ModFoodComponents.REVERENCE_TART_SLICE)));
    public static final Item REVERENCE_SAUCE = registerItem("reverence_sauce",
            new BowlItem(new FabricItemSettings().food(ModFoodComponents.REVERENCE_SAUCE)));
    public static final Item REVERENCE_ROLL = registerItem("reverence_roll",
            new Item(new FabricItemSettings().food(ModFoodComponents.REVERENCE_ROLL)));
    public static final Item REVERENCE_ICE_CREAM = registerItem("reverence_ice_cream",
            new BowlItem(new FabricItemSettings().food(ModFoodComponents.REVERENCE_ICE_CREAM)));
    public static final Item FRIED_REVERENCE_BERRY = registerItem("fried_reverence_berry",
            new Item(new FabricItemSettings().food(ModFoodComponents.FRIED_REVERENCE_BERRY)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BBSChromaBlocks.MOD_ID, name), item);
    }

    public static void registerItems() {
        BBSChromaBlocks.LOGGER.info("Registering Items for " +BBSChromaBlocks.MOD_ID);
    }
}
