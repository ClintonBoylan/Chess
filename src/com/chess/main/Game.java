package com.chess.main;

import java.io.IOException;
import java.util.Scanner;

public class Game {
	
	GamePiece board[][];
	Player player1, player2;
	
	private void displayBoard() {
		
	}
	
	public static void main(String[] args) {
		
	}
	
	public void game() {
		String input;
		display("Welcome to the game of Chess!", 2);
		display("Press any key to start... (\'q\' to quit)", 0);
		if(getInput() == "q")
			return;
		
		
	}
	
	public String getInput() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		return input;
	}
	
	public void display(String output, int newLines) {
		if(output != null)
			System.out.print(output);
		
		while(newLines > 0) {
			System.out.println();
			newLines--;
		}
	}

}
