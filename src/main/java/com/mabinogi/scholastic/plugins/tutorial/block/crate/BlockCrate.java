package com.mabinogi.scholastic.plugins.tutorial.block.crate;

import com.mabinogi.lib.block.BlockInventory;
import com.mabinogi.scholastic.ScholasticSettings;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;

public class BlockCrate extends BlockInventory {

	public BlockCrate()
	{
		super(Material.IRON);
		
		setHardness(5.0F);
		setResistance(10.0F);
		setSoundType(SoundType.METAL);
	}

	@Override
	public String getName()
	{
		return "crate";
	}

	@Override
	public String getModId()
	{
		return ScholasticSettings.MODID;
	}

	@Override
	public CreativeTabs getTab()
	{
		return ScholasticSettings.scholasticTab;
	}

	@Override
	public Class<? extends TileEntity> getTileEntityClass()
	{
		return TileCrate.class;
	}

}
