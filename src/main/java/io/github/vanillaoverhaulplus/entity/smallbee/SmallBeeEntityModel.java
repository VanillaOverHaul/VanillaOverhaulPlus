package io.github.vanillaoverhaulplus.entity.smallbee;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class SmallBeeEntityModel extends EntityModel<SmallBeeEntity> {
	private final ModelPart body;
	private final ModelPart left_wing;
	private final ModelPart right_wing;
	private final ModelPart front_legs;
	private final ModelPart middle_legs;
	private final ModelPart back_legs;
	private final ModelPart left_antenna;
	private final ModelPart stinger;
	private final ModelPart right_antenna;
	private final ModelPart torso;

	public SmallBeeEntityModel() {
		textureWidth = 32;
		textureHeight = 32;

		body = new ModelPart(this);
		body.setPivot(0.0F, 19.0F, 0.0F);


		left_wing = new ModelPart(this);
		left_wing.setPivot(-1.5F, 15.0F, -3.0F);
		left_wing.setTextureOffset(1, 10).addCuboid(1.75F, 4.5F, 1.5F, 5.0F, 0.0F, 3.0F, 0.0F, true);

		right_wing = new ModelPart(this);
		right_wing.setPivot(1.5F, 15.0F, -3.0F);
		right_wing.setTextureOffset(1, 10).addCuboid(-7.25F, 4.5F, 1.5F, 5.0F, 0.0F, 3.0F, 0.0F, false);

		front_legs = new ModelPart(this);
		front_legs.setPivot(-1.5F, 22.0F, -2.0F);
		front_legs.setTextureOffset(21, 3).addCuboid(0.25F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, 0.0F, false);

		middle_legs = new ModelPart(this);
		middle_legs.setPivot(-1.5F, 22.0F, 0.0F);
		middle_legs.setTextureOffset(24, 3).addCuboid(-0.25F, 1.0F, 0.0F, 3.0F, 1.0F, 0.0F, 0.0F, false);

		back_legs = new ModelPart(this);
		back_legs.setPivot(-1.5F, 22.0F, 2.0F);
		back_legs.setTextureOffset(24, 3).addCuboid(-0.25F, 1.0F, -1.0F, 3.0F, 1.0F, 0.0F, 0.0F, false);

		left_antenna = new ModelPart(this);
		left_antenna.setPivot(0.0F, 17.0F, -5.0F);
		left_antenna.setTextureOffset(14, 1).addCuboid(0.25F, 2.5F, 1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		stinger = new ModelPart(this);
		stinger.setPivot(0.0F, 19.0F, 0.0F);
		stinger.setTextureOffset(1, 1).addCuboid(0.0F, 1.5F, 2.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);

		right_antenna = new ModelPart(this);
		right_antenna.setPivot(0.0F, 17.0F, -5.0F);
		right_antenna.setTextureOffset(14, 1).addCuboid(-1.75F, 2.5F, 1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		torso = new ModelPart(this);
		torso.setPivot(0.0F, 19.0F, 0.0F);
		torso.setTextureOffset(0, 0).addCuboid(-2.25F, 0.0F, -2.5F, 4.0F, 4.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void setAngles (SmallBeeEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

	}

	@Override
	public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_wing.render(matrixStack, buffer, packedLight, packedOverlay);
		right_wing.render(matrixStack, buffer, packedLight, packedOverlay);
		front_legs.render(matrixStack, buffer, packedLight, packedOverlay);
		middle_legs.render(matrixStack, buffer, packedLight, packedOverlay);
		back_legs.render(matrixStack, buffer, packedLight, packedOverlay);
		left_antenna.render(matrixStack, buffer, packedLight, packedOverlay);
		stinger.render(matrixStack, buffer, packedLight, packedOverlay);
		right_antenna.render(matrixStack, buffer, packedLight, packedOverlay);
		torso.render(matrixStack, buffer, packedLight, packedOverlay);
	}
}
