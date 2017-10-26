package com.automagetion.automagetion.crafting;

import com.automagetion.automagetion.block.ModBlocks;
import com.automagetion.automagetion.item.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BasicCrafting 
{
	public static final void init()
	{
		//Basic crafting bench
		GameRegistry.addRecipe(new ItemStack(ModItems.broom), new Object[] {"  S", " S ", "W  ", 'S', Items.stick, 'W', Items.wheat});
		GameRegistry.addRecipe(new ItemStack(ModItems.songPaper, 3), new Object[] {"WWW", 'W', ModItems.whistlingReed});
		GameRegistry.addRecipe(new ItemStack(ModItems.reedAssembly), new Object[] {"WI ", "SWR", " SW", 'W', ModItems.whistlingReed, 'I', Items.iron_ingot, 'R', Items.redstone, 'S', ModBlocks.songwood});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.composery), new Object[] {" B ", "CRC", " S ", 'B', Items.writable_book, 'C', ModItems.chantRootFibers, 'R', ModItems.reedAssembly, 'S', ModBlocks.songwood});
		GameRegistry.addRecipe(new ItemStack(Blocks.hopper), new Object[] {" R ", "ICI", " I ", 'I', Items.iron_ingot, 'C', Blocks.chest, 'R', Items.redstone});
		
		//Wood Crossovers
		GameRegistry.addRecipe(new ItemStack(ModBlocks.songwood, 4), new Object[] {"L", 'L', ModBlocks.songwoodLog});
		GameRegistry.addRecipe(new ItemStack(Items.stick, 4), new Object[] {"W", "W", 'W', ModBlocks.songwood});
		GameRegistry.addRecipe(new ItemStack(Items.bed), new Object[] {"OOO", "WWW", 'W', ModBlocks.songwood, 'O', Blocks.wool});
		GameRegistry.addRecipe(new ItemStack(Items.boat), new Object[] {"W W", "WWW", 'W', ModBlocks.songwood});
		GameRegistry.addRecipe(new ItemStack(Blocks.bookshelf), new Object[] {"WWW", "BBB", "WWW", 'W', ModBlocks.songwood, 'B', Items.book});
		GameRegistry.addRecipe(new ItemStack(Items.bowl, 4), new Object[] {"W W", " W ", 'W', ModBlocks.songwood});
		GameRegistry.addRecipe(new ItemStack(Blocks.chest), new Object[] {"WWW", "W W", "WWW", 'W', ModBlocks.songwood});
		GameRegistry.addRecipe(new ItemStack(Blocks.crafting_table), new Object[] {"WW", "WW", 'W', ModBlocks.songwood});
		//GameRegistry.addRecipe(new ItemStack(Blocks.fence_gate), new Object[] {"SWS", "SWS", 'W', ModBlocks.songwood, 'S', Items.stick}); //needs specific texture for fence, gate, and door
		GameRegistry.addRecipe(new ItemStack(Blocks.jukebox), new Object[] {"WWW", "WDW", "WWW", 'W', ModBlocks.songwood, 'D', Items.diamond});
		GameRegistry.addRecipe(new ItemStack(Blocks.noteblock), new Object[] {"WWW", "WRW", "WWW", 'W', ModBlocks.songwood, 'R', Items.redstone});
		GameRegistry.addRecipe(new ItemStack(Blocks.piston), new Object[] {"WWW", "CIC", "CRC", 'W', ModBlocks.songwood, 'I', Items.iron_ingot, 'C', Blocks.cobblestone, 'R', Items.redstone});
		GameRegistry.addRecipe(new ItemStack(Items.sign, 3), new Object[] {"WWW", "WWW", " S ", 'W', ModBlocks.songwood, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(Blocks.tripwire_hook, 2), new Object[] {"I", "S", "W", 'W', ModBlocks.songwood, 'I', Items.iron_ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(Blocks.wooden_button), new Object[] {"W", 'W', ModBlocks.songwood});
		GameRegistry.addRecipe(new ItemStack(Blocks.wooden_pressure_plate), new Object[] {"WW", 'W', ModBlocks.songwood});
		GameRegistry.addRecipe(new ItemStack(Items.wooden_pickaxe), new Object[] {"WW ", "WS ", " S ", 'W', ModBlocks.songwood, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(Items.wooden_axe), new Object[] {"WW ", "WS ", " S ", 'W', ModBlocks.songwood, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(Items.wooden_hoe), new Object[] {"WW ", " S ", " S ", 'W', ModBlocks.songwood, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(Items.wooden_sword), new Object[] {" W ", " W ", " S ", 'W', ModBlocks.songwood, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(Items.wooden_shovel), new Object[] {" W ", " S ", " S ", 'W', ModBlocks.songwood, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(Blocks.trapdoor, 2), new Object[] {"WWW", "WWW", 'W', ModBlocks.songwood});
		
		//Songwood Door
		//Songwood Stairs
		//Songwood Slab
		//Songwood Fence? 
		
		//Basic furnace
		GameRegistry.addSmelting(new ItemStack(ModItems.chantRoot), new ItemStack(ModItems.chantRootFibers), (float)0.1);
	}
}
