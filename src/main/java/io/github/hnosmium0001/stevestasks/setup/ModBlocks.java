package io.github.hnosmium0001.stevestasks.setup;

import io.github.hnosmium0001.stevestasks.StevesTasks;
import io.github.hnosmium0001.stevestasks.block.TerminalBlock;
import io.github.hnosmium0001.stevestasks.block.TerminalTileEntity;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("ConstantConditions")
public final class ModBlocks {

    private ModBlocks() {
    }

    public static DeferredRegister<Block> blocks = new DeferredRegister<>(ForgeRegistries.BLOCKS, StevesTasks.MODID);

    public static RegistryObject<TerminalBlock> terminalBlock = blocks.register(
            "terminal",
            () -> new TerminalBlock(Block.Properties
                    .create(Material.IRON)
                    .hardnessAndResistance(2.0F, 10.0F)));

    public static DeferredRegister<TileEntityType<?>> tiles = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, StevesTasks.MODID);

    public static RegistryObject<TileEntityType<TerminalTileEntity>> terminalTileEntity = tiles.register(
            "terminal",
            () -> TileEntityType.Builder
                    .create(TerminalTileEntity::new, terminalBlock.get())
                    .build(null));
}
