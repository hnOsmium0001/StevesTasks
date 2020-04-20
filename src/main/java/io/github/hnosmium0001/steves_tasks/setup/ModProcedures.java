package io.github.hnosmium0001.steves_tasks.setup;

import io.github.hnosmium0001.steves_tasks.StevesTasks;
import io.github.hnosmium0001.steves_tasks.logic.procedure.RSTriggerProcedure;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.IForgeRegistry;
import vswe.stevesfactory.api.StevesFactoryManagerAPI;
import vswe.stevesfactory.api.logic.IProcedure;
import vswe.stevesfactory.api.logic.IProcedureType;
import vswe.stevesfactory.api.visibility.GUIVisibility;
import vswe.stevesfactory.logic.SimpleProcedureType;

import java.util.function.Supplier;

@EventBusSubscriber(modid = StevesTasks.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModProcedures {

    // TODO only load if RS is present
    public static IProcedureType<RSTriggerProcedure> rsTriggerProcedure;

    @SubscribeEvent
    public static void onProcedureRegister(RegistryEvent.Register<IProcedureType<?>> event) {
        IForgeRegistry<IProcedureType<?>> r = event.getRegistry();
        r.register(rsTriggerProcedure = create(RSTriggerProcedure::new, "rs_trigger", sfmIcon("textures/gui/component_icon/trigger.png")));
    }

    private static <P extends IProcedure> IProcedureType<P> create(Supplier<P> constructor, String id, ResourceLocation icon) {
        SimpleProcedureType<P> p = new SimpleProcedureType<>(constructor, icon);
        ResourceLocation rl = new ResourceLocation(StevesTasks.MODID, id);
        p.setRegistryName(rl);
        // TODO
        GUIVisibility.registerEnableState(rl, () -> true);
        return p;
    }

    private static ResourceLocation sfmIcon(String path) {
        return new ResourceLocation(StevesFactoryManagerAPI.MODID, path);
    }

    private static ResourceLocation stIcon(String path) {
        return new ResourceLocation(StevesTasks.MODID, path);
    }
}
