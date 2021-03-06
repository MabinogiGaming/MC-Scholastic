package com.mabinogi.scholastic.plugins.tutorial.block.gui;

import com.mabinogi.lib.network.NetworkHandler;
import com.mabinogi.lib.tile.TileBase;
import com.mabinogi.lib.tile.iface.IGuiTile;
import com.mabinogi.scholastic.ScholasticNetwork;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class TileGui extends TileBase implements IGuiTile {

	@Override
	public String getInventoryName()
	{
		return getBlockType().getLocalizedName();
	}

	@Override
	public NetworkHandler getNetworkHandler()
	{
		return ScholasticNetwork.instance;
	}

	@Override
	public Object getGui(int id, EntityPlayer player, World world, int x, int y, int z)
	{
		return new GuiGui(player.inventory, this);
	}

	@Override
	public Object getContainer(int id, EntityPlayer player, World world, int x, int y, int z)
	{
		return new ContainerGui(player.inventory, this);
	}

}
