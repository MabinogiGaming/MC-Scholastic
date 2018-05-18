package com.mabinogi.scholastic.plugins.tutorial.block.blank;

import com.mabinogi.lib.block.BlockTile;
import com.mabinogi.scholastic.Settings;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;

public class BlockBlank extends BlockTile {

	public BlockBlank()
	{
		super(Material.IRON);
		
		setHardness(5.0F);
		setResistance(10.0F);
		setSoundType(SoundType.METAL);
	}

	@Override
	public String getName()
	{
		return "blank";
	}

	@Override
	public String getModId()
	{
		return Settings.MODID;
	}

	@Override
	public CreativeTabs getTab()
	{
		return Settings.scholasticTab;
	}

	@Override
	public Class<? extends TileEntity> getTileEntityClass()
	{
		return TileBlank.class;
	}

}
