package com.github.camotoy.bedrockskinutility.client;

import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.entity.LivingEntity;

public class BedrockPlayerEntityModel<T extends LivingEntity> extends PlayerEntityModel<T> {
    public BedrockPlayerEntityModel() {
        super(0.0F, false);
    }
}
