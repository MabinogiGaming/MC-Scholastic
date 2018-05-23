package com.mabinogi.scholastic.plugins.tutorial.block.blank;

import com.mabinogi.lib.gui.GuiBase;
import com.mabinogi.lib.gui.widget.WidgetLabelTitle;
import com.mabinogi.lib.tile.iface.IGuiTile;
import com.mabinogi.scholastic.ScholasticSettings;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiBlank extends GuiBase {
	
	private final ResourceLocation guiTexture = new ResourceLocation(ScholasticSettings.MODID + ":textures/gui/blank.png");

	public GuiBlank(InventoryPlayer inventory, IGuiTile tile)
	{
		super(new ContainerBlank(inventory, tile), tile);
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
	}

}