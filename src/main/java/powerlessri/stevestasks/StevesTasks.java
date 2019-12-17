package powerlessri.stevestasks;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import vswe.stevesfactory.StevesFactoryManager;

@Mod(StevesTasks.MODID)
public class StevesTasks {

    public static final String MODID = "stevestasks";

    public static StevesTasks instance;

    public StevesTasks() {
        instance = this;
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_SPEC);
    }
}
