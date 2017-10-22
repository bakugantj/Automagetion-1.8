package com.automagetion.automagetion;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;



@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main
{
	@SidedProxy(clientSide="com.automagetion.automagetion.ClientProxy", serverSide="com.automagetion.automagetion.ServerProxy")
	public static CommonProxy proxy;

    public static final String MODID = "automagetion";
    public static final String MODNAME = "Automagetion";
    public static final String VERSION = "1.0.0";
        
    @Instance
    public static Main instance = new Main();
        

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) 
    {
    	System.out.println("Hello World!");
    	Main.proxy.preInit(e);
    }
        
    @EventHandler
    public void init(FMLInitializationEvent e) 
    {
    	Main.proxy.init(e);
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) 
    {
    	Main.proxy.postInit(e);
    }
}
