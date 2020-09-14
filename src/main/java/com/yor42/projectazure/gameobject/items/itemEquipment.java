package com.yor42.projectazure.gameobject.items;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

import java.util.EnumSet;
import java.util.List;

public abstract class itemEquipment extends Item {

    private final EnumSet<equipmentType> equipmentTypes = EnumSet.noneOf(equipmentType.class);
    /*
    1~8
     */
    public int equipmentTier;
    public int stat_firepower;
    public int stat_aviation;
    public int stat_torpedo;


    //1000 is fallback value
    public itemEquipment(Settings settings) {
        super(settings.maxCount(1).maxDamage(1000));
    }

    public EnumSet<equipmentType> getEquipmentType(){
     return this.equipmentTypes;
    }

    public void setEquipmentTypes(EnumSet<equipmentType> type){
        this.equipmentTypes.clear();
        this.equipmentTypes.addAll(type);
    }

    public void setEquipmentTier(int equipmentTier) {
        this.equipmentTier = equipmentTier;
    }

    public int getEquipmentTier(){
        return this.equipmentTier;
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return false;
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        tooltip.add(Text.of(new TranslatableText("equipment.durability")+": "+stack.getDamage()+"/"+stack.getMaxDamage()));
    }

    public enum equipmentType {

        //Guns
        GUN_DESTROYER,
        GUN_LIGHTCRUISER,
        GUN_HEAVYCRUISER,
        GUN_LARGECRUISER_GUN,
        GUN_BATTLESHIP_GUN,
        GUN_ANTIAIR,

        //Torpedo
        TORPEDO_SHIP,
        TORPEDO_SUBMARINE,

        //Plane
        PLANE_FIGHTER,
        PLANE_DIVEBOMBER,
        PLANE_TORPEDOBOMBER,
        PLANE_SEAPLANE,

        //Aux.
        AUXILIARY,
        ANTI_SUBMARINE,

        //Battery, Tank, Container etc for material transportation from supply line
        UTILITY
    }
}
