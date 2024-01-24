package me.restonic4.moreadvancements.quilt;

import me.restonic4.moreadvancements.MoreAdvancements;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class MoreAdvancementsQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        MoreAdvancements.init();
    }
}