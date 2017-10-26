package com.automagetion.automagetion;

import com.automagetion.automagetion.block.BlockRenderRegister;
import com.automagetion.automagetion.item.ItemRenderRegister;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
	@Override
	public void preInit(FMLPreInitializationEvent e) 
    {
		super.preInit(e);
    }

	@Override
    public void init(FMLInitializationEvent e) 
    {
    	super.init(e);
    	ItemRenderRegister.registerItemRenderer();
    	//BlockRenderRegister.registerBlockRenderer();
    }

	@Override
    public void postInit(FMLPostInitializationEvent e) 
    {
    	super.postInit(e);
    }
}