package com.mabinogi.scholastic.plugins.factory.item;

import com.mabinogi.lib.item.ItemBase;
import com.mabinogi.scholastic.Settings;

import net.minecraft.creativetab.CreativeTabs;

public class ItemIngot extends ItemBase {

	@Override
	public String getName()
	{
		return "ingot";
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

}
