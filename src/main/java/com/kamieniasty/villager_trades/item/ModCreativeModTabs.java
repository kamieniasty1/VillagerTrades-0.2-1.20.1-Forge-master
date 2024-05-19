package com.kamieniasty.villager_trades.item;

import com.kamieniasty.villager_trades.VillagerTrades;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VillagerTrades.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CREATIVE_TAB = CREATIVE_MODE_TABS.register("creative_tab", //Name of the creative tab
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PHOENIX_FEATHER.get())) //Icon of the tab - seen in the creative mode inventory
                    .title(Component.translatable("creativetab.creative_tab")) //The key for setting the name displayed in the game
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.PHOENIX_FEATHER.get()); //Here you can add items to that tab
                        //pOutput.accept(ModItems.PHOENIX_FEATHER.get()); 1 line for each item/block etc.

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
