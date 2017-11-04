package com.automagetio.automagetion.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks 
{
	//Static instances of items for reference
    public static Songwood songwood;
    public static Block composery;
    public static SongwoodLog songwoodLog;

    public static final void init() 
    {
    	//Registering the blocks with Forge
    	GameRegistry.registerBlock(songwood = new Songwood(""), "songwood");
    	GameRegistry.registerBlock(songwoodLog = new SongwoodLog(), "songwoodLog");
    	GameRegistry.registerBlock(composery = new MultitextureBlock("composery", Material.wood), "composery");
    }

}