package com.automagetion.automagetion.gui;

import com.automagetion.automagetion.tileentity.ModStorage;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

public class GuiModTileEntity extends GuiContainer
{
	private IInventory playerInv;
	private ModStorage te;
	
	public GuiModTileEntity(IInventory playerInv, ModStorage te) 
	{
	    super(new ContainerModStorage(playerInv, te));

	    this.playerInv = playerInv;
	    this.te = te;

	    this.xSize = 176;
	    this.ySize = 166;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mX, int mY)
	{
		this.mc.getTextureManager().bindTexture(new ResourceLocation("automagetion:textures/gui/vibratorium.png"));
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) 
	{
	    String s = this.te.getInventoryName();
	    this.fontRendererObj.drawString(s, 88 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752);            //#404040
	    this.fontRendererObj.drawString(this.playerInv.getInventoryName(), 8, 72, 4210752);      //#404040
	}
}
