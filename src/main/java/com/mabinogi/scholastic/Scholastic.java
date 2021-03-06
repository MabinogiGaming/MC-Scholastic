package com.mabinogi.scholastic;

import com.mabinogi.lib.logging.LogHandler;
import com.mabinogi.scholastic.plugins.ScholasticPlugins;
import com.mabinogi.scholastic.plugins.tutorial.TutorialPlugin;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ScholasticSettings.MODID, name = ScholasticSettings.NAME, version = ScholasticSettings.VERSION, dependencies = ScholasticSettings.DEPENDENCIES)
public class Scholastic
{
	@Instance
    public static Scholastic instance;

    public static LogHandler LOG;
    
    public static ScholasticConfig CONFIG;
    
    public Scholastic()
	{
    	//register plugins
    	TutorialPlugin.register();
    	
    	//start plugins
    	ScholasticPlugins.instance.start();
	}

    @EventHandler
    public void pre(FMLPreInitializationEvent event)
    {
    	//initialise logging
        LOG = new LogHandler(event.getModLog(), LogHandler.LEVEL_WARN);
        
        //initialise configuration
        CONFIG = new ScholasticConfig(event.getModConfigurationDirectory());
    	
    	//pre plugins
    	ScholasticPlugins.instance.pre(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	//init network
    	ScholasticNetwork.instance.init();
    	
    	//init plugins
    	ScholasticPlugins.instance.init(event);
    }
    
    @EventHandler
    public void post(FMLPostInitializationEvent event)
    {
    	//post plugins
    	ScholasticPlugins.instance.post(event);
    	
    	//save config changes
    	CONFIG.save();
    }
    
    @EventHandler
    public void complete(FMLLoadCompleteEvent event)
    {
    	//complete plugins
    	ScholasticPlugins.instance.complete(event);
    }
}
