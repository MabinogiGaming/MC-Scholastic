package com.mabinogi.scholastic.plugins.tutorial;

import static com.mabinogi.scholastic.Scholastic.LOG;

import com.mabinogi.lib.plugin.IPlugin;
import com.mabinogi.scholastic.plugins.ScholasticPlugins;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class TutorialPlugin implements IPlugin {
	
	public static void register()
	{
		ScholasticPlugins.instance.registerPlugin(new TutorialPlugin());
	}

	@Override
	public void configPlugin(Configuration cfg)
	{
		TutorialConfig.config(cfg);
	}

	@Override
	public void pre(FMLPreInitializationEvent event) 
	{
		if (TutorialConfig.moduleTutorial)
		{
			LOG.info("Tutorial plugin pre");
	
			//register items
			TutorialController.registerItems();
			
			//register blocks
			TutorialController.registerBlocks();
		}
	}

	@Override
	public void init(FMLInitializationEvent event) 
	{
		if (TutorialConfig.moduleTutorial)
		{
			LOG.info("Tutorial plugin init");
		}
	}

	@Override
	public void post(FMLPostInitializationEvent event) 
	{
		if (TutorialConfig.moduleTutorial)
		{
			LOG.info("Tutorial plugin post");
		}
	}

	@Override
	public void complete(FMLLoadCompleteEvent event) 
	{
		if (TutorialConfig.moduleTutorial)
		{
			LOG.info("Tutorial plugin complete");
		}
	}

}
