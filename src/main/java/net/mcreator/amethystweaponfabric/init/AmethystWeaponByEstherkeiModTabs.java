/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.amethystweaponfabric.init;

import net.minecraft.world.item.CreativeModeTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class AmethystWeaponByEstherkeiModTabs {
	public static void load() {
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(tabData -> {
			tabData.accept(AmethystWeaponByEstherkeiModItems.AMETHYST_PICKAXE);
			tabData.accept(AmethystWeaponByEstherkeiModItems.AMETHYST_AXE);
			tabData.accept(AmethystWeaponByEstherkeiModItems.AMETHYST_SNOVEL);
			tabData.accept(AmethystWeaponByEstherkeiModItems.AMETHYST_HOE);
		});
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(tabData -> {
			tabData.accept(AmethystWeaponByEstherkeiModItems.AMETHYST_SWORD);
		});
	}
}