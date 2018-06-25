package com.mabinogi.scholastic.plugins.tutorial.block.barrel;

import com.mabinogi.lib.network.NetworkHandler;
import com.mabinogi.lib.tile.TileInventory;
import com.mabinogi.lib.tile.iface.IGuiTile;
import com.mabinogi.scholastic.ScholasticNetwork;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidTank;

public class TileBarrel extends TileInventory implements IGuiTile {
	
	public static final int SLOT_TANK_STORAGE = 0;

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
		return new GuiBarrel(player.inventory, this);
	}

	@Override
	public Object getContainer(int id, EntityPlayer player, World world, int x, int y, int z)
	{
		return new ContainerBarrel(player.inventory, this);
	}
	
	@Override
	public NonNullList<FluidTank> createFluidInventory()
	{
		NonNullList<FluidTank> tanks = NonNullList.create();
		tanks.add(new FluidTank(8000));
		return tanks;
	}

}
