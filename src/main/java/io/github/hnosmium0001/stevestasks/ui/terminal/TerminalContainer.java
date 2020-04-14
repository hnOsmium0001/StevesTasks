package io.github.hnosmium0001.stevestasks.ui.terminal;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;

import javax.annotation.Nullable;

public class TerminalContainer extends Container {
    protected TerminalContainer(@Nullable ContainerType<?> type, int id) {
        super(type, id);
    }

    @Override
    public boolean canInteractWith(PlayerEntity player) {
        return true;
    }
}
