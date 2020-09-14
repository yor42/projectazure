package com.yor42.projectazure.registry;

import com.yor42.projectazure.gameobject.entity.entityTestDummy;
import com.yor42.projectazure.utils.references.defined;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;

@Environment(EnvType.CLIENT)
public class entityregister {

    public static final EntityType<entityTestDummy> DUMMY = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(defined.modid, "dummy"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, entityTestDummy::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
    );


    public static void registerEntityAttribute() {
        FabricDefaultAttributeRegistry.register(DUMMY, entityTestDummy.createMobAttributes());
    }
}
