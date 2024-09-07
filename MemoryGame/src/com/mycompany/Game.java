package com.mycompany;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    int tam;
    int[][] Grid;
    boolean[][] GridB;

    Game(int x) {
        this.tam = x;
        this.Grid = new int[tam][tam];
        this.GridB = new boolean[tam][tam];
    }

    public void clearConsole() {
        // Método para limpar o console, pode não funcionar em IDEs.
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void print() {
        clearConsole();
        System.out.print("\n");
        for (int i = 0; i < tam; ++i) {
            for (int j = 0; j < tam; ++j) {
                if (GridB[i][j])
                    System.out.print(Grid[i][j] + " ");
                else
                    System.out.print('X' + " ");
            }
            System.out.println();
        }
        
        System.out.println("\n");
    }

    public void Gen() {
        ArrayList<Position> positions = new ArrayList<>();
        for (int i = 0; i < tam; ++i) {
            for (int j = 0; j < tam; ++j) {
                positions.add(new Position(i, j));
            }
        }

        Random rand = new Random();
        for (int i = 0; i < tam * tam / 2; ++i) {
            int pos1, pos2;
            do {
                pos1 = rand.nextInt(positions.size());
            } while (positions.get(pos1).gen);

            positions.get(pos1).gen = true;
            Grid[positions.get(pos1).x][positions.get(pos1).y] = i;

            do {
                pos2 = rand.nextInt(positions.size());
            } while (positions.get(pos2).gen);

            positions.get(pos2).gen = true;
            Grid[positions.get(pos2).x][positions.get(pos2).y] = i;
        }
    }

    public int play(int x, int y) {
        return Grid[x][y];
    }

    public boolean play(IA bot, int[] coords) {
        GridB[coords[0]][coords[1]] = true;
        bot.savePosition(coords[0], coords[1], Grid[coords[0]][coords[1]]);
        print();

        GridB[coords[2]][coords[3]] = true;
        bot.savePosition(coords[2], coords[3], Grid[coords[2]][coords[3]]);
        print();

        boolean match = play(coords[0], coords[1]) == play(coords[2], coords[3]);
        if (!match) {
            System.out.println("Não deu Match! >-<");
            GridB[coords[0]][coords[1]] = false;
            GridB[coords[2]][coords[3]] = false;
        } else {
            System.out.println("Match! ^-^");
            bot.setFoud(Grid[coords[0]][coords[1]]);
        }

        print();
        return match;
    }

    public boolean play(IA bot) {
        Scanner in = new Scanner(System.in);
        int[] coords = new int[4];

        // Primeiro par de coordenadas
        while (true) {
            System.out.println("Coordenada da primeira carta (formato: x y):");
            coords[0] = in.nextInt();
            coords[1] = in.nextInt();

            if (coords[0] >= 0 && coords[0] < tam && coords[1] >= 0 &&
                coords[1] < tam && !GridB[coords[0]][coords[1]]) {
                GridB[coords[0]][coords[1]] = true;
                bot.savePosition(coords[0], coords[1], Grid[coords[0]][coords[1]]);
                break;
            } else {
                System.out.println("Tente novamente. ~_~.");
            }
        }

        print();

        // Segundo par de coordenadas
        while (true) {
            System.out.println("Coordenada da segunda carta (formato: x y):");
            coords[2] = in.nextInt();
            coords[3] = in.nextInt();

            if (coords[2] >= 0 && coords[2] < tam &&
                coords[3] >= 0 && coords[3] < tam &&
                !GridB[coords[2]][coords[3]] &&
                !(coords[0] == coords[2] && coords[1] == coords[3])) {
                GridB[coords[2]][coords[3]] = true;
                bot.savePosition(coords[2], coords[3], Grid[coords[2]][coords[3]]);
                break;
            } else {
                System.out.println("Tente novamente. ~_~");
            }
        }

        print();

        boolean match = play(coords[0], coords[1]) == play(coords[2], coords[3]);
        if (!match) {
            System.out.println("Não deu Match! >-<");
            GridB[coords[0]][coords[1]] = false;
            GridB[coords[2]][coords[3]] = false;
        } else {
            System.out.println("Match! ^-^");
            bot.setFoud(Grid[coords[2]][coords[3]]);
        }

        print();
        return match;
    }
}
