package com.automagetion.automagetion;

import com.automagetion.automagetion.block.ModBlocks;
import com.automagetion.automagetion.crafting.BasicCrafting;
import com.automagetion.automagetion.event.BroomEventHandler;
import com.automagetion.automagetion.gui.ModGuiHandler;
import com.automagetion.automagetion.item.ModItems;
import com.automagetion.automagetion.tileentity.ModTileEntities;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxy 
{

    public void preInit(FMLPreInitializationEvent e) 
    {
    	//Register new in-game features
    	ModItems.init();
    	//ModBlocks.init();
    	//ModTileEntities.init();
    	BasicCrafting.init();
    	
    	//Gui handlers
    	//NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new ModGuiHandler());
    	
    	//Register event handlers
    	//MinecraftForge.EVENT_BUS.register(new BroomEventHandler());
    }

    public void init(FMLInitializationEvent e) 
    {

    }

    public void postInit(FMLPostInitializationEvent e) 
    {

    }
}