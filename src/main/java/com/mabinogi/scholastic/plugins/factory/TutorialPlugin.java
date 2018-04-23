package com.mabinogi.scholastic.plugins.factory;

import static com.mabinogi.scholastic.Scholastic.LOG;

import com.mabinogi.lib.plugin.IPlugin;
import com.mabinogi.scholastic.plugins.ScholasticPlugins;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class TutorialPlugin implements IPlugin {
	
	public static boolean isRegistered = false;
	
	public static void register()
	{
		if (true)
		{
			ScholasticPlugins.instance.registerPlugin(new TutorialPlugin());
			isRegistered = true;
		}
	}

	@Override
	public void pre(FMLPreInitializationEvent event) 
	{
		LOG.info("Factory plugin pre");
		
		TutorialItems.register();
	}

	@Override
	public void init(FMLInitializationEvent event) 
	{
		LOG.info("Factory plugin init");
	}

	@Override
	public void post(FMLPostInitializationEvent event) 
	{
		LOG.info("Factory plugin post");
	}

	@Override
	public void complete(FMLLoadCompleteEvent event) 
	{
		LOG.info("Factory plugin complete");
	}

}
