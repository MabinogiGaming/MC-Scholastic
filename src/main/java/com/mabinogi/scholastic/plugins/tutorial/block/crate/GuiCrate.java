package com.mabinogi.scholastic.plugins.tutorial.block.crate;

import com.mabinogi.lib.gui.GuiBase;
import com.mabinogi.lib.gui.widget.WidgetLabelInventory;
import com.mabinogi.lib.gui.widget.WidgetLabelTitle;
import com.mabinogi.lib.tile.iface.IGuiTile;
import com.mabinogi.scholastic.ScholasticSettings;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiCrate extends GuiBase {
	
	private final ResourceLocation guiTexture = new ResourceLocation(ScholasticSettings.MODID + ":textures/gui/crate.png");

	public GuiCrate(InventoryPlayer inventory, IGuiTile tile)
	{
		super(new ContainerCrate(inventory, tile), tile);
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
