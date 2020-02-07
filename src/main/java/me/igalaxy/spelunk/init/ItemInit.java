package me.igalaxy.spelunk.init;

import me.igalaxy.spelunk.Spelunk;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = Spelunk.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(Spelunk.MOD_ID)
public class ItemInit {

    public static final Item copper_ingot = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event){
        event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("copper_ingot"));
    }
}
