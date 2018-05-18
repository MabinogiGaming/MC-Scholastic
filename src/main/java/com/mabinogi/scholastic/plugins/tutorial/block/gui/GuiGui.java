package com.mabinogi.scholastic.plugins.tutorial.block.gui;

import com.mabinogi.lib.gui.GuiBase;
import com.mabinogi.lib.gui.widget.WidgetLabelInventory;
import com.mabinogi.lib.gui.widget.WidgetLabelTitle;
import com.mabinogi.lib.tile.iface.IGuiTile;
import com.mabinogi.scholastic.Settings;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiGui extends GuiBase {
	
	private final ResourceLocation guiTexture = new ResourceLocation(Settings.MODID + ":textures/gui/gui.png");

	public GuiGui(InventoryPlayer inventory, IGuiTile tile)
	{
		super(new ContainerGui(inventory, tile), tile);
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
	}

}
