package com.yor42.projectazure.registry;

import com.yor42.projectazure.utils.references.defined;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class blockRegistry {

    public static final Block BAUXITE_ORE = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(3.0F, 3.0F));

    //simplyfy all block/blockitem registry to single method
    public void processBlockRegistry(String name, Block block){
        Registry.register(Registry.BLOCK, new Identifier(defined.modid,name), block);
        Registry.register(Registry.ITEM, new Identifier(defined.modid, name), new BlockItem(BAUXITE_ORE, new Item.Settings().group(ItemGroup.MISC)));
    }

    public void registerBlock(){
        processBlockRegistry("bauxite_ore", BAUXITE_ORE);
    }
}
