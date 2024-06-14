package dev.kazai.marbledsarsenal.item;

import net.minecraft.core.Holder;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.GeoRenderProvider;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.animation.*;

import java.util.function.Consumer;

public class BasicGeoArmorItem extends ArmorItem implements GeoItem {
    protected final AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);
    protected final String animationName;

    public BasicGeoArmorItem(String animationName, Holder<ArmorMaterial> armorMaterial, ArmorItem.Type type, Item.Properties properties) {
        super(armorMaterial, type, properties);
        this.animationName = animationName;
    }
    public void createGeoRenderer(Consumer<GeoRenderProvider> consumer) {
        consumer.accept(MarbledsArsenalItems.renderers.get(this));
    }

    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        controllerRegistrar.add(new AnimationController[]{new AnimationController(this, "controller", 0, this::predicate)});
    }

    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }

    private PlayState predicate(AnimationState animationState) {
        animationState.getController().setAnimation(RawAnimation.begin().then(this.animationName, Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }
}