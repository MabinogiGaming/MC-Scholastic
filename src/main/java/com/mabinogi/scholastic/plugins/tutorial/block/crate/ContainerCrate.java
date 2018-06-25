package com.mabinogi.scholastic.plugins.tutorial.block.crate;

import com.mabinogi.lib.gui.container.ContainerPlayer;
import com.mabinogi.lib.tile.iface.IGuiTile;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

public class ContainerCrate extends ContainerPlayer {

	public ContainerCrate(InventoryPlayer inventory, IGuiTile tile)
	{
		super(inventory, tile);
	}

	@Override
	public int getGuiWidth()
	{
		return 176;
	}

	@Override
	public int getGuiHeight()
	{
		return 168;
	}

	@Override
	public void addSlots(InventoryPlayer inventory)
	{
		int numRows = 3;
		for (int x = 0; x < numRows; ++x)
        {
            for (int y = 0; y < 9; ++y)
            {
                this.addSlotToContainer(new Slot((IInventory) tile, y + x * 9, 8 + y * 18, 18 + x * 18));
            }
        }
	}

}
