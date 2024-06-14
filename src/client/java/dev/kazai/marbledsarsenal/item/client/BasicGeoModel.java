package dev.kazai.marbledsarsenal.item.client;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.model.GeoModel;

public class BasicGeoModel<T extends Item & GeoItem> extends GeoModel<T> {
    protected final ResourceLocation modelResource;
    protected final ResourceLocation textureResource;
    protected final ResourceLocation animationResource;

    public BasicGeoModel(ResourceLocation modelResource, ResourceLocation textureResource, ResourceLocation animationResource) {
        this.modelResource = modelResource;
        this.textureResource = textureResource;
        this.animationResource = animationResource;
    }

    public ResourceLocation getModelResource(T animatable) {
        return this.modelResource;
    }

    public ResourceLocation getTextureResource(T animatable) {
        return this.textureResource;
    }

    public ResourceLocation getAnimationResource(T animatable) {
        return this.animationResource;
    }
}
