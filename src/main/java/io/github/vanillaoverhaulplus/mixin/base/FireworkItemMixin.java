package io.github.vanillaoverhaulplus.mixin.base;

import io.github.vanillaoverhaulplus.interfaces.PlayerEntityInterface;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.toast.SystemToast;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.FireworkItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Random;

@Mixin(FireworkItem.class)
public abstract class FireworkItemMixin extends Item {

	// Dummy constructor
	public FireworkItemMixin (Settings settings) {
		super(settings);
	}

	@Inject(at = @At("TAIL"), method = "use")
	public void use (World world, PlayerEntity user, Hand hand, CallbackInfoReturnable<TypedActionResult<ItemStack>> cir) {
		Random random = new Random();
		if (!world.isClient) {
			if (user.getVehicle() instanceof PigEntity) {
				if (user.getStackInHand(hand).getItem().equals(this) && user.getEquippedStack(EquipmentSlot.CHEST).getItem() instanceof ElytraItem) {
					if (random.nextInt(10) == 3) {
						Vec3d velocity = user.getVehicle().getVelocity();
						user.getVehicle().setVelocity(velocity.getX(), 2.0F, velocity.getZ());
						((PlayerEntityInterface) user).setHasReceivedPigsFlyAchievement(true);
					}
				}
			}
		}

		if (((PlayerEntityInterface) user).getHasReceivedPigsFlyAchievement() && world.isClient) {
			MinecraftClient client = MinecraftClient.getInstance();
			SystemToast.show(client.getToastManager(), SystemToast.Type.TUTORIAL_HINT, Text.of("When Pigs Fly II"), Text.of("Make a pig fly up to 20 blocks with an elytra and firework"));
		}
	}
}
