package me.restonic4.moreadvancements.fabric;

import me.restonic4.moreadvancements.MoreAdvancements;
import net.fabricmc.api.ModInitializer;

public class MoreAdvancementsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        MoreAdvancements.init();
    }
}