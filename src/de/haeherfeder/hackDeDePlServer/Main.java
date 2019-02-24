package de.haeherfeder.hackDeDePlServer;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main(args);
	}
	public Main(String[] args) {
		System.out.println("Which object do you want to start?");
		Scanner in = new Scanner(System.in);
		boolean run = true;
		while(run) {
		 	String input = in.next();
		 	new HandleInput(input);
		}
		in.close();
	}
}
