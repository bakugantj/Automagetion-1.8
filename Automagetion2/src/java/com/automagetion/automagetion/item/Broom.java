package com.automagetion.automagetion.item;

import java.util.List;

import javax.swing.Icon;

import com.automagetion.automagetion.Main;

import com.automagetion.automagetion.item.ItemRenderRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Broom extends Item
{
	@SideOnly(Side.CLIENT)
	private Icon[] iconArray; //Used to store the two different animation textures
	private int animIndex; //Used to create animation
	private final int sweepTime = 3; //Duration of sweep out
	private Icon itemIcon;
	
	Broom()
	{
		super();
		this.setUnlocalizedName("broom").setCreativeTab(ModItems.tabAutomagetion).setMaxStackSize(1);
	}
    
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player)
	{		
		animIndex = sweepTime;
		//Creating AABB AOE in front of player - The box is the player's enlarged and shifted forwards
		AxisAlignedBB aoe;
		//Determine the exact aoe shape based on angle
		int rotat = Math.round((player.rotationYawHead/45)) % 8; //"Rotat Number" divides rotation into 8 zones
		rotat = rotat < 0 ? 8 + rotat : rotat;
		//System.out.println("Rotational Integer: " + rotat);
		
		double xmin, xmax, ymin, ymax, zmin, zmax; //Used to bound AOE
		double vx = 0, vy = 0, vz = 0; //Used to set sweep speed of targets. vy is always zero.
		
		final double aoeS = 1; //Determines sweep "radius"
		final double velocityModifier = 0.4; //Determines how fast/far items sweep (since time-based limits)
		
		ymin = player.posY - 1;
		ymax = player.posY + 2;
		//Create proper AABB shape using rotat number
		switch (rotat)
		{
			case 0: 
				xmin = player.posX - 1 * aoeS;
				xmax = player.posX + 1 * aoeS;
				zmin = player.posZ;
				zmax = player.posZ + 2 * aoeS;
				
				vx = 0 * velocityModifier;
				vz = 1 * velocityModifier;
				break;
			case 1:
				xmin = player.posX - 2 * aoeS;
				xmax = player.posX;
				zmin = player.posZ;
				zmax = player.posZ + 2 * aoeS;
				
				vx = -0.7 * velocityModifier;
				vz = 0.7 * velocityModifier;
				break;
			case 2:
				xmin = player.posX - 2 * aoeS;
				xmax = player.posX;
				zmin = player.posZ - 1 * aoeS;
				zmax = player.posZ + 1 * aoeS;
				
				vx = -1 * velocityModifier;
				vz = 0 * velocityModifier;
				break;
			case 3:
				xmin = player.posX - 2 * aoeS;
				xmax = player.posX;
				zmin = player.posZ - 2 * aoeS;
				zmax = player.posZ;
				
				vx = -0.7 * velocityModifier;
				vz = -0.7 * velocityModifier;
				break;
			case 4:
				xmin = player.posX - 1 * aoeS;
				xmax = player.posX + 1 * aoeS;
				zmin = player.posZ - 2 * aoeS;
				zmax = player.posZ;
				
				vx = 0 * velocityModifier;
				vz = -1 * velocityModifier;
				break;
			case 5:
				xmin = player.posX;
				xmax = player.posX + 2 * aoeS;
				zmin = player.posZ - 2 * aoeS;
				zmax = player.posZ;
				
				vx = 0.7 * velocityModifier;
				vz = -0.7 * velocityModifier;
				break;
			case 6:
				xmin = player.posX;
				xmax = player.posX + 2 * aoeS;
				zmin = player.posZ - 1 * aoeS;
				zmax = player.posZ + 1 * aoeS;
				
				vx = 1 * velocityModifier;
				vz = 0 * velocityModifier;
				break;
			case 7:
				xmin = player.posX;
				xmax = player.posX + 2 * aoeS;
				zmin = player.posZ;
				zmax = player.posZ + 2 * aoeS;
				
				vx = 0.7 * velocityModifier;
				vz = 0.7 * velocityModifier;
				break;
			default:
				xmin = player.posX;
				xmax = player.posX;
				zmin = player.posZ;
				zmax = player.posZ;
				
				vx = 0 * velocityModifier;
				vz = 0 * velocityModifier;
				System.out.println("Rotat Error: Non-Integer Rotat input");
		}
		
		
		aoe = AxisAlignedBB.getBoundingBox(xmin, ymin, zmin, xmax, ymax, zmax); //Hey, that's the aoe of the sweep!	
	
		//Detect item entities withing that aoe	
		List entitiesWithinAABB = world.getEntitiesWithinAABB(EntityItem.class, aoe);
		List<EntityItem> aoeEntities = entitiesWithinAABB; //Filtered to only items
		
		//Apply a velocity to each of those items for a short duration
		//System.out.println(aoeEntities);
		//System.out.println("vx: " + vx + " vy: " + vy + " vz: " + vz);
		for (EntityItem i : aoeEntities)
		{
			i.addVelocity(vx, vy, vz);
		}
		//Keep broom in its slot
		return item;
	}
			
}
