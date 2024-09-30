
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mods.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.mods.item.AirArmorItem;
import net.mcreator.mods.ModsMod;

public class ModsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ModsMod.MODID);
	public static final RegistryObject<Item> AIR_ARMOR_HELMET = REGISTRY.register("air_armor_helmet", () -> new AirArmorItem.Helmet());
	public static final RegistryObject<Item> AIR_ARMOR_CHESTPLATE = REGISTRY.register("air_armor_chestplate", () -> new AirArmorItem.Chestplate());
	public static final RegistryObject<Item> AIR_ARMOR_LEGGINGS = REGISTRY.register("air_armor_leggings", () -> new AirArmorItem.Leggings());
	public static final RegistryObject<Item> AIR_ARMOR_BOOTS = REGISTRY.register("air_armor_boots", () -> new AirArmorItem.Boots());
	// Start of user code block custom items
	// End of user code block custom items
}
