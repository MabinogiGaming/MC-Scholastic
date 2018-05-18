package com.mabinogi.scholastic.plugins.tutorial.block.blank;

import com.mabinogi.lib.gui.container.ContainerBase;
import com.mabinogi.lib.tile.iface.IGuiTile;

import net.minecraft.entity.player.InventoryPlayer;

public class ContainerBlank extends ContainerBase {

	public ContainerBlank(InventoryPlayer inventory, IGuiTile tile)
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
