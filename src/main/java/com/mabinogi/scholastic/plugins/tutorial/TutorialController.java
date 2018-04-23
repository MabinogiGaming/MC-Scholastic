package com.mabinogi.scholastic.plugins.tutorial;

import com.mabinogi.lib.block.BlockBase;
import com.mabinogi.lib.item.ItemBase;
import com.mabinogi.scholastic.plugins.tutorial.block.BlockBasic;
import com.mabinogi.scholastic.plugins.tutorial.item.ItemIngot;

public class TutorialController {
	
	//items
	public static ItemBase itemIngot;
	
	//blocks
	public static BlockBase blockBasic;
	
	public static void registerItems()
	{
		itemIngot = ItemBase.register(new ItemIngot());
	}
	
	public static void registerBlocks()
	{
		blockBasic = BlockBase.register(new BlockBasic());
	}

}
