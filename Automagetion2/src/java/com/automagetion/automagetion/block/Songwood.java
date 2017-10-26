package com.automagetion.automagetion.block;

import javax.swing.Icon;

import com.automagetion.automagetion.Main;
import com.automagetion.automagetion.item.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Songwood extends Block
{
	/**
	 * 
	 * Creates a songwood-based material
	 * @param addenum EX: addenum = "Planks" -> songwoodPlanks
	 */
	
	protected Songwood(String addenum) 
	{
		super(Material.wood);
		//this.setBlockName("songwood" + addenum);
		//this.setBlockTextureName(Main.MODID + ":songwood" + addenum);
        this.setCreativeTab(ModItems.tabAutomagetion);
        this.setHardness(2.0F);
        this.setResistance(6.0F);
        this.setLightLevel(1.0F);
        this.setHarvestLevel("axe", 2);
        this.setStepSound(soundTypeWood);
	}

	public Icon getIcon(int side, int meta) {
		// TODO Auto-generated method stub
		return null;
	}

}
