package com.ignorantebr.customblock;

import com.ignorantebr.customblock.configuration.ConfigurationHandler;
import com.ignorantebr.customblock.proxy.IProxy;
import com.ignorantebr.customblock.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class CustomBlock {
	
	@Mod.Instance(Reference.MOD_ID)
	public static CustomBlock instance;
	
	@SidedProxy(clientSide=Reference.CLIENTSIDE_PROXY, serverSide=Reference.SERVERSIDE_PROXY)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
		
}
