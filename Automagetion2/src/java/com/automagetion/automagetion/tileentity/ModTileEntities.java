package com.automagetion.automagetion.tileentity;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTileEntities
{
	public static VibratoriumEntity vibratorium;
	public static VibratoriumEntityBlock vibratoriumBlock;
	
	public static void init()
	{
		vibratorium = new VibratoriumEntity();
		vibratoriumBlock = new VibratoriumEntityBlock();
		
		
		GameRegistry.registerTileEntity(VibratoriumEntity.class, "vibratorium");
		GameRegistry.registerBlock(vibratoriumBlock, "vibratorium");
	}
}
