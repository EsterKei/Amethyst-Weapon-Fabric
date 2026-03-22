package net.mcreator.amethystweaponfabric.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class AmethystSnovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 500, 5f, 0, 4, TagKey.create(Registries.ITEM, ResourceLocation.parse("amethyst_weapon__fabric_:amethyst_snovel_repair_items")));

	public AmethystSnovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 2f, -2f, properties);
	}
}