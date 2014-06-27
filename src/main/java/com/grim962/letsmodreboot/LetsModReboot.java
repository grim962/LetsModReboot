package com.grim962.letsmodreboot;

import com.grim962.letsmodreboot.proxy.IProxy;
import com.grim962.letsmodreboot.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class LetsModReboot {
	
	//to refer to instance of mod
	@Mod.Instance(Reference.MOD_ID)
	public static LetsModReboot instance;
	
	//Client/server proxy
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	//Pre-initialization
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}

	//Initialization
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}

	//Post-initialization
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
