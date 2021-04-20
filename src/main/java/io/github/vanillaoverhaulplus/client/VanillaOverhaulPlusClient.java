package io.github.vanillaoverhaulplus.client;

import io.github.vanillaoverhaulplus.entity.smallbee.SmallBeeEntityRenderer;
import io.github.vanillaoverhaulplus.registry.RegistryEntity;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class VanillaOverhaulPlusClient implements ClientModInitializer {
	@Override
	public void onInitializeClient () {
		EntityRendererRegistry.INSTANCE.register(RegistryEntity.SMALL_BEE, (dispatcher, context) -> new SmallBeeEntityRenderer(dispatcher));
	}
}
