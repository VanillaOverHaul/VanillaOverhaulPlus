package io.github.vanillaoverhaulplus.entity.smallbee;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.world.World;

@SuppressWarnings("EntityConstructor")
public class SmallBeeEntity extends BeeEntity {

	public SmallBeeEntity (EntityType<? extends BeeEntity> entityType, World world) {
		super(entityType, world);
	}
}
