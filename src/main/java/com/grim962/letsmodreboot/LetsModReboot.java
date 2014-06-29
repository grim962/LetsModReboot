package com.grim962.letsmodreboot;

import com.grim962.letsmodreboot.configuration.ConfigurationHandler;
import com.grim962.letsmodreboot.proxy.IProxy;
import com.grim962.letsmodreboot.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class LetsModReboot
{
	@Mod.Instance(Reference.MOD_ID)
	public static LetsModReboot instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler	//Pre-initialization
	public void preInit(FMLPreInitializationEvent event) {
		
		//initialize/read from configuration file
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		
		
	}

	
	@Mod.EventHandler	//Initialization
	public void init(FMLInitializationEvent event) {
		
	}

	@Mod.EventHandler	//Post-initialization
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
