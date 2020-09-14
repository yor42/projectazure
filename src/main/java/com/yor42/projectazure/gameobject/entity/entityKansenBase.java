package com.yor42.projectazure.gameobject.entity;

import com.yor42.projectazure.utils.references.attributes;
import com.yor42.projectazure.utils.references.defined;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import software.bernie.geckolib.entity.IAnimatedEntity;

//abstract class for shipgirls
public abstract class entityKansenBase extends TameableEntity implements IAnimatedEntity {

    /*
    1 = Level
    2 = Morale
     */
    protected int[] stat;

    protected entityKansenBase(EntityType<? extends TameableEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public boolean cannotDespawn() {
        return true;
    }

    @Override
    public PassiveEntity createChild(ServerWorld serverWorld, PassiveEntity passiveEntity) {
        return null;
    }

    public int getStat(byte id) {
        return stat[id];
    }

    public void setStat(byte id, int value) {
        stat[id] = value;
    }

    @Override
    public void tick() {
        super.tick();

        //make them float
        float floatWaterLevel = (float) (this.getY() + 0.25F);
        if (this.isTouchingWater() && this.getFluidHeight(FluidTags.WATER) > (double)floatWaterLevel) {
            this.kansenFloat();
        }
    }

    @Override
    public boolean canImmediatelyDespawn(double distanceSquared) {
        return false;
    }

    @Override
    protected void initGoals() {
        super.initGoals();
        this.goalSelector.add(1, new FollowOwnerGoal(this, 0.6, 2,12,false));
        this.goalSelector.add(2, new LongDoorInteractGoal(this, true));
        this.goalSelector.add(3, new AttackWithOwnerGoal(this));
        this.goalSelector.add(4, new EscapeDangerGoal(this, 0.7));
        this.goalSelector.add(5, new WanderAroundFarGoal(this, 1.0D));
        this.goalSelector.add(6, new LookAtEntityGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.add(7, new LookAroundGoal(this));
    }

    private void kansenFloat() {
        Vec3d vec3d = this.getVelocity();
        this.setVelocity(vec3d.x * 0.9900000095367432D, vec3d.y + (double)(vec3d.y < 0.05999999865889549D ? 5.0E-4F : 0.0F), vec3d.z * 0.9900000095367432D);
    }

    public enum shipClass {
        Destroyer,
        LightCruiser,
        HeavyCruiser,
        LargeCruiser,
        Battleship,
        AircraftCarrier,
        LightAircraftCarrier,
        Submarine,
        SubmarineCarrier,
        MonitorShip,
        Repair
    }
}
