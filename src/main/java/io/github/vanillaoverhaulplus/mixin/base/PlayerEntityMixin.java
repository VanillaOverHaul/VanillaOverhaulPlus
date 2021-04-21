package io.github.vanillaoverhaulplus.mixin.base;

import io.github.vanillaoverhaulplus.interfaces.PlayerEntityInterface;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundTag;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin implements PlayerEntityInterface {
	private boolean hasReceivedPigsFlyAchievement = false;

	@Inject(at = @At("TAIL"), method = "writeCustomDataToTag")
	public void writeCustomDataToTag (CompoundTag tag, CallbackInfo ci) {
		tag.putBoolean("hasReceivedPigsFlyAchievement", hasReceivedPigsFlyAchievement);
	}

	@Inject(at = @At("TAIL"), method = "readCustomDataFromTag")
	public void readCustomDataFromTag (CompoundTag tag, CallbackInfo ci) {
		if (tag.contains("hasReceivedPigsFlyAchievement")) {
			this.hasReceivedPigsFlyAchievement = tag.getBoolean("hasReceivedPigsFlyAchievement");
		}
	}

	// Utility methods
	@Override
	public void setHasReceivedPigsFlyAchievement (boolean hasPigsFlied) {
		this.hasReceivedPigsFlyAchievement = hasPigsFlied;
	}

	@Override
	public boolean getHasReceivedPigsFlyAchievement () {
		return this.hasReceivedPigsFlyAchievement;
	}
}
