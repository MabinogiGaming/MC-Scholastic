package com.mabinogi.scholastic;

import com.mabinogi.lib.logging.LogHandler;
import com.mabinogi.scholastic.plugins.ScholasticPlugins;
import com.mabinogi.scholastic.plugins.factory.PluginFactory;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Scholastic.MODID, name = Scholastic.NAME, version = Scholastic.VERSION)
public class Scholastic
{
    public static final String MODID = "scholastic";
    public static final String NAME = "Scholastic";
    public static final String VERSION = "0.0.2";

    public static LogHandler LOG;
    
    public Scholastic()
	{
    	//register plugins
    	PluginFactory.register();
    	
    	//start plugins
    	ScholasticPlugins.instance.start();
	}

    @EventHandler
    public void pre(FMLPreInitializationEvent event)
    {
    	//initialise logging
        LOG = new LogHandler(event.getModLog(), LogHandler.LEVEL_WARN);
    	
    	//pre plugins
    	ScholasticPlugins.instance.pre(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	//init plugins
    	ScholasticPlugins.instance.init(event);
    }
    
    @EventHandler
    public void post(FMLPostInitializationEvent event)
    {
    	//post plugins
    	ScholasticPlugins.instance.post(event);
    }
    
    @EventHandler
    public void complete(FMLLoadCompleteEvent event)
    {
    	//complete plugins
    	ScholasticPlugins.instance.complete(event);
    }
}
