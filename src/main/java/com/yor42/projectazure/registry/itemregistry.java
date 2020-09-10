package com.yor42.projectazure.registry;

import com.yor42.projectazure.gameobject.items.itemtooltips;
import com.yor42.projectazure.utils.defined;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class itemregistry {

    public static final Item PA_ITEMS = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item PA_ITEMS_TOOLTIP = new itemtooltips(new Item.Settings().group(ItemGroup.MISC));

    public static void registeritems(){
        Registry.register(Registry.ITEM, new Identifier(defined.modid, "wisdomcube"), PA_ITEMS_TOOLTIP);
    }



}
