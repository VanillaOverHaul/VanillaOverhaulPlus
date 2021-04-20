package io.github.vanillaoverhaulplus.entity.smallbee;

import io.github.vanillaoverhaulplus.registry.RegistryHelper;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class SmallBeeEntityRenderer extends MobEntityRenderer<SmallBeeEntity, SmallBeeEntityModel> {

	public SmallBeeEntityRenderer (EntityRenderDispatcher entityRenderDispatcher) {
		super(entityRenderDispatcher, new SmallBeeEntityModel(), 0.5F);
	}

	@Override
	public Identifier getTexture (SmallBeeEntity entity) {
		return new Identifier(RegistryHelper.MOD_ID, "textures/entity/smallbee/smallbee.png");
	}
}
