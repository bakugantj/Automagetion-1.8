package com.automagetion.automagetion.item;

import com.automagetion.automagetion.Main;

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
   	chantRootFibers = ((Object) new Item().setUnlocalizedName("chantRootFibers").setCreativeTab(tabAutomagetion)).setTextureName(Main.MODID + ":chantRootFibers");
    	chantRoot = ((Object) new Item().setUnlocalizedName("chantRoot").setCreativeTab(tabAutomagetion)).setTextureName(Main.MODID + ":chantRoot");
    	broom = new Broom();
    	whistlingReed = ((Object) new Item().setUnlocalizedName("whistlingReed").setCreativeTab(tabAutomagetion)).setTextureName(Main.MODID + ":whistlingReed");
    	songPaper = ((Object) new Item().setUnlocalizedName("songPaper").setCreativeTab(tabAutomagetion)).setTextureName(Main.MODID + ":songPaper");
    	reedAssembly = ((Object) new Item().setUnlocalizedName("reedAssembly").setCreativeTab(tabAutomagetion)).setTextureName(Main.MODID + ":reedAssembly");
    	songwoodSapling = ((Object) new Item().setUnlocalizedName("songwoodSapling").setCreativeTab(tabAutomagetion)).setTextureName(Main.MODID + ":songwoodSapling");
    	
    	//Melodies
    	cantio = new Melody();
    	//((Object) cantio.setUnlocalizedName("cantio").setCreativeTab(tabAutomagetion)).setTextureName(Main.MODID + ":cantio");
    	sopio = new Melody();
    	//((Object) sopio.setUnlocalizedName("sopio").setCreativeTab(tabAutomagetion)).setTextureName(Main.MODID + ":sopio");
    	bellum = new Melody();
    	//((Object) bellum.setUnlocalizedName("bellum").setCreativeTab(tabAutomagetion)).setTextureName(Main.MODID + ":bellum");
    	pax = new Melody();
    	//((Object) pax.setUnlocalizedName("pax").setCreativeTab(tabAutomagetion)).setTextureName(Main.MODID + ":pax");
    	infernum = new Melody();
    	//((Object) infernum.setUnlocalizedName("infernum").setCreativeTab(tabAutomagetion)).setTextureName(Main.MODID + ":infernum");
    	caelum = new Melody();
    	//((Object) caelum.setUnlocalizedName("caelum").setCreativeTab(tabAutomagetion)).setTextureName(Main.MODID + ":caelum");
    	mundus = new Melody();
    	//((Object) mundus.setUnlocalizedName("mundus").setCreativeTab(tabAutomagetion)).setTextureName(Main.MODID + ":mundus");
    	inanis = new Melody();
    	//((Object) inanis.setUnlocalizedName("inanis").setCreativeTab(tabAutomagetion)).setTextureName(Main.MODID + ":inanis");
    	natura = new Melody();
    	//((Object) natura.setUnlocalizedName("natura").setCreativeTab(tabAutomagetion)).setTextureName(Main.MODID + ":natura");
    	funus = new Melody();
    	//((Object) funus.setUnlocalizedName("funus").setCreativeTab(tabAutomagetion)).setTextureName(Main.MODID + ":funus");
    	calor = new Melody();
    	//((Object) calor.setUnlocalizedName("calor").setCreativeTab(tabAutomagetion)).setTextureName(Main.MODID + ":calor");
    	irrigus = new Melody();
    	//((Object) irrigus.setUnlocalizedName("irrigus").setCreativeTab(tabAutomagetion)).setTextureName(Main.MODID + ":irrigus");
    	creo = new Melody();
    	//((Object) creo.setUnlocalizedName("creo").setCreativeTab(tabAutomagetion)).setTextureName(Main.MODID + ":creo");
    	evorsio = new Melody();
    	//((Object) evorsio.setUnlocalizedName("evorsio").setCreativeTab(tabAutomagetion)).setTextureName(Main.MODID + ":evorsio");
    	imperium = new Melody();
    	//((Object) imperium.setUnlocalizedName("imperium").setCreativeTab(tabAutomagetion)).setTextureName(Main.MODID + ":imperium");
    	animo = new Melody();
    	//((Object) animo.setUnlocalizedName("animo").setCreativeTab(tabAutomagetion)).setTextureName(Main.MODID + ":animo"); 
    	
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