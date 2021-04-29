package io.github.vanillaoverhaulplus.fluid;

import io.github.vanillaoverhaulplus.item.NewMilkBucketItem;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.FluidBlock;
import net.minecraft.block.Material;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static io.github.vanillaoverhaulplus.registry.RegistryHelper.MOD_ID;
import static net.minecraft.item.Items.BUCKET;

public class Fluids {
    public static FlowableFluid FLOWING_MILK;
    public static FlowableFluid STILL_MILK;
    public static Block MILK;
    public static Item NEW_MILK_BUCKET;
    public static FlowableFluid FLOWING_HONEY;
    public static FlowableFluid STILL_HONEY;
    public static Block HONEY;
    public static Item HONEY_BUCKET;

public static void registerFluids() {
    STILL_MILK = Registry.register(Registry.FLUID, new Identifier(MOD_ID, "milk"), new MilkFluid.Still());
    FLOWING_MILK = Registry.register(Registry.FLUID, new Identifier(MOD_ID, "flowing_milk"), new MilkFluid.Flowing());
    MILK = Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "milk"), new FluidBlock(STILL_MILK, FabricBlockSettings.of(Material.WATER).strength(100.0F).dropsNothing()){});
    NEW_MILK_BUCKET = Registry.register(Registry.ITEM, new Identifier(MOD_ID,"new_milk_bucket"),new NewMilkBucketItem((new Item.Settings()).recipeRemainder(BUCKET).maxCount(1).group(ItemGroup.MISC)));
    STILL_HONEY = Registry.register(Registry.FLUID, new Identifier(MOD_ID, "honey"), new HoneyFluid.Still());
    FLOWING_HONEY = Registry.register(Registry.FLUID, new Identifier(MOD_ID, "flowing_honey"), new HoneyFluid.Flowing());
    HONEY_BUCKET = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "honey_bucket"), new BucketItem(STILL_HONEY, new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1)));
    HONEY = Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "honey"), new FluidBlock(STILL_HONEY, FabricBlockSettings.of(Material.WATER).strength(100.0F).dropsNothing()){});

}
}
