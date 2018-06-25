package com.mabinogi.scholastic.plugins.tutorial.block.barrel;

import com.mabinogi.lib.gui.container.ContainerPlayer;
import com.mabinogi.lib.tile.iface.IGuiTile;

import net.minecraft.entity.player.InventoryPlayer;

public class ContainerBarrel extends ContainerPlayer {

	public ContainerBarrel(InventoryPlayer inventory, IGuiTile tile)
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
		return 176;
	}

	@Override
	public void addSlots(InventoryPlayer inventory)
	{
		//no item slots, fluid only
	}

}
