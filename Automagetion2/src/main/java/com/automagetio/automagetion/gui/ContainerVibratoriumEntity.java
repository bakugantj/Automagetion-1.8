package com.automagetio.automagetion.gui;

import com.automagetio.automagetion.tileentity.VibratoriumEntity;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

public class ContainerVibratoriumEntity extends ContainerModStorage
{
	public ContainerVibratoriumEntity(IInventory playerInv, VibratoriumEntity ve)
	{
		super(playerInv, ve);
		//Storage Slots specific to this tile entity (Vibratorium entities have 3 slots)
		//These positions come from the furnace GUI

		System.out.println("Created 3 vibratorium slots");
		this.addSlotToContainer(new Slot(ve, 0, 56, 17));
		this.addSlotToContainer(new Slot(ve, 1, 56, 53));
		this.addSlotToContainer(new Slot(ve, 2, 114, 33));

		
	}
	
	
}
