package com.automagetion.automagetion.block;

import com.automagetion.automagetion.client.render.items.*;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class SongwoodLog extends Songwood
{
	private IIcon[] icons = new IIcon[3];
	
	protected SongwoodLog() 
	{
		super("Log");	
	}
	
	@Override
	public void registerBlockIcons(IIconRegister reg)
	{
		this.icons[0] = reg.registerIcon(this.textureName + "_top");
		this.icons[1] = reg.registerIcon(this.textureName + "_side");
		this.icons[2] = reg.registerIcon(this.textureName + "_side2");
	}
	
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase player, ItemStack stack) 
	{
		//Vertical Orientation
		int vRotat = Math.round(((player.rotationPitch)/90)); //"Rotat Number" divides rotation into 4 zones
		vRotat += 1;
		System.out.println("Log placed with vRotat number " + vRotat);
		
		//Horizontal Orientation
		int rotat = Math.round(((player.rotationYawHead - 180)/90)) % 4; //"Rotat Number" divides rotation into 4 zones
		rotat = rotat < 0 ? 4 + rotat : rotat;
		
		//vRotat 0 -> Vertically up
		//vRotat 1 -> Horizontal
		//vRotat 2 -> Vertically down
		
		int meta = 15;
		if (vRotat == 1) //If placed horizontally, hori rotat takes precedent
		{
			meta = rotat;
		}
		else 
		{
			meta = (vRotat == 0) ? 5 : meta; //Ask Ben for diagrams
			meta = (vRotat == 2) ? 4 : meta;
		}
		meta += 1; //0 cannot be used for metadata
		System.out.println("meta for log is " + meta);
		world.setBlockMetadataWithNotify(x, y, z, meta, 2);
	}
	
	@Override
	public IIcon getIcon(int side, int meta)
	{
		meta -= 1;
		int id = 0; //Texture number
		int bSide = 15; //Translated side. Filler number initialization
		if (meta == 4 || meta == 5) //If the block was placed up-down
		{
			if (side == 0 || side == 1) //If you want the top or bottom
			{
				id = 0; //Its rings
			}
			else
			{
				id = 1; //Otherwise its vertical bark
			}
		}
		else
		{
			bSide = (side == 3) ? 0 : bSide;
			bSide = (side == 5) ? 3 : bSide;
			bSide = (side == 4) ? 1 : bSide;
			bSide = (side == 2) ? 2 : bSide;	
			
			bSide = ((bSide - meta + 4) % 4); //Conversion to understandable relations
			
			if (bSide == 0 || bSide == 2) //Sides facing you and away from you are rings
			{
				id = 0;
			}
			if (bSide == 1 || bSide == 3) //Sides perpendicular to you are bark
			{
				id = 2;
			}
			if (side == 0 || side == 1) //If you want tops
			{
				if (meta == 1 || meta == 3) //Tops this way need rotated bark tops
				{
					id = 2;
				}
				if (meta == 0 || meta == 2) //Tops this way need non-rotated bark tops
				{
					id = 1;
				}
			}
			//All non-end sides are rotated
			//1 and 3 meta tops are rotated
		}
		return this.icons[id];
	}
}
