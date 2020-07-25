package net.fabricmc.sfort;

import net.fabricmc.api.ModInitializer;

public class ForceConnect implements ModInitializer {
	@Override
	public void onInitialize() {
		System.out.println("Force connecting client");
	}
}