package io.github.vanillaoverhaulplus;

import io.github.vanillaoverhaulplus.registry.RegistryHelper;
import net.fabricmc.api.ModInitializer;

public class VanillaOverhaulPlus implements ModInitializer {
	@Override
	public void onInitialize () {
		RegistryHelper.initializeRegistries();
		Fluids.registerFluids();
	}
}
