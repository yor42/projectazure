package com.yor42.projectazure;

import com.yor42.projectazure.gameobject.entity.render.testdummyrenderer;
import com.yor42.projectazure.registry.entityregister;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

public class mainClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.INSTANCE.register(entityregister.DUMMY, (dispatcher, context) -> new testdummyrenderer(dispatcher));
    }
}
