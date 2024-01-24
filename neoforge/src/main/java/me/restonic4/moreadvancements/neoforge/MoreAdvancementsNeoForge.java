package me.restonic4.moreadvancements.neoforge;

import me.restonic4.moreadvancements.MoreAdvancements;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(MoreAdvancements.MOD_ID)
public class MoreAdvancementsNeoForge {
	public MoreAdvancementsNeoForge(IEventBus modEventBus) {
		MoreAdvancements.init();
	}
}
