package com.automagetio.automagetion.tileentity;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public abstract class ModStorageBlock extends BlockContainer
{
	protected ModStorageBlock(Material mat) 
	{
		super(mat);
	}
	
	/*public void breakBlock(World world, int x, int y, int z, Block p_149749_5_, int p_149749_6_)
	{
		//ModStorage mte = (ModStorage)world.getTileEntity(x, y, z); //Finds this block's buddy
	
		for (int s = 0; s <= mte.getSizeInventory(); s++) //Goes through its inventory
		{
			if (mte.getStackInSlot(s) != null)
			{
				world.spawnEntityInWorld(new EntityItem(world, x, y, z, mte.getStackInSlot(s))); //Spawns item stacks based on its inventory
			}
			System.out.println(mte.getStackInSlot(s));
		}
		//super.breakBlock(world, x, y, z, p_149749_5_, p_149749_6_); //Removes the tile entity, etc
	}

	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int someInt,
			float p_149727_7_, float p_149727_8_, float p_149727_9_) {
		// TODO Auto-generated method stub
		return false;
	}*/
}
