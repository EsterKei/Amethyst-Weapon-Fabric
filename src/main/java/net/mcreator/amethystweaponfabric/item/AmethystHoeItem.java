package net.mcreator.amethystweaponfabric.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class AmethystHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 400, 5f, 0, 6, TagKey.create(Registries.ITEM, ResourceLocation.parse("amethyst_weapon_by_estherkei:amethyst_hoe_repair_items")));

	public AmethystHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 4f, -3f, properties);
	}
}