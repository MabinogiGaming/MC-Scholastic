package com.mabinogi.scholastic.plugins.tutorial.block.blank;

import com.mabinogi.lib.tile.TileBase;
import com.mabinogi.lib.tile.iface.IGuiTile;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class TileBlank extends TileBase implements IGuiTile {

	@Override
	public String getInventoryName()
	{
		return getBlockType().getLocalizedName();
	}

	@Override
	public Object getGui(int id, EntityPlayer player, World world, int x, int y, int z)
	{
		return new GuiBlank(player.inventory, this);
	}

	@Override
	public Object getContainer(int id, EntityPlayer player, World world, int x, int y, int z)
	{
		return new ContainerBlank(player.inventory, this);
	}

}
