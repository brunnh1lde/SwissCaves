package com.brunnh1lde.swisscaves.mixins;

import net.minecraft.world.gen.MapGenCaves;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(MapGenCaves.class)
public abstract class MixinMapGenCaves {
    @ModifyArg(method = "func_151538_a(Lnet/minecraft/world/World;IIII[Lnet/minecraft/block/Block;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
    private int val1(int bound)
    {
        return 40;
    }

    @ModifyArg(method = "func_151538_a(Lnet/minecraft/world/World;IIII[Lnet/minecraft/block/Block;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
    private int val2(int bound)
    {
        return 15;
    }
}
