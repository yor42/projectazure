package com.yor42.projectazure;

import com.yor42.projectazure.gameobject.entity.render.testdummyrenderer;
import com.yor42.projectazure.registry.entityregister;
import com.yor42.projectazure.registry.itemregistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

public class ProjectAzure implements ModInitializer {


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		itemregistry.registeritems();
		entityregister.registerEntityAttribute();
		System.out.println("Hello Fabric!");

	}
}
