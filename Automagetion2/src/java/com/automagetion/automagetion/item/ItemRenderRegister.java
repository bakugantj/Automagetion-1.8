package com.automagetion.automagetion.item;

import com.automagetion.automagetion.Main;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class ItemRenderRegister
{
	public static String modid = Main.MODID;
	public static void registerItemRenderer() 
    {

    }
	void reg(Item item) 
	{
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	.register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}