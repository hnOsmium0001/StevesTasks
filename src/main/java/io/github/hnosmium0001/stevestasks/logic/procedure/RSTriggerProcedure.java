package io.github.hnosmium0001.stevestasks.logic.procedure;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import io.github.hnosmium0001.stevestasks.logic.ModProcedures;
import vswe.stevesfactory.api.logic.IExecutionContext;
import vswe.stevesfactory.logic.AbstractProcedure;
import vswe.stevesfactory.ui.manager.editor.FlowComponent;

public class RSTriggerProcedure extends AbstractProcedure {

    public RSTriggerProcedure() {
        super(ModProcedures.rsTriggerProcedure);
    }

    @Override
    public void execute(IExecutionContext context) {
        pushFrame(context, 0);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public FlowComponent<RSTriggerProcedure> createFlowComponent() {
        FlowComponent<RSTriggerProcedure> f = FlowComponent.of(this);
        return f;
    }
}
