package com.automagetion.automagetion.block;

import com.automagetion.automagetion.Main;
import com.automagetion.automagetion.item.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class MultitextureBlock extends Block
{
	public IIcon[] icons = new IIcon[6]; 
	
	protected MultitextureBlock(String unlocalizedName, Material material) 
    { 
        super(material);
        this.setBlockName(unlocalizedName);
        this.setBlockTextureName(Main.MODID + ":" + unlocalizedName);
        this.setCreativeTab(ModItems.tabAutomagetion);
        this.setHardness(2.0F);
        this.setResistance(6.0F);
        this.setStepSound(soundTypeWood);
    }
	
	@Override
	public void registerBlockIcons(IIconRegister reg)
	{
		this.icons[0] = reg.registerIcon(this.textureName + "_0");
		this.icons[1] = reg.registerIcon(this.textureName + "_1");
		this.icons[2] = reg.registerIcon(this.textureName + "_2");
		this.icons[3] = reg.registerIcon(this.textureName + "_3");
		this.icons[4] = reg.registerIcon(this.textureName + "_4");
		this.icons[5] = reg.registerIcon(this.textureName + "_5");
	}
	
	@Override
	public IIcon getIcon(int side, int meta)
	{
		if (side == 0)
		{
			return this.icons[side];
		}
		else if (side == 1)
		{
			if (meta == 1 || meta == 3) //If horizontally aligned
			return this.icons[6]; //Give horizontal top
			else
			return this.icons[1]; //Otherwise give normal top
		}
		else
		{
			//Ask Ben to see diagrams to explain
			int id = side;
			 
			id = (id == 3) ? 0 : id; //DO NOT CHANGE ORDER
			id = (id == 5) ? 3 : id;
			id = (id == 4) ? 1 : id;
			id = (id == 2) ? 2 : id;	
			
			id = ((id - meta + 4) % 4);
			
			id = (id == 3) ? 5 : id; //DO NOT CHANGE ORDER
			id = (id == 0) ? 3 : id;
			id = (id == 1) ? 4 : id;
			id = (id == 2) ? 2 : id;
			return this.icons[id];
		}
	}
}
