package me.igalaxy.spelunk.init;

import me.igalaxy.spelunk.Spelunk;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(Spelunk.MOD_ID)
@Mod.EventBusSubscriber(modid = Spelunk.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockInit {
    public static final Block copper_ore = null;

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)));
    }
}
