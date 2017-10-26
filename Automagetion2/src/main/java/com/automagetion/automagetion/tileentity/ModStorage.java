package com.automagetion.automagetion.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public abstract class ModStorage extends TileEntity implements IInventory
{
	private ItemStack[] inventory; //Items contained inside
	private String customName; //Anvil-Added name
	private String itemName; //For subtypes
	
	public ModStorage()
	{
		super();
		this.inventory = new ItemStack[this.getSizeInventory()];
	}
	
	
	@Override
	public void writeToNBT(NBTTagCompound nbt) 
	{
	    super.writeToNBT(nbt);

	    NBTTagList list = new NBTTagList();
	    for (int i = 0; i < this.getSizeInventory(); ++i) 
	    {
	        if (this.getStackInSlot(i) != null)
	        {
	            NBTTagCompound stackTag = new NBTTagCompound();
	            stackTag.setByte("Slot", (byte) i);
	            this.getStackInSlot(i).writeToNBT(stackTag);
	            list.appendTag(stackTag);
	        }
	    }
	    nbt.setTag("Items", list);

	    if (this.hasCustomInventoryName()) 
	    {
	        nbt.setString("CustomName", this.getInventoryName());
	    }
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt) 
	{
	    super.readFromNBT(nbt);

	    NBTTagList list = nbt.getTagList("Items", 10);
	    for (int i = 0; i < list.tagCount(); ++i) 
	    {
	        NBTTagCompound stackTag = list.getCompoundTagAt(i);
	        int slot = stackTag.getByte("Slot") & 255;
	        this.setInventorySlotContents(slot, ItemStack.loadItemStackFromNBT(stackTag));
	    }

	    if (nbt.hasKey("CustomName", 8)) 
	    {
	        this.setCustomName(nbt.getString("CustomName"));
	    }
	}

	private void setCustomName(String customName) 
	{
		this.customName = customName;
	}

	public void updateEntity()
	{
		//super.updateEntity();
		/*
		for (int s = 0; s <= this.getSizeInventory(); s++) //Goes through its inventory
		{
			System.out.println("Vibratorium Slot " + s + ": " + this.getStackInSlot(s));
		}
		*/
	}

	@Override
	public ItemStack getStackInSlot(int slotNum) 
	{
		if (slotNum < this.getSizeInventory() && slotNum >= 0) //Valid slot?
		{
			return inventory[slotNum]; //Return what's in the slot		
		}
		else return null;
	}

	@Override
	public ItemStack decrStackSize(int slotNum, int decrease) 
	{
		if (this.getStackInSlot(slotNum) != null) //Slot has stuff in it?
		{
			ItemStack tempStack;
			if (inventory[slotNum].stackSize < decrease)
			{
				tempStack = inventory[slotNum];
				setInventorySlotContents(slotNum, null);
				this.markDirty();
				return tempStack;
			}
			else
			{
				tempStack = this.getStackInSlot(slotNum).splitStack(decrease);
				
				//if (this.getStackInSlot(slotNum).stackSize <= 0) //Should never be met
				//{
	           //     this.setInventorySlotContents(slotNum, null);
	           // } 
				//else 
	           // {
	                //Just to show that changes happened, doesn't do anything
					this.setInventorySlotContents(slotNum, this.getStackInSlot(slotNum));
	           // }
				this.markDirty();
				return tempStack;
			}
		}
		else
		{
			return null;
		}
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int slotNum) 
	{
		ItemStack stack = this.getStackInSlot(slotNum);
	    this.setInventorySlotContents(slotNum, null);
	    return stack;
	}

	@Override
	public void setInventorySlotContents(int index, ItemStack stack) 
	{
		//stack.stackSize += 1;
		System.out.println("Vibratorium Entity Inventory Contents at " + index + " being set with " + stack.toString());
		if (index < 0 || index >= this.getSizeInventory())
	        return;

	    if (stack != null && stack.stackSize > this.getInventoryStackLimit())
	        stack.stackSize = this.getInventoryStackLimit();
	        
	    if (stack != null && stack.stackSize == 0)
	        stack = null;

	    this.inventory[index] = stack;
	    this.markDirty();
	}

	public String getInventoryName() 
	{
		return this.hasCustomInventoryName() ? this.customName : this.itemName;
	}

	public boolean hasCustomInventoryName() 
	{
		return this.customName != null && !this.customName.equals("");
	}

	@Override
	public int getInventoryStackLimit() 
	{
		return 64;
	}

	//@Override
	//public boolean isUseableByPlayer(EntityPlayer player) 
	//{
	  //  return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) == this && player.getDistanceSq(this.xCoord + 0.5, this.yCoord + 0.5, this.zCoord + 0.5) <= 64;
	    //I am uncertain as to why the above line recommends adding 0.5 to all dimensions before displacement comparison
	//}

	//public void openInventory() 
	{
		
	}

	//public void closeInventory() 
	{
		
	}

	@Override
	public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) 
	{
		return true;
	}
}
