// Made with Blockbench 3.6.5
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package com.yor42.projectazure.gameobject.entity.model;

import com.yor42.projectazure.gameobject.entity.entityTestDummy;
import com.yor42.projectazure.utils.references.defined;
import software.bernie.geckolib.forgetofabric.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class entityTestDummyModel extends AnimatedEntityModel<entityTestDummy> {

    private final AnimatedModelRenderer bone;
	private final AnimatedModelRenderer LeftArm;
	private final AnimatedModelRenderer lowerleftarm;
	private final AnimatedModelRenderer Head;
	private final AnimatedModelRenderer Rightarm;
	private final AnimatedModelRenderer lowerrighttarm;
	private final AnimatedModelRenderer rightleg;
	private final AnimatedModelRenderer Rightlowerleg;
	private final AnimatedModelRenderer leftleg;
	private final AnimatedModelRenderer lowerleftleg;

    public entityTestDummyModel()
    {
        textureWidth = 32;
    textureHeight = 32;
    bone = new AnimatedModelRenderer(this);
		bone.setRotationPoint(0.0F, 8.5F, 0.0F);
		bone.setTextureOffset(0, 0).addBox(-4.0F, -5.5F, -2.0F, 8.0F, 11.0F, 4.0F, 0.0F, false);
		bone.setModelRendererName("bone");
		this.registerModelRenderer(bone);

		LeftArm = new AnimatedModelRenderer(this);
		LeftArm.setRotationPoint(4.0F, -3.5F, 0.0F);
		bone.addChild(LeftArm);
		LeftArm.setTextureOffset(0, 0).addBox(0.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		LeftArm.setModelRendererName("LeftArm");
		this.registerModelRenderer(LeftArm);

		lowerleftarm = new AnimatedModelRenderer(this);
		lowerleftarm.setRotationPoint(2.0F, 4.0F, 2.0F);
		LeftArm.addChild(lowerleftarm);
		lowerleftarm.setTextureOffset(0, 0).addBox(-2.0F, 0.0F, -4.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		lowerleftarm.setModelRendererName("lowerleftarm");
		this.registerModelRenderer(lowerleftarm);

		Head = new AnimatedModelRenderer(this);
		Head.setRotationPoint(-0.5F, -5.5F, 0.0F);
		bone.addChild(Head);
		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		Head.setModelRendererName("Head");
		this.registerModelRenderer(Head);

		Rightarm = new AnimatedModelRenderer(this);
		Rightarm.setRotationPoint(-4.0F, -3.5F, 0.0F);
		bone.addChild(Rightarm);
		Rightarm.setTextureOffset(0, 0).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		Rightarm.setModelRendererName("Rightarm");
		this.registerModelRenderer(Rightarm);

		lowerrighttarm = new AnimatedModelRenderer(this);
		lowerrighttarm.setRotationPoint(-2.0F, 4.0F, 2.0F);
		Rightarm.addChild(lowerrighttarm);
		lowerrighttarm.setTextureOffset(0, 0).addBox(-2.0F, 0.0F, -4.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		lowerrighttarm.setModelRendererName("lowerrighttarm");
		this.registerModelRenderer(lowerrighttarm);

		rightleg = new AnimatedModelRenderer(this);
		rightleg.setRotationPoint(-2.0F, 5.5F, 0.0F);
		bone.addChild(rightleg);
		rightleg.setTextureOffset(0, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		rightleg.setModelRendererName("rightleg");
		this.registerModelRenderer(rightleg);

		Rightlowerleg = new AnimatedModelRenderer(this);
		Rightlowerleg.setRotationPoint(0.0F, 5.0F, -2.0F);
		rightleg.addChild(Rightlowerleg);
		Rightlowerleg.setTextureOffset(0, 0).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		Rightlowerleg.setModelRendererName("Rightlowerleg");
		this.registerModelRenderer(Rightlowerleg);

		leftleg = new AnimatedModelRenderer(this);
		leftleg.setRotationPoint(2.0F, 5.5F, 0.0F);
		bone.addChild(leftleg);
		leftleg.setTextureOffset(0, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		leftleg.setModelRendererName("leftleg");
		this.registerModelRenderer(leftleg);

		lowerleftleg = new AnimatedModelRenderer(this);
		lowerleftleg.setRotationPoint(0.0F, 5.0F, -2.0F);
		leftleg.addChild(lowerleftleg);
		lowerleftleg.setTextureOffset(0, 0).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		lowerleftleg.setModelRendererName("lowerleftleg");
		this.registerModelRenderer(lowerleftleg);

    this.rootBones.add(bone);
  }


    @Override
    public ResourceLocation getAnimationFileLocation()
    {
        return new ResourceLocation(defined.modid, "animations/testdummy.json");
    }
}