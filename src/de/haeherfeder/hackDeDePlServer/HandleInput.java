package de.haeherfeder.hackDeDePlServer;

import java.util.Scanner;
import de.haeherfeder.deDePlPlugin.Multiplayer.Plugin.packets.*;

public class HandleInput {
	private String host;
	Scanner in = new Scanner(System.in);
	private int port;
	private Client client;
	public HandleInput(String input) {
		switch(input) {
		case "SendObject":	
			String inp = in.next();
			switch(inp) {
			case "AddPlayerPacket":
				AddPlayerPacket packet = new AddPlayerPacket();
				System.out.print("Id eingeben: ");
				packet.id =in.nextInt();
				System.out.print("\n Name eingeben: ");
				packet.name = in.next();
				client.sendObject(packet);
				System.out.println("\n sended.");
			}
		case "sethost":
			System.out.print("Server");
			this.host =in.next();
			System.out.print("n Port");
			this.port = in.nextInt();
			this.client = new Client(host, port);
			System.out.println("");
			client.connect();
		default:
//			pl.userinput(input);
			System.out.println("no valid input");
			break;
		}
	}
}