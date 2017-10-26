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
		reg(ModItems.animo);
		reg(ModItems.bellum);
		reg(ModItems.broom);
		reg(ModItems.caelum);
		reg(ModItems.calor);
		reg(ModItems.cantio);
		reg(ModItems.creo);
		reg(ModItems.evorsio);
		reg(ModItems.funus);
		reg(ModItems.imperium);
		reg(ModItems.inanis);
		reg(ModItems.infernum);
		reg(ModItems.irrigus);
		reg(ModItems.mundus);
		reg(ModItems.natura);
		reg(ModItems.pax);
		reg(ModItems.sopio);
		reg(ModItems.chantRoot);
		reg(ModItems.chantRootFibers);
		reg(ModItems.reedAssembly);
		reg(ModItems.songPaper);
		reg(ModItems.songwoodSapling);
		reg(ModItems.whistlingReed);
		
    }
	static void reg(Item item) 
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}