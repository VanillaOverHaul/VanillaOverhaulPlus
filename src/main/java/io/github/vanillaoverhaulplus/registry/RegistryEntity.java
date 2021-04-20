package io.github.vanillaoverhaulplus.registry;

import io.github.vanillaoverhaulplus.entity.smallbee.SmallBeeEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegistryEntity {

	public static final EntityType<SmallBeeEntity> SMALL_BEE = Registry.register(
		Registry.ENTITY_TYPE,
		new Identifier(RegistryHelper.MOD_ID, "small_bee"),
		FabricEntityTypeBuilder.create(SpawnGroup.AMBIENT, SmallBeeEntity::new)
			.dimensions(EntityDimensions.fixed(0.75F, 0.75F))
			.build()
	);

	public static void initializeEntities() {
		FabricDefaultAttributeRegistry.register(SMALL_BEE, SmallBeeEntity.createBeeAttributes());
	}
}
