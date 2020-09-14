package com.yor42.projectazure.gameobject.entity.render;

import com.yor42.projectazure.gameobject.entity.entityTestDummy;
import com.yor42.projectazure.gameobject.entity.model.entityTestDummyModel;
import com.yor42.projectazure.utils.references.defined;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class testdummyrenderer extends MobEntityRenderer<entityTestDummy, entityTestDummyModel> {

    public testdummyrenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new entityTestDummyModel(), 0.5f);
    }

    @Override
    public Identifier getTexture(entityTestDummy entity) {
        return new Identifier(defined.modid, "textures/entity/testdummy.png");
    }

    @Override
    protected void setupTransforms(entityTestDummy entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
        super.setupTransforms(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);
    }
}
