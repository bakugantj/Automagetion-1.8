package com.automagetion.automagetion.gui;

import com.automagetion.automagetion.tileentity.VibratoriumEntity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class ModGuiHandler implements IGuiHandler
{
	public static final int VIBRATORIUM_GUI = 0;

	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		switch (ID)
		{
			case VIBRATORIUM_GUI:
				//return new ContainerVibratoriumEntity(player.inventory, (VibratoriumEntity)world);

			
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		switch(ID)
		{
			case VIBRATORIUM_GUI:
				//return new GuiVibratoriumEntity(player.inventory, (VibratoriumEntity)world);
			
		}
		return null;
	}
	
}
