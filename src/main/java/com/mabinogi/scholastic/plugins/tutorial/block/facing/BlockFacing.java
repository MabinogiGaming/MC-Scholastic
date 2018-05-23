package com.mabinogi.scholastic.plugins.tutorial.block.facing;

import com.mabinogi.lib.block.BlockBase;
import com.mabinogi.lib.block.iface.IFacing;
import com.mabinogi.scholastic.ScholasticSettings;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Example of a facing block, with a single side colored to denote its facing direction
 * @author Mabinogi
 */
public class BlockFacing extends BlockBase implements IFacing {

	public BlockFacing()
	{
		super(Material.IRON);
		
		setHardness(5.0F);
		setResistance(10.0F);
		setSoundType(SoundType.METAL);
	}

	@Override
	public String getName()
	{
		return "facing";
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
