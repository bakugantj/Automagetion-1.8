package com.automagetio.automagetion.gui;

import com.automagetio.automagetion.tileentity.ModStorage;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerModStorage extends Container
{
	private ModStorage te;
	
	public ContainerModStorage(IInventory playerInv, ModStorage te)
	{
		this.te = te;
		
		// Player Inventory, Slot 0-8, Slot IDs 0-8 *HOTBAR!*
	    for (int x = 0; x < 9; ++x) 
	    {
	    	System.out.println("Creating a hotbar slot at player index: " + (x));
	        this.addSlotToContainer(new Slot(playerInv, x, 8 + x * 18, 142));
	    }
	    
	    // Player Inventory, Slot 9-35, Slot IDs 9-35
	    
	    for (int y = 0; y < 3; ++y) 
	    {
	        for (int x = 0; x < 9; ++x) 
	        {
	        	System.out.println("Creating a slot at player index: " + (x + (y * 9) + 9));
	            this.addSlotToContainer(new Slot(playerInv, x + (y * 9) + 9, 8 + x * 18, 84 + y * 18)); //y * 9
	        }
	    }
	    System.out.println("Vibratorium Inventory Size: " + this.inventorySlots.size());
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer playerIn, int fromSlot) 
	{
	    ItemStack previous = null;
	    Slot slot = (Slot) this.inventorySlots.get(fromSlot);

	    if (slot != null && slot.getHasStack()) 
	    {
	        ItemStack current = slot.getStack();
	        previous = current.copy();

	        if (fromSlot < te.getSizeInventory()) 
	        {
	            // From TE Inventory to Player Inventory
	            if (!this.mergeItemStack(current, te.getSizeInventory(), 45, true)) ///TEMP TEST
	                return null;
	        } 
	        else 
	        {
	            // From Player Inventory to TE Inventory
	            if (!this.mergeItemStack(current, 0, te.getSizeInventory(), false)) //TEMP TEST
	                return null;
	        }

	        if (current.stackSize == 0)
	            slot.putStack((ItemStack) null);
	        else
	            slot.onSlotChanged();

	        if (current.stackSize == previous.stackSize)
	            return null;
	        slot.onPickupFromSlot(playerIn, current);
	    }
	    return previous;
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer player) 
	{
		return this.te.isUseableByPlayer(player);
	}

}
