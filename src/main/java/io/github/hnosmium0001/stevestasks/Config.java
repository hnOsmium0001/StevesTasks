package io.github.hnosmium0001.stevestasks;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;

public final class Config {

    private Config() {
    }

    public static final CommonCategory COMMON;

    public static final class CommonCategory {

        public final BooleanValue enableRSTrigger;
        public final BooleanValue enableAE2Trigger;

        public CommonCategory(ForgeConfigSpec.Builder builder) {
            builder.comment("Procedures config options", "Run '/sfm componentGroups reload' after updating config").push("procedures");
            enableRSTrigger = builder.define("enableRSTrigger", true);
            enableAE2Trigger = builder.define("enableAE2Trigger", true);
            builder.pop();
        }
    }

    static final ForgeConfigSpec COMMON_SPEC;

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
        COMMON = new CommonCategory(builder);
        COMMON_SPEC = builder.build();
    }
}
