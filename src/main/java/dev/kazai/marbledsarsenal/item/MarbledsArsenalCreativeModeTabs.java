package dev.kazai.marbledsarsenal.item;

import dev.kazai.marbledsarsenal.MarbledsArsenal;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;

public class MarbledsArsenalCreativeModeTabs {
    public static final CreativeModeTab MARBLEDS_API = registerCreativeModeTab("marbledsarsenal",
            FabricItemGroup.builder()
                .title(Component.translatable("itemGroup.marbledsArsenal"))
                .icon(MarbledsArsenalItems.CM6M_GAS_MASK::getDefaultInstance)
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(MarbledsArsenalItems.CM6M_GAS_MASK);
                        output.accept(MarbledsArsenalItems.HELMET_CM6M_GAS_MASK);
                        output.accept(MarbledsArsenalItems.UN_HELMET_CM6M_GAS_MASK);
                        output.accept(MarbledsArsenalItems.OLIVE_HELMET_CM6M_GAS_MASK);
                        output.accept(MarbledsArsenalItems.MEDICAL_HELMET_CM6M_GAS_MASK);
                        output.accept(MarbledsArsenalItems.MEDICAL_UN_HELMET_CM6M_GAS_MASK);
                        output.accept(MarbledsArsenalItems.MEDICAL_OLIVE_HELMET_CM6M_GAS_MASK);
                        output.accept(MarbledsArsenalItems.CM7M_GAS_MASK);
                        output.accept(MarbledsArsenalItems.HELMET_CM7M_GAS_MASK);
                        output.accept(MarbledsArsenalItems.UN_HELMET_CM7M_GAS_MASK);
                        output.accept(MarbledsArsenalItems.OLIVE_HELMET_CM7M_GAS_MASK);
                        output.accept(MarbledsArsenalItems.MEDICAL_HELMET_CM7M_GAS_MASK);
                        output.accept(MarbledsArsenalItems.MEDICAL_UN_HELMET_CM7M_GAS_MASK);
                        output.accept(MarbledsArsenalItems.MEDICAL_OLIVE_HELMET_CM7M_GAS_MASK);
                        output.accept(MarbledsArsenalItems.CM8M_GAS_MASK);
                        output.accept(MarbledsArsenalItems.HELMET_CM8M_GAS_MASK);
                        output.accept(MarbledsArsenalItems.UN_HELMET_CM8M_GAS_MASK);
                        output.accept(MarbledsArsenalItems.OLIVE_HELMET_CM8M_GAS_MASK);
                        output.accept(MarbledsArsenalItems.MEDICAL_HELMET_CM8M_GAS_MASK);
                        output.accept(MarbledsArsenalItems.MEDICAL_UN_HELMET_CM8M_GAS_MASK);
                        output.accept(MarbledsArsenalItems.MEDICAL_OLIVE_HELMET_CM8M_GAS_MASK);
                        output.accept(MarbledsArsenalItems.WHITE_GP5_GAS_MASK);
                        output.accept(MarbledsArsenalItems.BLACK_GP5_GAS_MASK);
                        output.accept(MarbledsArsenalItems.COMBAT_HELMET);
                        output.accept(MarbledsArsenalItems.UN_COMBAT_HELMET);
                        output.accept(MarbledsArsenalItems.OLIVE_COMBAT_HELMET);
                        output.accept(MarbledsArsenalItems.MEDICAL_COMBAT_HELMET);
                        output.accept(MarbledsArsenalItems.MEDICAL_UN_COMBAT_HELMET);
                        output.accept(MarbledsArsenalItems.MEDICAL_OLIVE_COMBAT_HELMET);
                        output.accept(MarbledsArsenalItems.BLACK_MILITARY_BERET);
                        output.accept(MarbledsArsenalItems.RED_MILITARY_BERET);
                        output.accept(MarbledsArsenalItems.UN_MILITARY_BERET);
                        output.accept(MarbledsArsenalItems.BLACK_PLATE_CARRIER_T1);
                        output.accept(MarbledsArsenalItems.BLACK_PLATE_CARRIER_T2);
                        output.accept(MarbledsArsenalItems.BLACK_PLATE_CARRIER_T3);
                        output.accept(MarbledsArsenalItems.OLIVE_PLATE_CARRIER_T1);
                        output.accept(MarbledsArsenalItems.OLIVE_PLATE_CARRIER_T2);
                        output.accept(MarbledsArsenalItems.OLIVE_PLATE_CARRIER_T3);
                        output.accept(MarbledsArsenalItems.GAS_MASK_FILTER);
                        output.accept(MarbledsArsenalItems.ARMOR_PLATE);
                        output.accept(MarbledsArsenalItems.RIOT_ARMOR_HELMET);
                        output.accept(MarbledsArsenalItems.RIOT_ARMOR_CHESTPLATE);
                        output.accept(MarbledsArsenalItems.RIOT_ARMOR_LEGGINGS);
                        output.accept(MarbledsArsenalItems.RIOT_ARMOR_BOOTS);
                        output.accept(MarbledsArsenalItems.SWAT_ARMOR_HELMET);
                        output.accept(MarbledsArsenalItems.SWAT_ARMOR_CHESTPLATE);
                        output.accept(MarbledsArsenalItems.SWAT_ARMOR_LEGGINGS);
                        output.accept(MarbledsArsenalItems.SWAT_ARMOR_BOOTS);
                        output.accept(MarbledsArsenalItems.WINTER_MILITARY_ARMOR_HELMET);
                        output.accept(MarbledsArsenalItems.WINTER_MILITARY_ARMOR_CHESTPLATE);
                        output.accept(MarbledsArsenalItems.WINTER_MILITARY_ARMOR_LEGGINGS);
                        output.accept(MarbledsArsenalItems.WINTER_MILITARY_ARMOR_BOOTS);
                        output.accept(MarbledsArsenalItems.DESERT_MILITARY_ARMOR_HELMET);
                        output.accept(MarbledsArsenalItems.DESERT_MILITARY_ARMOR_CHESTPLATE);
                        output.accept(MarbledsArsenalItems.DESERT_MILITARY_ARMOR_LEGGINGS);
                        output.accept(MarbledsArsenalItems.DESERT_MILITARY_ARMOR_BOOTS);
                        output.accept(MarbledsArsenalItems.HAZMAT_ARMOR_HELMET);
                        output.accept(MarbledsArsenalItems.HAZMAT_ARMOR_CHESTPLATE);
                        output.accept(MarbledsArsenalItems.HAZMAT_ARMOR_LEGGINGS);
                        output.accept(MarbledsArsenalItems.HAZMAT_ARMOR_BOOTS);
                        output.accept(MarbledsArsenalItems.OLIVE_JUGGERNAUT_ARMOR_HELMET);
                        output.accept(MarbledsArsenalItems.OLIVE_JUGGERNAUT_ARMOR_CHESTPLATE);
                        output.accept(MarbledsArsenalItems.OLIVE_JUGGERNAUT_ARMOR_LEGGINGS);
                        output.accept(MarbledsArsenalItems.OLIVE_JUGGERNAUT_ARMOR_BOOTS);
                        output.accept(MarbledsArsenalItems.BLACK_JUGGERNAUT_ARMOR_HELMET);
                        output.accept(MarbledsArsenalItems.BLACK_JUGGERNAUT_ARMOR_CHESTPLATE);
                        output.accept(MarbledsArsenalItems.BLACK_JUGGERNAUT_ARMOR_LEGGINGS);
                        output.accept(MarbledsArsenalItems.BLACK_JUGGERNAUT_ARMOR_BOOTS);
                        output.accept(MarbledsArsenalItems.CROWBAR);
                        output.accept(MarbledsArsenalItems.FIRE_AXE);
                        output.accept(MarbledsArsenalItems.MODERN_AXE);
                        output.accept(MarbledsArsenalItems.TOMAHAWK);
                        output.accept(MarbledsArsenalItems.PIPE_WRENCH);
                        output.accept(MarbledsArsenalItems.SLEDGEHAMMER);
                        output.accept(MarbledsArsenalItems.BONE_SAW);
                        output.accept(MarbledsArsenalItems.POLICE_BATON);
                        output.accept(MarbledsArsenalItems.MACHETE);
                        output.accept(MarbledsArsenalItems.STOP_SIGN);
                        output.accept(MarbledsArsenalItems.KATANA);
                        output.accept(MarbledsArsenalItems.TANTO);
                        output.accept(MarbledsArsenalItems.BASEBALL_BAT);
                        output.accept(MarbledsArsenalItems.BARBED_BASEBALL_BAT);
                        output.accept(MarbledsArsenalItems.STEEL_BASEBALL_BAT);
                    })
                .build()
    );

    public static CreativeModeTab registerCreativeModeTab(String name, CreativeModeTab creativeModeTab) {
        return registerCreativeModeTab(ResourceLocation.fromNamespaceAndPath(MarbledsArsenal.MODID, name), creativeModeTab);
    }

    public static CreativeModeTab registerCreativeModeTab(ResourceLocation location, CreativeModeTab creativeModeTab) {
        return Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, location, creativeModeTab);
    }

    public static void register(){

    }
}
