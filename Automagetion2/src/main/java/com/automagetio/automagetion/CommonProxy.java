package com.automagetio.automagetion;

import com.automagetio.automagetion.block.ModBlocks;
import com.automagetio.automagetion.crafting.BasicCrafting;
import com.automagetio.automagetion.event.BroomEventHandler;
import com.automagetio.automagetion.gui.ModGuiHandler;
import com.automagetio.automagetion.item.ModItems;
import com.automagetio.automagetion.tileentity.ModTileEntities;

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