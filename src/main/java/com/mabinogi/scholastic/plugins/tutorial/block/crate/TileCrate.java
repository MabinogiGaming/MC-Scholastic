package com.mabinogi.scholastic.plugins.tutorial.block.crate;

import com.mabinogi.lib.network.NetworkHandler;
import com.mabinogi.lib.tile.TileInventory;
import com.mabinogi.lib.tile.iface.IGuiTile;
import com.mabinogi.scholastic.ScholasticNetwork;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;

public class TileCrate extends TileInventory implements IGuiTile {

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
		return new GuiCrate(player.inventory, this);
	}

	@Override
	public Object getContainer(int id, EntityPlayer player, World world, int x, int y, int z)
	{
		return new ContainerCrate(player.inventory, this);
	}

	@Override
	public NonNullList<ItemStack> createItemInventory()
	{
		return NonNullList.<ItemStack>withSize(27, ItemStack.EMPTY);
	}

}
