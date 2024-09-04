package com.mycompany;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    int tam;
    int Grid[][];
    boolean GridB[][];
    
    public int[] fourToOne(int x, int y,  int x2, int y2) { 
    	int ans[] = {x, y, x2, y2};
    	return ans;
    }

    Game(int x) {
        this.tam = x;
        this.Grid = new int[tam][tam];
        this.GridB = new boolean[tam][tam];
    }

    public void clearConsole() {
        // Este método é opcional e pode não funcionar em IDEs.
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void print() {
        clearConsole();

        for (int i = 0; i < tam; ++i) {
            for (int j = 0; j < tam; ++j) {
                if (GridB[i][j])
                    System.out.print(Grid[i][j] + " ");
                else
                    System.out.print('X' + " ");
            }
            System.out.println();
        }
    }

    public void Gen() {
        ArrayList<Position> positions = new ArrayList<>();
        for (int i = 0; i < tam; ++i)
            for (int j = 0; j < tam; ++j) {
                positions.add(new Position(i, j));
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

    public boolean play(int[] coodern) {

        
        while (true) {
            System.out.println("Coordenada da primeira carta (formato: x y):");

            if (coodern[0] >= 0 && coodern[0] < tam && coodern[1]>= 0 && 
            	coodern[1] < tam && !GridB[coodern[0]][coodern[1]]) {
                GridB[coodern[0]][coodern[1]] = true;
                break;
            } else {
                System.out.println("Tente novamente. ~_~.");
            }
        }

        print();


        while (true) {
            System.out.println("Coordenada da segunda carta (formato: x y):");

            if (coodern[2] >= 0 && coodern[2] < tam && 
            	coodern[3] >= 0 && coodern[3] < tam && 
            	!GridB[coodern[2]][coodern[3]] && 
            	!(coodern[0] == coodern[2] && coodern[1] == coodern[3])) {
                break;
            } else {
                System.out.println("Tente novamente. ~_~");
            }
        }

        GridB[coodern[2]][coodern[3]] = true;
        print();

        boolean Match = play(coodern[0], coodern[1]) == play(coodern[2], coodern[3]);
        if (!Match) {
            System.out.println("Não deu Match! >-<");
            GridB[coodern[0]][coodern[1]] = false;
            GridB[coodern[2]][coodern[3]] = false;
        } else {
            System.out.println("Match! ^-^");
        }

        print();

        return Match;
    }
}
