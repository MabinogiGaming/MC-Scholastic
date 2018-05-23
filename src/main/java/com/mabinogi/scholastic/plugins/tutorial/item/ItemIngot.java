package com.mabinogi.scholastic.plugins.tutorial.item;

import com.mabinogi.lib.item.ItemBase;
import com.mabinogi.scholastic.ScholasticSettings;

import net.minecraft.creativetab.CreativeTabs;

/**
 * Example of a basic item, generally used in crafting recipes
 * @author Mabinogi
 */
public class ItemIngot extends ItemBase {

	@Override
	public String getName()
	{
		return "ingot";
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
	public String getOreName()
	{
		return "ingotTutorial";
	}

}
