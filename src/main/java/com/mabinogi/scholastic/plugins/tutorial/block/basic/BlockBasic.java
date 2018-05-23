package com.mabinogi.scholastic.plugins.tutorial.block.basic;

import com.mabinogi.lib.block.BlockBase;
import com.mabinogi.scholastic.ScholasticSettings;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Example of a basic block, in this instance used similarly to metal block
 * @author Mabinogi
 */
public class BlockBasic extends BlockBase {

	public BlockBasic()
	{
		super(Material.IRON);
		
		setHardness(5.0F);
		setResistance(10.0F);
		setSoundType(SoundType.METAL);
	}

	@Override
	public String getName()
	{
		return "basic";
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
