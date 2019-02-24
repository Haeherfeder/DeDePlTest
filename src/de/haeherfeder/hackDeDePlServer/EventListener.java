package de.haeherfeder.hackDeDePlServer;

//package com.arcxesgames.main;

import de.haeherfeder.deDePlPlugin.Multiplayer.Plugin.packets.*;

public class EventListener {
	
	public void received(Object p) {
		if(p instanceof AddPlayerPacket) {
			AddPlayerPacket packet = (AddPlayerPacket)p;
//			PlayerHandler.players.put(packet.id, new NetPlayer(packet.id,packet.name));
			System.out.println(packet.name + " has joined the game");
		}else if(p instanceof RemovePlayerPacket) {
			RemovePlayerPacket packet = (RemovePlayerPacket)p;
//			System.out.println(PlayerHandler.players.get(packet.id).name + " has left the game");
//			PlayerHandler.players.remove(packet.id);
			System.out.println(packet.id+" was removed.");
		}else if(p instanceof FramePacket) {
			FramePacket packet = (FramePacket)p;
			int id = packet.id;
			String tf = packet.tf1Text;
			System.out.println(id+tf);
		}
	}
}