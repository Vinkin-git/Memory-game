package com.mycompany;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int player1 = 0, player2 = 0, size = 4;
        Game game = new Game(size);
        IA bot = new IA(size);
        
        game.Gen();
        game.print();
        
        System.out.println("1 - Player X Player\n2 - Player X Com");
        int op = in.nextInt();

        switch (op) {
            case 1: {
                while (player1 + player2 < (size * size) / 2) {
                    System.out.println("Player 1:");
                    while(true) {
                    	if (game.play(bot)) player1++;
                    	else break;
                    }

                    System.out.println("Player 2:");
                    while(true) {
                    	if (game.play(bot)) player2++;
                    	else break;
                    }
                }

                if (player1 > player2) System.out.println("Player One Wins!!!");
                else if (player1 == player2) System.out.println("Draw!!!");
                else System.out.println("Player Zero Two Wins!!!");
            }
            break;
            case 2: {
                while (player1 + player2 < (size * size) / 2) {
                    System.out.println("Player 1:");
                    while(true) {
                    	if (game.play(bot)) player1++;
                    	else break;
                    }

                    System.out.println("Com:");
                    while(true) {
                    	if (game.play(bot, bot.play())) player2++;
                    	else break;
                    }
                }

                if (player1 > player2) System.out.println("Player One Wins!!!");
                else if (player1 == player2) System.out.println("Draw!!!");
                else System.out.println("... .. YOUUUUUuuUUUU ... LOOOOSEeeeE!!!");
                
            }
            break;
        }
        
        in.close(); 
    }
}
