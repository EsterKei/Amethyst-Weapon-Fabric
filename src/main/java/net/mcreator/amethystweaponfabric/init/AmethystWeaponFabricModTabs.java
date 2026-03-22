/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.amethystweaponfabric.init;

import net.minecraft.world.item.CreativeModeTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class AmethystWeaponFabricModTabs {
	public static void load() {
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(tabData -> {
			tabData.accept(AmethystWeaponFabricModItems.AMETHYST_PICKAXE);
			tabData.accept(AmethystWeaponFabricModItems.AMETHYST_AXE);
			tabData.accept(AmethystWeaponFabricModItems.AMETHYST_SNOVEL);
			tabData.accept(AmethystWeaponFabricModItems.AMETHYST_HOE);
		});
	}
}