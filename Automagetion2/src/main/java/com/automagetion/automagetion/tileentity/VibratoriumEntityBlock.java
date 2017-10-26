package com.automagetion.automagetion.tileentity;

import javax.swing.Icon;

import com.automagetion.automagetion.Main;
import com.automagetion.automagetion.block.BlockRenderRegister;
import com.automagetion.automagetion.gui.ModGuiHandler;
import com.automagetion.automagetion.item.ModItems;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public abstract class VibratoriumEntityBlock extends ModStorageBlock
{
	public Icon[] icons = new Icon[7];
	private String textureName = "Vibratorium";
	
	public VibratoriumEntityBlock()
	{
		super(Material.iron);
		//this.setBlockName("vibratorium");
		//this.setBlockTextureName(Main.MODID + ":" + "vibratorium");
		this.setHardness(2);
		this.setResistance(6);
		this.setHarvestLevel("pickaxe", 2);
		this.setCreativeTab(ModItems.tabAutomagetion);
	}

	/*@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) 
	{
		// TODO Auto-generated method stub
		return new VibratoriumEntity();
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int someInt, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
		//Client-Side only
		if (!world.isRemote)
		{
			player.openGui(Main.instance, ModGuiHandler.VIBRATORIUM_GUI, world, x, y, z);
		}
        return true;
    }
	
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase player, ItemStack stack) 
	{
		int rotat = Math.round(((player.rotationYawHead - 180)/90)) % 4; //"Rotat Number" divides rotation into 4 zones
		rotat = rotat < 0 ? 4 + rotat : rotat;
		System.out.println("Vibratorium placed with rotat number " + rotat);
		world.setBlockMetadataWithNotify(x, y, z, rotat, 2);
		
	}

	
	public void registerBlockIcons(BlockRenderRegister reg)
	{
		this.icons[0] = reg.register(this.textureName  + "_0"); //Bottom
		this.icons[1] = reg.register(this.textureName + "_1"); //Top
		this.icons[2] = reg.registerIcon(this.textureName + "_2"); //Back
		this.icons[3] = reg.registerIcon(this.textureName + "_3"); //Front
		this.icons[4] = reg.registerIcon(this.textureName + "_4"); //Left
		this.icons[5] = reg.registerIcon(this.textureName + "_5"); //Right
		this.icons[6] = reg.registerIcon(this.textureName + "_6"); //Rotated Top
	}
	
	public Icon getIcon(int side, int meta)
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
	}*/
}
