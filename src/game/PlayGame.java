package game;

import java.util.Scanner;

import gameModel.Deck;

public class PlayGame {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	     System.out.println("Select game mode:\n Type 1 for master, 2 for servant");
	     String message = scanner.nextLine();
	     if(message.equals("1")){
	    	 MasterServer server = new MasterServer(MasterServer.DEFAULT_SERVER_PORT);

	     }
	     else if(message.equals("2"))
	     {
	    	 //TODO servant side implementation
	     }
	     else
	    	 System.out.println("Invalid request");
		/*
		Deck deck = new Deck();
		deck.shuffle();
		 */
    }

	
	}