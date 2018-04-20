package com.mabinogi.scholastic.plugins;

import com.mabinogi.lib.plugin.IPlugin;
import com.mabinogi.lib.plugin.PluginManager;

public class ScholasticPlugins extends PluginManager {
	
	public static ScholasticPlugins instance = new ScholasticPlugins();
	
	@Override
	public void registerPlugin(IPlugin plugin) 
	{
		plugins.add(plugin);
	}

}
