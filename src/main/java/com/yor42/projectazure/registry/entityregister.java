package com.yor42.projectazure.registry;

import com.yor42.projectazure.gameobject.entity.entityTestDummy;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class entityregister implements ModInitializer {

    public static final EntityType<entityTestDummy> DUMMY = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("entitytesting", "cube"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, entityTestDummy::new).dimensions(EntityDimensions.fixed(1f, 1f)).build()
    );

    @Override
    public void onInitialize() {
        FabricDefaultAttributeRegistry.register(DUMMY, entityTestDummy.createMobAttributes());
    }
}
