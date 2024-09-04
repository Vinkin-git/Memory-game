package com.mycompany;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int player1 = 0, player2 = 0, size = 4;
		Game game = new Game(size);
		
		while(true){
			game.Gen();
			game.print();
			
			System.out.println("1 - Player X Player \n 2 - Player X Com");
			
			int op = in.nextInt();
			switch(op) {
				case 1:{
						while(player1 + player2 <= (size * size) / 2) {
							int a, b, c, d;
							System.out.println("Player 1:");
							System.out.println("Jogada 1:");
							a = in.nextInt();
							b = in.nextInt();
							System.out.println("Jogada 2:");
							c = in.nextInt();
							d = in.nextInt();
							if(game.play(game.fourToOne(a, b, c, d))) player1 += 1;
							
							System.out.println("Player 2:");
							System.out.println("Jogada 1:");
							a = in.nextInt();
							b = in.nextInt();
							System.out.println("Jogada 2:");
							c = in.nextInt();
							d = in.nextInt();
							
							if(game.play(game.fourToOne(a, b, c, d))) player2 += 1;
						}
					}
					break;
				case 2:
					break;
					
				default:
					break;
			}
					
			}
	}

}
