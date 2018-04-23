package com.mabinogi.scholastic.plugins.factory;

import com.mabinogi.lib.item.ItemBase;
import com.mabinogi.scholastic.plugins.factory.item.ItemIngot;

public class TutorialItems {
	
	public static ItemBase itemIngot;
	
	public static void register()
	{
		itemIngot = ItemBase.register(new ItemIngot());
	}

}
