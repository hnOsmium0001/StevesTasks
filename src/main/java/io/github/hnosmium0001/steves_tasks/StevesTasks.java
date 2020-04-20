package io.github.hnosmium0001.steves_tasks;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;

@Mod(StevesTasks.MODID)
public class StevesTasks {

    public static final String MODID = "steves_tasks";

    public static StevesTasks instance;

    public StevesTasks() {
        instance = this;
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_SPEC);
    }
}
