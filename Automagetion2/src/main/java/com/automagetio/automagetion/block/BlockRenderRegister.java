package com.automagetio.automagetion.block;

import com.automagetio.automagetion.Main;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class BlockRenderRegister 
{
	public static void registerBlockRenderer() 
	{
		
	}
	public static String modid = Main.MODID;

	public static void reg(Block block) 
	{
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
}
