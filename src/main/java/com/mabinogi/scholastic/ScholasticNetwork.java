package com.mabinogi.scholastic;

import com.mabinogi.lib.network.NetworkHandler;
import com.mabinogi.lib.network.messages.MessageGui;
import com.mabinogi.lib.network.messages.MessageTile;

import net.minecraftforge.fml.relauncher.Side;

public class ScholasticNetwork extends NetworkHandler {
	
	//instance
	public static ScholasticNetwork instance = new ScholasticNetwork();

	@Override
	public String getMod()
	{
		return ScholasticSettings.MODID;
	}

	@Override
	public void init()
	{
		//to client messages
		network.registerMessage(MessageTile.class, MessageTile.class, 1, Side.CLIENT);
		network.registerMessage(MessageGui.class, MessageGui.class, 2, Side.CLIENT);
	}

}
