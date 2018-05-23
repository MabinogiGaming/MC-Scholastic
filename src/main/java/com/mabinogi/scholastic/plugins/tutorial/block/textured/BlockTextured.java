package com.mabinogi.scholastic.plugins.tutorial.block.textured;

import com.mabinogi.lib.block.BlockBase;
import com.mabinogi.scholastic.ScholasticSettings;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTextured extends BlockBase {

	public BlockTextured()
	{
		super(Material.IRON);
		
		setHardness(5.0F);
		setResistance(10.0F);
		setSoundType(SoundType.METAL);
	}

	@Override
	public String getName()
	{
		return "textured";
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

}
