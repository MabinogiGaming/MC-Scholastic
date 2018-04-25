package com.mabinogi.scholastic;

import com.mabinogi.scholastic.plugins.tutorial.TutorialController;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class Settings {
    
	public static final String MODID = "scholastic";
    public static final String NAME = "Scholastic";
    public static final String VERSION = "0.1.1";
    public static final String DEPENDENCIES = "required-after:mabinogi";
	
	public static CreativeTabs scholasticTab = new CreativeTabs("scholasticTab")
	{
		@Override
		public ItemStack getTabIconItem()
		{
			return new ItemStack(TutorialController.itemIngot);
		}
	};

}
