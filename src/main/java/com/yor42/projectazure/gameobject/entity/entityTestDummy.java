package com.yor42.projectazure.gameobject.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import software.bernie.geckolib.animation.builder.AnimationBuilder;
import software.bernie.geckolib.animation.controller.AnimationController;
import software.bernie.geckolib.animation.controller.EntityAnimationController;
import software.bernie.geckolib.entity.IAnimatedEntity;
import software.bernie.geckolib.event.AnimationTestEvent;
import software.bernie.geckolib.manager.EntityAnimationManager;

public class entityTestDummy extends PathAwareEntity implements IAnimatedEntity {
    private EntityAnimationManager manager = new EntityAnimationManager();
    private AnimationController controller = new EntityAnimationController(this, "movecontroller", 20, this::animationPredicate);

    public entityTestDummy(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public EntityAnimationManager getAnimationManager() {
        return manager;
    }

    private <E extends entityTestDummy> boolean animationPredicate(AnimationTestEvent<E> event){
        if (event.isWalking()){
            controller.setAnimation(new AnimationBuilder().addAnimation("animation.projectazure.testdummywalk", true));
            return true;
        }
        else{
            controller.setAnimation(new AnimationBuilder().addAnimation("animation.projectazure.testdummyidle", true));
            return true;
        }
    }
}
