package com.yor42.projectazure.gameobject.entity.render;

import com.yor42.projectazure.gameobject.entity.entityTestDummy;
import com.yor42.projectazure.gameobject.entity.model.entityTestDummyModel;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;

public class testdummyrenderer extends MobEntityRenderer<entityTestDummy, entityTestDummyModel> {

    public testdummyrenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new entityTestDummyModel(), 0.5f);
    }

    @Override
    public Identifier getTexture(entityTestDummy entity) {
        return new Identifier("projectazure", "textures/entity/testdummy/testdummy.png");
    }
}
