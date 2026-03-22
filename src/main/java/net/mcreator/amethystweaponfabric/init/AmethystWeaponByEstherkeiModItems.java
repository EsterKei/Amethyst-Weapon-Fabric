/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.amethystweaponfabric.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.amethystweaponfabric.item.AmethystSnovelItem;
import net.mcreator.amethystweaponfabric.item.AmethystPickaxeItem;
import net.mcreator.amethystweaponfabric.item.AmethystHoeItem;
import net.mcreator.amethystweaponfabric.item.AmethystAxeItem;
import net.mcreator.amethystweaponfabric.AmethystWeaponByEstherkeiMod;

import java.util.function.Function;

public class AmethystWeaponByEstherkeiModItems {
	public static Item AMETHYST_PICKAXE;
	public static Item AMETHYST_AXE;
	public static Item AMETHYST_SNOVEL;
	public static Item AMETHYST_HOE;

	public static void load() {
		AMETHYST_PICKAXE = register("amethyst_pickaxe", AmethystPickaxeItem::new);
		AMETHYST_AXE = register("amethyst_axe", AmethystAxeItem::new);
		AMETHYST_SNOVEL = register("amethyst_snovel", AmethystSnovelItem::new);
		AMETHYST_HOE = register("amethyst_hoe", AmethystHoeItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> I register(String name, Function<Item.Properties, ? extends I> supplier) {
		return (I) Items.registerItem(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(AmethystWeaponByEstherkeiMod.MODID, name)), (Function<Item.Properties, Item>) supplier);
	}
}