package com.mabinogi.scholastic.plugins.tutorial.block.horizontal;

import java.util.List;

import com.mabinogi.lib.block.BlockBase;
import com.mabinogi.lib.block.iface.IFacing;
import com.mabinogi.scholastic.ScholasticSettings;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumFacing;

/**
 * Example of a facing block, similar to BlockFacing except the up/down directions are disabled
 * @author Mabinogi
 */
public class BlockHorizontal extends BlockBase implements IFacing {

	public BlockHorizontal()
	{
		super(Material.IRON);
		
		setHardness(5.0F);
		setResistance(10.0F);
		setSoundType(SoundType.METAL);
	}

	@Override
	public String getName()
	{
		return "horizontal";
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
	public List<EnumFacing> getValidFacings()
	{
		return IFacing.FACING_HORIZONTAL;
	}

}
