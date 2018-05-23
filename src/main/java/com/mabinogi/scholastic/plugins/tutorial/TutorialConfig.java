package com.mabinogi.scholastic.plugins.tutorial;

import com.mabinogi.scholastic.ScholasticConfig;

import net.minecraftforge.common.config.Configuration;

public class TutorialConfig {
	
	//whether this module is enabled
	public static boolean moduleTutorial = true;
	
	public static void config(Configuration cfg)
	{
		moduleTutorial = cfg.getBoolean("tutorial", ScholasticConfig.CATEGORY_MODULES, moduleTutorial, "Enable the tutorial module");
	}

}
