package org.bukkit.craftbukkit.entity;

import net.minecraft.server.EntityMinecartHopper;

import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.inventory.CraftInventory;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.minecart.HopperMinecart;
import org.bukkit.inventory.Inventory;

import com.destroystokyo.paper.lootable.CraftLootableEntityInventory;

final class CraftMinecartHopper extends CraftMinecart implements HopperMinecart, CraftLootableEntityInventory { // Paper
    private final CraftInventory inventory;

    CraftMinecartHopper(CraftServer server, EntityMinecartHopper entity) {
        super(server, entity);
        inventory = new CraftInventory(entity);
    }

    @Override
    public String toString() {
        return "CraftMinecartHopper{" + "inventory=" + inventory + '}';
    }

    public EntityType getType() {
        return EntityType.MINECART_HOPPER;
    }

    public Inventory getInventory() {
        return inventory;
    }

    @Override
    public boolean isEnabled() {
        return ((EntityMinecartHopper) getHandle()).isEnabled();
    }

    @Override
    public void setEnabled(boolean enabled) {
        ((EntityMinecartHopper) getHandle()).setEnabled(enabled);
    }
}
