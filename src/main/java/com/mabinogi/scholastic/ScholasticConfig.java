package com.mabinogi.scholastic;

import java.io.File;

import com.mabinogi.lib.config.ConfigManager;
import com.mabinogi.scholastic.plugins.ScholasticPlugins;

public class ScholasticConfig extends ConfigManager {

	public ScholasticConfig(File directory)
	{
		super(directory);
	}

	@Override
	public void init()
	{
		//allow plugins to handle configurations
		initPlugins(ScholasticPlugins.instance);
	}

}
