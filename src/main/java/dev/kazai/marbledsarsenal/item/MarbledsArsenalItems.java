package dev.kazai.marbledsarsenal.item;

import dev.kazai.marbledsarsenal.MarbledsArsenal;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import software.bernie.geckolib.animatable.client.GeoRenderProvider;

import java.util.HashMap;
import java.util.Map;

public class MarbledsArsenalItems {
    public static final Item CM6M_GAS_MASK = registerItem("cm6m_gas_mask", new BasicGeoArmorItem("animation.cm6m.idle", ArmorMaterials.IRON, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item HELMET_CM6M_GAS_MASK = registerItem("helmet_cm6m_gas_mask", new BasicGeoArmorItem("animation.helmet_cm6m.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item UN_HELMET_CM6M_GAS_MASK = registerItem("un_helmet_cm6m_gas_mask", new BasicGeoArmorItem("animation.helmet_cm6m.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item OLIVE_HELMET_CM6M_GAS_MASK = registerItem("olive_helmet_cm6m_gas_mask", new BasicGeoArmorItem("animation.helmet_cm6m.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item MEDICAL_HELMET_CM6M_GAS_MASK = registerItem("medical_helmet_cm6m_gas_mask", new BasicGeoArmorItem("animation.helmet_cm6m.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item MEDICAL_UN_HELMET_CM6M_GAS_MASK = registerItem("medical_un_helmet_cm6m_gas_mask", new BasicGeoArmorItem("animation.helmet_cm6m.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item MEDICAL_OLIVE_HELMET_CM6M_GAS_MASK = registerItem("medical_olive_helmet_cm6m_gas_mask", new BasicGeoArmorItem("animation.helmet_cm6m.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item CM7M_GAS_MASK = registerItem("cm7m_gas_mask", new BasicGeoArmorItem("animation.cm7m.idle", ArmorMaterials.IRON, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item HELMET_CM7M_GAS_MASK = registerItem("helmet_cm7m_gas_mask", new BasicGeoArmorItem("animation.helmet_cm7m.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item UN_HELMET_CM7M_GAS_MASK = registerItem("un_helmet_cm7m_gas_mask", new BasicGeoArmorItem("animation.helmet_cm7m.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item OLIVE_HELMET_CM7M_GAS_MASK = registerItem("olive_helmet_cm7m_gas_mask", new BasicGeoArmorItem("animation.helmet_cm7m.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item MEDICAL_HELMET_CM7M_GAS_MASK = registerItem("medical_helmet_cm7m_gas_mask", new BasicGeoArmorItem("animation.helmet_cm7m.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item MEDICAL_UN_HELMET_CM7M_GAS_MASK = registerItem("medical_un_helmet_cm7m_gas_mask", new BasicGeoArmorItem("animation.helmet_cm7m.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item MEDICAL_OLIVE_HELMET_CM7M_GAS_MASK = registerItem("medical_olive_helmet_cm7m_gas_mask", new BasicGeoArmorItem("animation.helmet_cm7m.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item CM8M_GAS_MASK = registerItem("cm8m_gas_mask", new BasicGeoArmorItem("animation.cm8m.idle", ArmorMaterials.IRON, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item HELMET_CM8M_GAS_MASK = registerItem("helmet_cm8m_gas_mask", new BasicGeoArmorItem("animation.helmet_cm8m.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item UN_HELMET_CM8M_GAS_MASK = registerItem("un_helmet_cm8m_gas_mask", new BasicGeoArmorItem("animation.helmet_cm8m.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item OLIVE_HELMET_CM8M_GAS_MASK = registerItem("olive_helmet_cm8m_gas_mask", new BasicGeoArmorItem("animation.helmet_cm8m.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item MEDICAL_HELMET_CM8M_GAS_MASK = registerItem("medical_helmet_cm8m_gas_mask", new BasicGeoArmorItem("animation.helmet_cm8m.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item MEDICAL_UN_HELMET_CM8M_GAS_MASK = registerItem("medical_un_helmet_cm8m_gas_mask", new BasicGeoArmorItem("animation.helmet_cm8m.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item MEDICAL_OLIVE_HELMET_CM8M_GAS_MASK = registerItem("medical_olive_helmet_cm8m_gas_mask", new BasicGeoArmorItem("animation.helmet_cm8m.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item WHITE_GP5_GAS_MASK = registerItem("white_gp5_gas_mask", new BasicGeoArmorItem("animation.gp5.idle", ArmorMaterials.IRON, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item BLACK_GP5_GAS_MASK = registerItem("black_gp5_gas_mask", new BasicGeoArmorItem("animation.gp5.idle", ArmorMaterials.IRON, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item COMBAT_HELMET = registerItem("combat_helmet", new BasicGeoArmorItem("animation.combat_helmet.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item UN_COMBAT_HELMET = registerItem("un_combat_helmet", new BasicGeoArmorItem("animation.combat_helmet.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item OLIVE_COMBAT_HELMET = registerItem("olive_combat_helmet", new BasicGeoArmorItem("animation.combat_helmet.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item MEDICAL_COMBAT_HELMET = registerItem("medical_combat_helmet", new BasicGeoArmorItem("animation.combat_helmet.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item MEDICAL_UN_COMBAT_HELMET = registerItem("medical_un_combat_helmet", new BasicGeoArmorItem("animation.combat_helmet.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item MEDICAL_OLIVE_COMBAT_HELMET = registerItem("medical_olive_combat_helmet", new BasicGeoArmorItem("animation.combat_helmet.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item BLACK_MILITARY_BERET = registerItem("black_military_beret", new BasicGeoArmorItem("animation.military_beret.idle", ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item RED_MILITARY_BERET = registerItem("red_military_beret", new BasicGeoArmorItem("animation.military_beret.idle", ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item UN_MILITARY_BERET = registerItem("un_military_beret", new BasicGeoArmorItem("animation.military_beret.idle", ArmorMaterials.LEATHER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item BLACK_PLATE_CARRIER_T1 = registerItem("black_plate_carrier_t1", new BasicGeoArmorItem("animation.plate_carrier.idle", ArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final Item BLACK_PLATE_CARRIER_T2 = registerItem("black_plate_carrier_t2", new BasicGeoArmorItem("animation.plate_carrier.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final Item BLACK_PLATE_CARRIER_T3 = registerItem("black_plate_carrier_t3", new BasicGeoArmorItem("animation.plate_carrier.idle", ArmorMaterials.NETHERITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final Item OLIVE_PLATE_CARRIER_T1 = registerItem("olive_plate_carrier_t1", new BasicGeoArmorItem("animation.plate_carrier.idle", ArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final Item OLIVE_PLATE_CARRIER_T2 = registerItem("olive_plate_carrier_t2", new BasicGeoArmorItem("animation.plate_carrier.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final Item OLIVE_PLATE_CARRIER_T3 = registerItem("olive_plate_carrier_t3", new BasicGeoArmorItem("animation.plate_carrier.idle", ArmorMaterials.NETHERITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final Item GAS_MASK_FILTER = registerItem("gas_mask_filter", new Item(new Item.Properties()));
    public static final Item ARMOR_PLATE = registerItem("armor_plate", new Item(new Item.Properties()));
    public static final Item RIOT_ARMOR_HELMET = registerItem("riot_armor_helmet", new BasicGeoArmorItem("animation.riot_armor.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item RIOT_ARMOR_CHESTPLATE = registerItem("riot_armor_chestplate", new BasicGeoArmorItem("animation.riot_armor.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final Item RIOT_ARMOR_LEGGINGS = registerItem("riot_armor_leggings", new BasicGeoArmorItem("animation.riot_armor.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final Item RIOT_ARMOR_BOOTS = registerItem("riot_armor_boots", new BasicGeoArmorItem("animation.riot_armor.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final Item WINTER_MILITARY_ARMOR_HELMET = registerItem("winter_military_armor_helmet", new BasicGeoArmorItem("animation.military_armor.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item WINTER_MILITARY_ARMOR_CHESTPLATE = registerItem("winter_military_armor_chestplate", new BasicGeoArmorItem("animation.military_armor.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final Item WINTER_MILITARY_ARMOR_LEGGINGS = registerItem("winter_military_armor_leggings", new BasicGeoArmorItem("animation.military_armor.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final Item WINTER_MILITARY_ARMOR_BOOTS = registerItem("winter_military_armor_boots", new BasicGeoArmorItem("animation.military_armor.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final Item DESERT_MILITARY_ARMOR_HELMET = registerItem("desert_military_armor_helmet", new BasicGeoArmorItem("animation.military_armor.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item DESERT_MILITARY_ARMOR_CHESTPLATE = registerItem("desert_military_armor_chestplate", new BasicGeoArmorItem("animation.military_armor.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final Item DESERT_MILITARY_ARMOR_LEGGINGS = registerItem("desert_military_armor_leggings", new BasicGeoArmorItem("animation.military_armor.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final Item DESERT_MILITARY_ARMOR_BOOTS = registerItem("desert_military_armor_boots", new BasicGeoArmorItem("animation.military_armor.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final Item SWAT_ARMOR_HELMET = registerItem("swat_armor_helmet", new BasicGeoArmorItem("animation.swat_armor.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item SWAT_ARMOR_CHESTPLATE = registerItem("swat_armor_chestplate", new BasicGeoArmorItem("animation.swat_armor.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final Item SWAT_ARMOR_LEGGINGS = registerItem("swat_armor_leggings", new BasicGeoArmorItem("animation.swat_armor.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final Item SWAT_ARMOR_BOOTS = registerItem("swat_armor_boots", new BasicGeoArmorItem("animation.swat_armor.idle", ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final Item HAZMAT_ARMOR_HELMET = registerItem("hazmat_armor_helmet", new BasicGeoArmorItem("animation.hazmat_armor.idle", ArmorMaterials.IRON, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item HAZMAT_ARMOR_CHESTPLATE = registerItem("hazmat_armor_chestplate", new BasicGeoArmorItem("animation.hazmat_armor.idle", ArmorMaterials.IRON, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final Item HAZMAT_ARMOR_LEGGINGS = registerItem("hazmat_armor_leggings", new BasicGeoArmorItem("animation.hazmat_armor.idle", ArmorMaterials.IRON, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final Item HAZMAT_ARMOR_BOOTS = registerItem("hazmat_armor_boots", new BasicGeoArmorItem("animation.hazmat_armor.idle", ArmorMaterials.IRON, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final Item OLIVE_JUGGERNAUT_ARMOR_HELMET = registerItem("olive_juggernaut_armor_helmet", new BasicGeoArmorItem("animation.juggernaut_armor.idle", ArmorMaterials.NETHERITE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item OLIVE_JUGGERNAUT_ARMOR_CHESTPLATE = registerItem("olive_juggernaut_armor_chestplate", new BasicGeoArmorItem("animation.juggernaut_armor.idle", ArmorMaterials.NETHERITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final Item OLIVE_JUGGERNAUT_ARMOR_LEGGINGS = registerItem("olive_juggernaut_armor_leggings", new BasicGeoArmorItem("animation.juggernaut_armor.idle", ArmorMaterials.NETHERITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final Item OLIVE_JUGGERNAUT_ARMOR_BOOTS = registerItem("olive_juggernaut_armor_boots", new BasicGeoArmorItem("animation.juggernaut_armor.idle", ArmorMaterials.NETHERITE, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final Item BLACK_JUGGERNAUT_ARMOR_HELMET = registerItem("black_juggernaut_armor_helmet", new BasicGeoArmorItem("animation.juggernaut_armor.idle", ArmorMaterials.NETHERITE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Item BLACK_JUGGERNAUT_ARMOR_CHESTPLATE = registerItem("black_juggernaut_armor_chestplate", new BasicGeoArmorItem("animation.juggernaut_armor.idle", ArmorMaterials.NETHERITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final Item BLACK_JUGGERNAUT_ARMOR_LEGGINGS = registerItem("black_juggernaut_armor_leggings", new BasicGeoArmorItem("animation.juggernaut_armor.idle", ArmorMaterials.NETHERITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final Item BLACK_JUGGERNAUT_ARMOR_BOOTS = registerItem("black_juggernaut_armor_boots", new BasicGeoArmorItem("animation.juggernaut_armor.idle", ArmorMaterials.NETHERITE, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final Item CROWBAR = registerItem("crowbar", new SwordItem(Tiers.IRON, (new Item.Properties()).durability(500).attributes(SwordItem.createAttributes(Tiers.IRON, 3, -2.4F))));
    public static final Item FIRE_AXE = registerItem("fire_axe", new AxeItem(Tiers.IRON, (new Item.Properties()).durability(500).attributes(AxeItem.createAttributes(Tiers.IRON, 5.0F, -3.1F))));
    public static final Item MODERN_AXE = registerItem("modern_axe", new AxeItem(Tiers.IRON, (new Item.Properties()).durability(750).attributes(AxeItem.createAttributes(Tiers.IRON, 4.0F, -2.6F))));
    public static final Item TOMAHAWK = registerItem("tomahawk", new AxeItem(Tiers.IRON, (new Item.Properties()).durability(250).attributes(AxeItem.createAttributes(Tiers.IRON, 5.0F, -3.1F))));
    public static final Item PIPE_WRENCH = registerItem("pipe_wrench", new SwordItem(Tiers.IRON, (new Item.Properties()).durability(500).attributes(SwordItem.createAttributes(Tiers.IRON, 2, -2.3F))));
    public static final Item SLEDGEHAMMER = registerItem("sledgehammer", new SwordItem(Tiers.IRON, (new Item.Properties()).durability(1000).attributes(SwordItem.createAttributes(Tiers.IRON, 9, -3.4F))));
    public static final Item BONE_SAW = registerItem("bone_saw", new SwordItem(Tiers.IRON, (new Item.Properties()).durability(250).attributes(SwordItem.createAttributes(Tiers.IRON, 4, -2.4F))));
    public static final Item POLICE_BATON = registerItem("police_baton", new SwordItem(Tiers.IRON, (new Item.Properties()).durability(500).attributes(SwordItem.createAttributes(Tiers.IRON, 2, -2.4F))));
    public static final Item MACHETE = registerItem("machete", new SwordItem(Tiers.IRON, (new Item.Properties()).durability(500).attributes(SwordItem.createAttributes(Tiers.IRON, 5, -2.4F))));
    public static final Item STOP_SIGN = registerItem("stop_sign", new SwordItem(Tiers.IRON, (new Item.Properties()).durability(1000).attributes(SwordItem.createAttributes(Tiers.IRON, 7, -3.4F))));
    public static final Item KATANA = registerItem("katana", new SwordItem(Tiers.IRON, (new Item.Properties()).durability(750).attributes(SwordItem.createAttributes(Tiers.IRON, 5, -2.7F))));
    public static final Item TANTO = registerItem("tanto", new SwordItem(Tiers.IRON, (new Item.Properties()).durability(250).attributes(SwordItem.createAttributes(Tiers.IRON, 3, -2.3F))));
    public static final Item BASEBALL_BAT = registerItem("baseball_bat", new SwordItem(Tiers.IRON, (new Item.Properties()).durability(500).attributes(SwordItem.createAttributes(Tiers.IRON, 1, -2.4F))));
    public static final Item BARBED_BASEBALL_BAT = registerItem("barbed_baseball_bat", new SwordItem(Tiers.IRON, (new Item.Properties()).durability(500).attributes(SwordItem.createAttributes(Tiers.IRON, 3, -2.4F))));
    public static final Item STEEL_BASEBALL_BAT = registerItem("steel_baseball_bat", new SwordItem(Tiers.IRON, (new Item.Properties()).durability(750).attributes(SwordItem.createAttributes(Tiers.IRON, 5, -2.7F))));

    public static Map<Item, GeoRenderProvider> renderers = new HashMap<>();

    public static Item registerItem(String name, Item item) {
        return registerItem(new ResourceLocation(MarbledsArsenal.MODID, name), item);
    }
    public static Item registerItem(ResourceLocation location, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, location, item);
    }

    public static void register(){

    }
}
