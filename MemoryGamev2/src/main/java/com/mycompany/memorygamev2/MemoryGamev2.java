/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.memorygamev2;

import com.mycompany.memorygamev2.Interface.Initialization;

/**
 *
 * @author vinic
 */
public class MemoryGamev2 {
    public static void main(String[] args) {
        Initialization console = new Initialization();
        console.setVisible(true);
        
        /*Scanner in = new Scanner(System.in);
        int player1 = 0, player2 = 0, size = 4;
        Game game = new Game(size);
        IA bot = new IA(size);
        
        game.Gen();
        game.print();
        
        System.out.println("1 - Player X Player\n2 - Player X Com");
        int op = in.nextInt();

        if (op == 1) {
            // Modo Jogador vs Jogador
            while ((player1 + player2 ) < (((size * size) / 2))) {
                System.out.println("Player 1:");
                while (true && ((player1 + player2) < (((size * size) / 2)))) {
                    if (game.play(bot) && (player1 + player2) < ((size * size) / 2)) player1++;
                    else break;
                }

                System.out.println("Player 2:");
                while (true && ((player1 + player2) < (((size * size) / 2)))) {
                    if (game.play(bot) && (player1 + player2) < ((size * size) / 2)) player2++;
                    else break;
                }

                System.out.println("Player1: " + player1 + "\n" +"Player2: " + player2);
            }

            if (player1 > player2) {
                System.out.println("Player One Wins!!!");
            } else if (player1 == player2) {
                System.out.println("Draw!!!");
            } else {
                System.out.println("Player Two Wins!!!");
            }

        } else if (op == 2) {
            // Modo Jogador vs Computador
            while ((player1 + player2) < (((size * size) / 2))) {
                System.out.println("Player 1:");
                while (true && ((player1 + player2) < (((size * size) / 2)))) {
                    if (game.play(bot)) player1++;
                    else break;
                }

                System.out.println("Com:");
                while (true && ((player1 + player2) < (((size * size) / 2)))) {
                    if (game.play(bot, bot.play())) player2++;
                    else break;
                }

                System.out.println("Player1: " + player1 + "\n" +"Com: " + player2);
            }

            if (player1 > player2) {
                System.out.println("Player One Wins!!!");
            } else if (player1 == player2) {
                System.out.println("Draw!!!");
            } else {
                System.out.println("... .. YOUUUUUuuUUUU ... LOOOOSEeeeE!!!");
            }

        } else {
            System.out.println("Invalid option.");
        }

        in.close();*/ 
    }
}
