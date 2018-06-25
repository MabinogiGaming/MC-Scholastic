package com.mabinogi.scholastic.plugins.tutorial.block.barrel;

import com.mabinogi.lib.gui.GuiBase;
import com.mabinogi.lib.gui.widget.WidgetFluidTank;
import com.mabinogi.lib.gui.widget.WidgetLabelInventory;
import com.mabinogi.lib.gui.widget.WidgetLabelTitle;
import com.mabinogi.lib.tile.iface.IGuiTile;
import com.mabinogi.scholastic.ScholasticSettings;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiBarrel extends GuiBase {
	
	private final ResourceLocation guiTexture = new ResourceLocation(ScholasticSettings.MODID + ":textures/gui/barrel.png");

	public GuiBarrel(InventoryPlayer inventory, IGuiTile tile)
	{
		super(new ContainerBarrel(inventory, tile), tile);
	}

	@Override
	public ResourceLocation getGuiTexture()
	{
		return guiTexture;
	}
	
	@Override
	public void initGui()
	{
		super.initGui();
		
		widgets.clear();
		widgets.add(new WidgetLabelTitle(this));
		widgets.add(new WidgetLabelInventory(this));
		widgets.add(new WidgetFluidTank(this, (xSize - WidgetFluidTank.WIDTH)/2, ySize - WidgetFluidTank.HEIGHT - 97, TileBarrel.SLOT_TANK_STORAGE));
	}

}
