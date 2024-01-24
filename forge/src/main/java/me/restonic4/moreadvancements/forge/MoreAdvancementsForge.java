package me.restonic4.moreadvancements.forge;

import dev.architectury.platform.forge.EventBuses;
import me.restonic4.moreadvancements.MoreAdvancements;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MoreAdvancements.MOD_ID)
public class MoreAdvancementsForge {
    public MoreAdvancementsForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(MoreAdvancements.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        MoreAdvancements.init();
    }
}