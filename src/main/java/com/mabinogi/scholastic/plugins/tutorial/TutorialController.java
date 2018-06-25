package com.mabinogi.scholastic.plugins.tutorial;

import com.mabinogi.lib.block.BlockAbstract;
import com.mabinogi.lib.item.ItemAbstract;
import com.mabinogi.scholastic.plugins.tutorial.block.barrel.BlockBarrel;
import com.mabinogi.scholastic.plugins.tutorial.block.basic.BlockBasic;
import com.mabinogi.scholastic.plugins.tutorial.block.blank.BlockBlank;
import com.mabinogi.scholastic.plugins.tutorial.block.crate.BlockCrate;
import com.mabinogi.scholastic.plugins.tutorial.block.facing.BlockFacing;
import com.mabinogi.scholastic.plugins.tutorial.block.gui.BlockGui;
import com.mabinogi.scholastic.plugins.tutorial.block.horizontal.BlockHorizontal;
import com.mabinogi.scholastic.plugins.tutorial.block.textured.BlockTextured;
import com.mabinogi.scholastic.plugins.tutorial.item.ItemIngot;

public class TutorialController {
	
	//items
	public static ItemAbstract itemIngot;
	
	//blocks
	public static BlockAbstract blockBasic;
	public static BlockAbstract blockTextured;
	public static BlockAbstract blockFacing;
	public static BlockAbstract blockHorizontal;
	public static BlockAbstract blockGui;
	public static BlockAbstract blockBlank;
	public static BlockAbstract blockCrate;
	public static BlockAbstract blockBarrel;
	
	public static void registerItems()
	{
		itemIngot = ItemAbstract.register(new ItemIngot());
	}
	
	public static void registerBlocks()
	{
		blockBasic = BlockAbstract.register(new BlockBasic());
		blockTextured = BlockAbstract.register(new BlockTextured());
		blockFacing = BlockAbstract.register(new BlockFacing());
		blockHorizontal = BlockAbstract.register(new BlockHorizontal());
		blockGui = BlockAbstract.register(new BlockGui());
		blockBlank = BlockAbstract.register(new BlockBlank());
		blockCrate = BlockAbstract.register(new BlockCrate());
		blockBarrel = BlockAbstract.register(new BlockBarrel());
	}

}
