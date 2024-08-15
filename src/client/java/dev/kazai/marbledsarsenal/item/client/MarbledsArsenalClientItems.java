package dev.kazai.marbledsarsenal.item.client;

import dev.kazai.marbledsarsenal.item.MarbledsArsenalItems;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Supplier;

public class MarbledsArsenalClientItems {
    public static void register(){
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.CM6M_GAS_MASK, createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/cm6m.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/cm6m.png"), new ResourceLocation("marbledsarsenal", "animations/cm6m.animation.json")));
        }));
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.HELMET_CM6M_GAS_MASK, createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/helmet_cm6m.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/helmet_cm6m.png"), new ResourceLocation("marbledsarsenal", "animations/helmet_cm6m.animation.json")));
        }));
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.UN_HELMET_CM6M_GAS_MASK, createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/helmet_cm6m.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/un_helmet_cm6m.png"), new ResourceLocation("marbledsarsenal", "animations/helmet_cm6m.animation.json")));
        }));
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.OLIVE_HELMET_CM6M_GAS_MASK, createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/helmet_cm6m.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/olive_helmet_cm6m.png"), new ResourceLocation("marbledsarsenal", "animations/helmet_cm6m.animation.json")));
        }));
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.MEDICAL_HELMET_CM6M_GAS_MASK, createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/helmet_cm6m.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/medical_helmet_cm6m.png"), new ResourceLocation("marbledsarsenal", "animations/helmet_cm6m.animation.json")));
        }));
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.MEDICAL_UN_HELMET_CM6M_GAS_MASK, createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/helmet_cm6m.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/medical_un_helmet_cm6m.png"), new ResourceLocation("marbledsarsenal", "animations/helmet_cm6m.animation.json")));
        }));
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.MEDICAL_OLIVE_HELMET_CM6M_GAS_MASK, createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/helmet_cm6m.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/medical_olive_helmet_cm6m.png"), new ResourceLocation("marbledsarsenal", "animations/helmet_cm6m.animation.json")));
        }));
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.CM7M_GAS_MASK, createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/cm7m.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/cm7m.png"), new ResourceLocation("marbledsarsenal", "animations/cm7m.animation.json")));
        }));
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.HELMET_CM7M_GAS_MASK, createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/helmet_cm7m.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/helmet_cm7m.png"), new ResourceLocation("marbledsarsenal", "animations/helmet_cm7m.animation.json")));
        }));
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.UN_HELMET_CM7M_GAS_MASK, createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/helmet_cm7m.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/un_helmet_cm7m.png"), new ResourceLocation("marbledsarsenal", "animations/helmet_cm7m.animation.json")));
        }));
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.OLIVE_HELMET_CM7M_GAS_MASK, createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/helmet_cm7m.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/olive_helmet_cm7m.png"), new ResourceLocation("marbledsarsenal", "animations/helmet_cm7m.animation.json")));
        }));
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.MEDICAL_HELMET_CM7M_GAS_MASK, createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/helmet_cm7m.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/medical_helmet_cm7m.png"), new ResourceLocation("marbledsarsenal", "animations/helmet_cm7m.animation.json")));
        }));
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.MEDICAL_UN_HELMET_CM7M_GAS_MASK, createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/helmet_cm7m.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/medical_un_helmet_cm7m.png"), new ResourceLocation("marbledsarsenal", "animations/helmet_cm7m.animation.json")));
        }));
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.MEDICAL_OLIVE_HELMET_CM7M_GAS_MASK, createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/helmet_cm7m.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/medical_olive_helmet_cm7m.png"), new ResourceLocation("marbledsarsenal", "animations/helmet_cm7m.animation.json")));
        }));
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.CM8M_GAS_MASK, createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/cm8m.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/cm8m.png"), new ResourceLocation("marbledsarsenal", "animations/cm8m.animation.json")));
        }));
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.HELMET_CM8M_GAS_MASK, createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/helmet_cm8m.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/helmet_cm8m.png"), new ResourceLocation("marbledsarsenal", "animations/helmet_cm8m.animation.json")));
        }));
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.UN_HELMET_CM8M_GAS_MASK, createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/helmet_cm8m.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/un_helmet_cm8m.png"), new ResourceLocation("marbledsarsenal", "animations/helmet_cm8m.animation.json")));
        }));
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.OLIVE_HELMET_CM8M_GAS_MASK, createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/helmet_cm8m.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/olive_helmet_cm8m.png"), new ResourceLocation("marbledsarsenal", "animations/helmet_cm8m.animation.json")));
        }));
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.MEDICAL_HELMET_CM8M_GAS_MASK, createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/helmet_cm8m.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/medical_helmet_cm8m.png"), new ResourceLocation("marbledsarsenal", "animations/helmet_cm8m.animation.json")));
        }));
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.MEDICAL_UN_HELMET_CM8M_GAS_MASK, createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/helmet_cm8m.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/medical_un_helmet_cm8m.png"), new ResourceLocation("marbledsarsenal", "animations/helmet_cm8m.animation.json")));
        }));
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.MEDICAL_OLIVE_HELMET_CM8M_GAS_MASK, createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/helmet_cm8m.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/medical_olive_helmet_cm8m.png"), new ResourceLocation("marbledsarsenal", "animations/helmet_cm8m.animation.json")));
        }));
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.WHITE_GP5_GAS_MASK, createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/gp5.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/white_gp5.png"), new ResourceLocation("marbledsarsenal", "animations/gp5.animation.json")));
        }));
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.BLACK_GP5_GAS_MASK, createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/gp5.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/black_gp5.png"), new ResourceLocation("marbledsarsenal", "animations/gp5.animation.json")));
        }));
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.COMBAT_HELMET, createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/combat_helmet.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/combat_helmet.png"), new ResourceLocation("marbledsarsenal", "animations/combat_helmet.animation.json")));
        }));
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.UN_COMBAT_HELMET, createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/combat_helmet.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/un_combat_helmet.png"), new ResourceLocation("marbledsarsenal", "animations/combat_helmet.animation.json")));
        }));
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.OLIVE_COMBAT_HELMET, createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/combat_helmet.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/olive_combat_helmet.png"), new ResourceLocation("marbledsarsenal", "animations/combat_helmet.animation.json")));
        }));
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.MEDICAL_COMBAT_HELMET, createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/combat_helmet.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/medical_combat_helmet.png"), new ResourceLocation("marbledsarsenal", "animations/combat_helmet.animation.json")));
        }));
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.MEDICAL_UN_COMBAT_HELMET, createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/combat_helmet.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/medical_un_combat_helmet.png"), new ResourceLocation("marbledsarsenal", "animations/combat_helmet.animation.json")));
        }));
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.MEDICAL_OLIVE_COMBAT_HELMET, createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/combat_helmet.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/medical_olive_combat_helmet.png"), new ResourceLocation("marbledsarsenal", "animations/combat_helmet.animation.json")));
        }));
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.BLACK_MILITARY_BERET, createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/military_beret.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/black_military_beret.png"), new ResourceLocation("marbledsarsenal", "animations/military_beret.animation.json")));
        }));
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.RED_MILITARY_BERET, createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/military_beret.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/red_military_beret.png"), new ResourceLocation("marbledsarsenal", "animations/military_beret.animation.json")));
        }));
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.UN_MILITARY_BERET, createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/military_beret.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/un_military_beret.png"), new ResourceLocation("marbledsarsenal", "animations/military_beret.animation.json")));
        }));
        RenderProvider blackPlateRenderProvider = createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/plate_carrier.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/black_plate_carrier.png"), new ResourceLocation("marbledsarsenal", "animations/plate_carrier.animation.json")));
        });
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.BLACK_PLATE_CARRIER_T1, blackPlateRenderProvider);
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.BLACK_PLATE_CARRIER_T2, blackPlateRenderProvider);
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.BLACK_PLATE_CARRIER_T3, blackPlateRenderProvider);
        RenderProvider olivePlateRenderProvider = createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/plate_carrier.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/olive_plate_carrier.png"), new ResourceLocation("marbledsarsenal", "animations/plate_carrier.animation.json")));
        });
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.OLIVE_PLATE_CARRIER_T1, olivePlateRenderProvider);
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.OLIVE_PLATE_CARRIER_T2, olivePlateRenderProvider);
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.OLIVE_PLATE_CARRIER_T3, olivePlateRenderProvider);
        RenderProvider riotArmorRenderProvider = createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/riot_armor.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/riot_armor.png"), new ResourceLocation("marbledsarsenal", "animations/riot_armor.animation.json")));
        });
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.RIOT_ARMOR_HELMET, riotArmorRenderProvider);
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.RIOT_ARMOR_CHESTPLATE, riotArmorRenderProvider);
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.RIOT_ARMOR_LEGGINGS, riotArmorRenderProvider);
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.RIOT_ARMOR_BOOTS, riotArmorRenderProvider);
        RenderProvider winterMilitaryArmorRenderer = createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/military_armor.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/winter_military_armor.png"), new ResourceLocation("marbledsarsenal", "animations/military_armor.animation.json")));
        });
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.WINTER_MILITARY_ARMOR_HELMET, winterMilitaryArmorRenderer);
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.WINTER_MILITARY_ARMOR_CHESTPLATE, winterMilitaryArmorRenderer);
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.WINTER_MILITARY_ARMOR_LEGGINGS, winterMilitaryArmorRenderer);
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.WINTER_MILITARY_ARMOR_BOOTS, winterMilitaryArmorRenderer);
        RenderProvider desertMilitaryArmorRenderer = createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/military_armor.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/desert_military_armor.png"), new ResourceLocation("marbledsarsenal", "animations/military_armor.animation.json")));
        });
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.DESERT_MILITARY_ARMOR_HELMET, desertMilitaryArmorRenderer);
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.DESERT_MILITARY_ARMOR_CHESTPLATE, desertMilitaryArmorRenderer);
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.DESERT_MILITARY_ARMOR_LEGGINGS, desertMilitaryArmorRenderer);
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.DESERT_MILITARY_ARMOR_BOOTS, desertMilitaryArmorRenderer);
        RenderProvider swatArmorRenderer = createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/swat_armor.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/swat_armor.png"), new ResourceLocation("marbledsarsenal", "animations/swat_armor.animation.json")));
        });
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.SWAT_ARMOR_HELMET, swatArmorRenderer);
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.SWAT_ARMOR_CHESTPLATE, swatArmorRenderer);
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.SWAT_ARMOR_LEGGINGS, swatArmorRenderer);
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.SWAT_ARMOR_BOOTS, swatArmorRenderer);
        RenderProvider hazmatArmorRenderer = createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/hazmat_armor.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/hazmat_armor.png"), new ResourceLocation("marbledsarsenal", "animations/hazmat_armor.animation.json")));
        });
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.HAZMAT_ARMOR_HELMET, hazmatArmorRenderer);
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.HAZMAT_ARMOR_CHESTPLATE, hazmatArmorRenderer);
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.HAZMAT_ARMOR_LEGGINGS, hazmatArmorRenderer);
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.HAZMAT_ARMOR_BOOTS, hazmatArmorRenderer);
        RenderProvider oliveJuggernautArmorRenderer = createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/juggernaut_armor.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/olive_juggernaut_armor.png"), new ResourceLocation("marbledsarsenal", "animations/juggernaut_armor.animation.json")));
        });
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.OLIVE_JUGGERNAUT_ARMOR_HELMET, oliveJuggernautArmorRenderer);
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.OLIVE_JUGGERNAUT_ARMOR_CHESTPLATE, oliveJuggernautArmorRenderer);
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.OLIVE_JUGGERNAUT_ARMOR_LEGGINGS, oliveJuggernautArmorRenderer);
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.OLIVE_JUGGERNAUT_ARMOR_BOOTS, oliveJuggernautArmorRenderer);
        RenderProvider blackJuggernautArmorRenderer = createRenderProvider(() -> {
            return new BasicGeoArmorRenderer(new BasicGeoModel(new ResourceLocation("marbledsarsenal", "geo/juggernaut_armor.geo.json"), new ResourceLocation("marbledsarsenal", "textures/armor/black_juggernaut_armor.png"), new ResourceLocation("marbledsarsenal", "animations/juggernaut_armor.animation.json")));
        });
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.BLACK_JUGGERNAUT_ARMOR_HELMET, blackJuggernautArmorRenderer);
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.BLACK_JUGGERNAUT_ARMOR_CHESTPLATE, blackJuggernautArmorRenderer);
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.BLACK_JUGGERNAUT_ARMOR_LEGGINGS, blackJuggernautArmorRenderer);
        MarbledsArsenalItems.renderers.put(MarbledsArsenalItems.BLACK_JUGGERNAUT_ARMOR_BOOTS, blackJuggernautArmorRenderer);
    }

    protected static <T extends GeoArmorRenderer> RenderProvider createRenderProvider(Supplier<T> supplier) {
        return new RenderProvider() {
            private T renderer;

            public HumanoidModel getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, HumanoidModel original) {
                if (this.renderer == null) {
                    this.renderer = supplier.get();
                }

                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);
                return this.renderer;
            }
        };
    }
}
