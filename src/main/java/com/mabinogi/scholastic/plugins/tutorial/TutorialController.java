package com.mabinogi.scholastic.plugins.tutorial;

import com.mabinogi.lib.block.BlockAbstract;
import com.mabinogi.lib.item.ItemAbstract;
import com.mabinogi.scholastic.plugins.tutorial.block.basic.BlockBasic;
import com.mabinogi.scholastic.plugins.tutorial.block.facing.BlockFacing;
import com.mabinogi.scholastic.plugins.tutorial.block.horizontal.BlockHorizontal;
import com.mabinogi.scholastic.plugins.tutorial.item.ItemIngot;

public class TutorialController {
	
	//items
	public static ItemAbstract itemIngot;
	
	//blocks
	public static BlockAbstract blockBasic;
	public static BlockAbstract blockFacing;
	public static BlockAbstract blockHorizontal;
	
	public static void registerItems()
	{
		itemIngot = ItemAbstract.register(new ItemIngot());
	}
	
	public static void registerBlocks()
	{
		blockBasic = BlockAbstract.register(new BlockBasic());
		blockFacing = BlockAbstract.register(new BlockFacing());
		blockHorizontal = BlockAbstract.register(new BlockHorizontal());
	}

}
