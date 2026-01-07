package me.aidrob.mixin;

import net.minecraft.client.option.GameOptions;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(GameOptions.class)
public class MixinGameOptions {

    // Sửa giá trị nhỏ nhất của FOV (mặc định là 30) thành 0
    @ModifyConstant(method = "<init>", constant = @Constant(intValue = 30))
    private int modifyMinFov(int constant) {
        return 0;
    }

    // Sửa giá trị lớn nhất của FOV (mặc định là 110) thành 200
    @ModifyConstant(method = "<init>", constant = @Constant(intValue = 110))
    private int modifyMaxFov(int constant) {
        return 200;
    }
}
