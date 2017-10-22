package com.automagetion.automagetion.event;

import com.automagetion.automagetion.item.ModItems;

import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BroomEventHandler 
{
	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public void preventItemPickup(EntityItemPickupEvent e)
	{
		try
		{
			if (ModItems.broom.getUnlocalizedName().equals(e.entityPlayer.getCurrentEquippedItem().getItem().getUnlocalizedName()))
			{
				//System.out.println("Cannot pick up item due to broom.");
				e.setCanceled(true);
			}
		}
		catch(NullPointerException n)
		{
			
		}
	}
}
