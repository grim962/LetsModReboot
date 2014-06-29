package com.grim962.letsmodreboot.configuration;

import java.io.File;

import com.grim962.letsmodreboot.reference.DebugReference;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler
{
	public static void init(File configFile) {
		//Debug
		boolean configValue = false;
		
		Configuration configuration = new Configuration(configFile);
		
		try {
			//load config file
			configuration.load();
			
			//read properties from config file
			configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "An example configuration value.").getBoolean(true);
			
			
		} catch (Exception e) {	// change to appropriate exceptions as they pop up

			//Log the exception
			
		} finally {
			//save config file
			configuration.save();
		}
		
		//debug
		if(DebugReference.DEBUG_MODE) {
			System.out.println("ConfigValue value: " + configValue);
		}
	}
}
