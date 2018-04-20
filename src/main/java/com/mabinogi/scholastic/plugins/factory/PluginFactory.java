package com.mabinogi.scholastic.plugins.factory;

import com.mabinogi.lib.plugin.IPlugin;
import com.mabinogi.scholastic.plugins.ScholasticPlugins;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class PluginFactory implements IPlugin {
	
	public static boolean isRegistered = false;
	
	public static void register()
	{
		if (true)
		{
			ScholasticPlugins.instance.registerPlugin(new PluginFactory());
			isRegistered = true;
		}
	}

	@Override
	public int getPriority() 
	{
		return 0;
	}

	@Override
	public void start()
	{
		
	}

	@Override
	public void pre(FMLPreInitializationEvent event) 
	{
		
	}

	@Override
	public void init(FMLInitializationEvent event) 
	{
		
	}

	@Override
	public void post(FMLPostInitializationEvent event) 
	{
		
	}

	@Override
	public void complete(FMLLoadCompleteEvent event) 
	{
		
	}

}
