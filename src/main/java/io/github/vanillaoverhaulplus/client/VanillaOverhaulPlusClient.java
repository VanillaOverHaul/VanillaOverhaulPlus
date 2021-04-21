package io.github.vanillaoverhaulplus.client;

import io.github.vanillaoverhaulplus.entity.smallbee.SmallBeeEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.minecraft.entity.EntityType;

@Environment(EnvType.CLIENT)
public class VanillaOverhaulPlusClient implements ClientModInitializer {
	@Override
	public void onInitializeClient () {
		EntityRendererRegistry.INSTANCE.register(EntityType.BEE, (dispatcher, context) -> new SmallBeeEntityRenderer(dispatcher));
	}
}
