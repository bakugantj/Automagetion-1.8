package com.automagetion.automagetion.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems 
{
	//Static item instances for reference
	public static Item chantRootFibers;
	public static Item chantRoot;
	public static Broom broom;
	public static Item whistlingReed;
	public static Item songPaper;
	public static Item reedAssembly;
	public static Item songwoodSapling;
	
	//Melodies
	public static Melody cantio;
	public static Melody sopio;
	public static Melody bellum;
	public static Melody pax;
	public static Melody infernum;
	public static Melody caelum;
	public static Melody mundus;
	public static Melody inanis;
	public static Melody natura;
	public static Melody funus;
	public static Melody calor;
	public static Melody irrigus;
	public static Melody creo;
	public static Melody evorsio;
	public static Melody imperium;
	public static Melody animo;
	
	//Creating custom tab
	public static final CreativeTabs tabAutomagetion = new CreativeTabs("Automagetion")
	{
	    @Override public Item getTabIconItem() 
	    {
	        return ModItems.cantio;
	    }
	};
	
    public static final void init() 
    {
    	//Initialize items with basic information
   	chantRootFibers = new Item().setUnlocalizedName("chantRootFibers").setCreativeTab(tabAutomagetion);
    	chantRoot = new Item().setUnlocalizedName("chantRoot").setCreativeTab(tabAutomagetion);
    	broom = new Broom();
    	whistlingReed = new Item().setUnlocalizedName("whistlingReed").setCreativeTab(tabAutomagetion);
    	songPaper = new Item().setUnlocalizedName("songPaper").setCreativeTab(tabAutomagetion);
    	reedAssembly = new Item().setUnlocalizedName("reedAssembly").setCreativeTab(tabAutomagetion);
    	songwoodSapling = new Item().setUnlocalizedName("songwoodSapling").setCreativeTab(tabAutomagetion);
    	
    	//Melodies
    	cantio = new Melody();
    	cantio.setUnlocalizedName("cantio").setCreativeTab(tabAutomagetion);
    	sopio = new Melody();
    	sopio.setUnlocalizedName("sopio").setCreativeTab(tabAutomagetion);
    	bellum = new Melody();
    	bellum.setUnlocalizedName("bellum").setCreativeTab(tabAutomagetion);
    	pax = new Melody();
    	pax.setUnlocalizedName("pax").setCreativeTab(tabAutomagetion);
    	infernum = new Melody();
    	infernum.setUnlocalizedName("infernum").setCreativeTab(tabAutomagetion);
    	caelum = new Melody();
    	caelum.setUnlocalizedName("caelum").setCreativeTab(tabAutomagetion);
    	mundus = new Melody();
    	mundus.setUnlocalizedName("mundus").setCreativeTab(tabAutomagetion);
    	inanis = new Melody();
    	inanis.setUnlocalizedName("inanis").setCreativeTab(tabAutomagetion);
    	natura = new Melody();
    	natura.setUnlocalizedName("natura").setCreativeTab(tabAutomagetion);
    	funus = new Melody();
    	funus.setUnlocalizedName("funus").setCreativeTab(tabAutomagetion);
    	calor = new Melody();
    	calor.setUnlocalizedName("calor").setCreativeTab(tabAutomagetion);
    	irrigus = new Melody();
    	irrigus.setUnlocalizedName("irrigus").setCreativeTab(tabAutomagetion);
    	creo = new Melody();
    	creo.setUnlocalizedName("creo").setCreativeTab(tabAutomagetion);
    	evorsio = new Melody();
    	evorsio.setUnlocalizedName("evorsio").setCreativeTab(tabAutomagetion);
    	imperium = new Melody();
    	imperium.setUnlocalizedName("imperium").setCreativeTab(tabAutomagetion);
    	animo = new Melody();
    	animo.setUnlocalizedName("animo").setCreativeTab(tabAutomagetion); 
    	
    	//Registering items with forge
    	GameRegistry.registerItem(chantRootFibers, "chantRootFibers");
    	GameRegistry.registerItem(chantRoot, "chantRoot");
    	GameRegistry.registerItem(broom, "broom");
    	GameRegistry.registerItem(whistlingReed, "whistlingReed");
    	GameRegistry.registerItem(songPaper, "songPaper");
    	GameRegistry.registerItem(reedAssembly, "reedAssembly");
    	GameRegistry.registerItem(songwoodSapling, "songwoodSapling");
    	
    	GameRegistry.registerItem(cantio, "cantio");
    	GameRegistry.registerItem(sopio, "sopio");
    	GameRegistry.registerItem(bellum, "bellum");
    	GameRegistry.registerItem(pax, "pax");
    	GameRegistry.registerItem(infernum, "infernum");
    	GameRegistry.registerItem(caelum, "caelum");
    	GameRegistry.registerItem(mundus, "mundus");
    	GameRegistry.registerItem(inanis, "inanis");
    	GameRegistry.registerItem(natura, "natura");
    	GameRegistry.registerItem(funus, "funus");
    	GameRegistry.registerItem(calor, "calor");
    	GameRegistry.registerItem(irrigus, "irrigus");
    	GameRegistry.registerItem(creo, "creo");
    	GameRegistry.registerItem(evorsio, "evorsio");
    	GameRegistry.registerItem(imperium, "imperium");
    	GameRegistry.registerItem(animo, "animo");
    	
    }

}