package com.mabinogi.scholastic.plugins.tutorial.block.gui;

import com.mabinogi.lib.gui.container.ContainerPlayer;
import com.mabinogi.lib.tile.iface.IGuiTile;

import net.minecraft.entity.player.InventoryPlayer;

public class ContainerGui extends ContainerPlayer {

	public ContainerGui(InventoryPlayer inventory, IGuiTile tile)
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
		//no slots as not an inventory
	}

}
