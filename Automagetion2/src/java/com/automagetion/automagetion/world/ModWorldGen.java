package com.automagetion.automagetion.world;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator
{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch (world.provider.getDimensionId()) 
		{
		    case 0: //Overworld
	
		        break;
		    case -1: //Nether
	
		        break;
		    case 1: //End
	
		        break;
	    }
	}

}
