package dev.kazai.marbledsarsenal.item.client;

import net.minecraft.world.item.ArmorItem;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class BasicGeoArmorRenderer<T extends ArmorItem & GeoItem> extends GeoArmorRenderer<T> {
    public BasicGeoArmorRenderer(GeoModel<T> model) {
        super(model);
    }
}
