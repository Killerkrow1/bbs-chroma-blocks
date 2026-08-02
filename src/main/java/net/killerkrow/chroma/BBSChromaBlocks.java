package net.killerkrow.chroma;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BBSChromaBlocks implements ModInitializer {
	public static final String MOD_ID = "bbs";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final Block CHROMA_RED_BLOCK = createChromaBlock();
	public static final Block CHROMA_GREEN_BLOCK = createChromaBlock();
	public static final Block CHROMA_BLUE_BLOCK = createChromaBlock();
	public static final Block CHROMA_CYAN_BLOCK = createChromaBlock();
	public static final Block CHROMA_MAGENTA_BLOCK = createChromaBlock();
	public static final Block CHROMA_YELLOW_BLOCK = createChromaBlock();
	public static final Block CHROMA_BLACK_BLOCK = createChromaBlock();
	public static final Block CHROMA_WHITE_BLOCK = createChromaBlock();

	public static final BlockItem CHROMA_RED_BLOCK_ITEM = new BlockItem(CHROMA_RED_BLOCK, new Item.Settings());
	public static final BlockItem CHROMA_GREEN_BLOCK_ITEM = new BlockItem(CHROMA_GREEN_BLOCK, new Item.Settings());
	public static final BlockItem CHROMA_BLUE_BLOCK_ITEM = new BlockItem(CHROMA_BLUE_BLOCK, new Item.Settings());
	public static final BlockItem CHROMA_CYAN_BLOCK_ITEM = new BlockItem(CHROMA_CYAN_BLOCK, new Item.Settings());
	public static final BlockItem CHROMA_MAGENTA_BLOCK_ITEM = new BlockItem(CHROMA_MAGENTA_BLOCK, new Item.Settings());
	public static final BlockItem CHROMA_YELLOW_BLOCK_ITEM = new BlockItem(CHROMA_YELLOW_BLOCK, new Item.Settings());
	public static final BlockItem CHROMA_BLACK_BLOCK_ITEM = new BlockItem(CHROMA_BLACK_BLOCK, new Item.Settings());
	public static final BlockItem CHROMA_WHITE_BLOCK_ITEM = new BlockItem(CHROMA_WHITE_BLOCK, new Item.Settings());

	private static Block createChromaBlock()
	{
		return new Block(FabricBlockSettings.create()
				.noBlockBreakParticles()
				.dropsNothing()
				.requiresTool()
				.strength(-1F, 3600000F));
	}

	public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
			.icon(() -> CHROMA_RED_BLOCK_ITEM.getDefaultStack())
			.displayName(Text.translatable("itemGroup.bbs.main"))
			.entries((context, entries) ->
			{
				entries.add(CHROMA_RED_BLOCK_ITEM);
				entries.add(CHROMA_GREEN_BLOCK_ITEM);
				entries.add(CHROMA_BLUE_BLOCK_ITEM);
				entries.add(CHROMA_CYAN_BLOCK_ITEM);
				entries.add(CHROMA_MAGENTA_BLOCK_ITEM);
				entries.add(CHROMA_YELLOW_BLOCK_ITEM);
				entries.add(CHROMA_BLACK_BLOCK_ITEM);
				entries.add(CHROMA_WHITE_BLOCK_ITEM);
			})
			.build();

	@Override
	public void onInitialize() {
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "chroma_red"), CHROMA_RED_BLOCK);
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "chroma_green"), CHROMA_GREEN_BLOCK);
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "chroma_blue"), CHROMA_BLUE_BLOCK);
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "chroma_cyan"), CHROMA_CYAN_BLOCK);
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "chroma_magenta"), CHROMA_MAGENTA_BLOCK);
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "chroma_yellow"), CHROMA_YELLOW_BLOCK);
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "chroma_black"), CHROMA_BLACK_BLOCK);
		Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "chroma_white"), CHROMA_WHITE_BLOCK);

		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "chroma_red"), CHROMA_RED_BLOCK_ITEM);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "chroma_green"), CHROMA_GREEN_BLOCK_ITEM);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "chroma_blue"), CHROMA_BLUE_BLOCK_ITEM);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "chroma_cyan"), CHROMA_CYAN_BLOCK_ITEM);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "chroma_magenta"), CHROMA_MAGENTA_BLOCK_ITEM);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "chroma_yellow"), CHROMA_YELLOW_BLOCK_ITEM);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "chroma_black"), CHROMA_BLACK_BLOCK_ITEM);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "chroma_white"), CHROMA_WHITE_BLOCK_ITEM);

		Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_ID, "main"), ITEM_GROUP);
	}

	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}
}
