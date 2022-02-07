package com.legendreaper.create_expansion.client.model;// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.legendreaper.create_expansion.CreateExpansion;
import com.legendreaper.create_expansion.content.entities.NileCrocodileEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class NileCrocodileModel <Type extends NileCrocodileEntity> extends EntityModel<Type> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(CreateExpansion.MOD_ID, "nile_crocodile"), "main");
	private final ModelPart nileCrocodile;

	public NileCrocodileModel(ModelPart root) {
		this.nileCrocodile = root.getChild("nileCrocodile");
	}




	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition nileCrocodile = partdefinition.addOrReplaceChild("nileCrocodile", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition neck = nileCrocodile.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(88, 32).addBox(-5.5652F, -5.0F, -7.9F, 13.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.9348F, -6.0F, -11.0921F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -0.0714F, -6.5929F));

		PartDefinition bottom_jaw = head.addOrReplaceChild("bottom_jaw", CubeListBuilder.create().texOffs(0, 93).addBox(-4.5652F, -2.8164F, -9.9369F, 11.0F, 2.0F, 10.0F, new CubeDeformation(0.0035F))
		.texOffs(42, 90).addBox(-4.5652F, -0.8164F, -9.9369F, 11.0F, 4.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(104, 15).addBox(-2.5652F, -0.8164F, -19.9369F, 7.0F, 3.0F, 10.0F, new CubeDeformation(-0.005F))
		.texOffs(28, 104).addBox(-2.5652F, -2.8164F, -19.9369F, 7.0F, 2.0F, 10.0F, new CubeDeformation(0.025F)), PartPose.offset(0.0F, 1.8878F, -1.3702F));

		PartDefinition upperJaw = head.addOrReplaceChild("upperJaw", CubeListBuilder.create().texOffs(33, 70).addBox(-4.5652F, -4.1F, -9.6F, 11.0F, 5.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(0, 10).addBox(-2.5652F, -4.1F, -20.6F, 7.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(84, 90).addBox(-2.5652F, -3.1F, -20.6F, 7.0F, 4.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(95, 0).addBox(-2.5652F, 0.9F, -19.6F, 7.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(14, 0).addBox(-2.5652F, -6.0128F, -6.6019F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 14).addBox(2.4348F, -6.0128F, -6.6019F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(90, 67).addBox(-4.5652F, 0.9F, -9.6F, 11.0F, 2.0F, 10.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, 0.1714F, -1.7071F));

		PartDefinition body = neck.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 40).addBox(-4.0652F, -4.5F, 1.0F, 10.0F, 2.0F, 28.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.5652F, -2.5F, 1.0F, 17.0F, 12.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.5F, -2.9F));

		PartDefinition leftFrontLeg = body.addOrReplaceChild("leftFrontLeg", CubeListBuilder.create().texOffs(52, 104).mirror().addBox(1.4348F, -2.0F, -1.0F, 9.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 0).mirror().addBox(10.4348F, -2.0F, -1.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(7.0F, 7.2F, 3.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition leftBackLeg = body.addOrReplaceChild("leftBackLeg", CubeListBuilder.create().texOffs(52, 104).mirror().addBox(1.4348F, -2.0F, -6.0F, 9.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 0).mirror().addBox(10.4348F, -2.0F, -6.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(7.0F, 7.2F, 28.0F));

		PartDefinition rightBackLeg = body.addOrReplaceChild("rightBackLeg", CubeListBuilder.create().texOffs(52, 104).addBox(-8.5652F, -2.0F, -6.0F, 9.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-12.5652F, -2.0F, -6.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, 7.2F, 28.0F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(48, 40).addBox(-4.5652F, -3.75F, 0.5F, 11.0F, 9.0F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(57, 67).addBox(-2.5652F, -6.75F, -0.5F, 7.0F, 4.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.25F, 28.5F));

		PartDefinition tailSegment1 = tail.addOrReplaceChild("tailSegment1", CubeListBuilder.create().texOffs(62, 0).addBox(-2.5652F, -1.5F, 1.0F, 7.0F, 6.0F, 19.0F, new CubeDeformation(0.0F))
		.texOffs(0, 70).addBox(-2.5652F, -5.5F, 1.0F, 7.0F, 4.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.75F, 17.5F, 0.0F, 0.0F, 0.0F));

		PartDefinition rightFrontLeg = body.addOrReplaceChild("rightFrontLeg", CubeListBuilder.create().texOffs(52, 104).addBox(-8.5652F, -2.0F, -1.0F, 9.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-12.5652F, -2.0F, -1.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, 7.2F, 3.0F, 0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 135, 135);
	}


	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		this.nileCrocodile.render(poseStack, buffer, packedLight, packedOverlay);
	}

	@Override
	public void setupAnim(NileCrocodileEntity pEntity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {

	}
}