package com.mycompany;

import java.util.ArrayList;
import java.util.Random;

public class IA {
    int[][] controlGrid;
    int tam;
    ArrayList<Position> positions = new ArrayList<>();
    Random rand = new Random();
    boolean[] control;

    IA(int x) {
        this.controlGrid = new int[x][x];
        this.tam = x;
        this.control = new boolean[x * x / 2];

        for (int i = 0; i < tam; ++i) {
            for (int j = 0; j < tam; ++j) {
                positions.add(new Position(i, j));
                controlGrid[i][j] = -1;
            }
        }
    }

    public void savePosition(int x, int y, int num) {
        this.controlGrid[x][y] = num;
    }

    public int[] gen() {
        int[] ans = new int[4];

        while (true) {
            int x = rand.nextInt(tam * tam);
            if (controlGrid[positions.get(x).x][positions.get(x).y] == -1) {
                ans[0] = positions.get(x).x;
                ans[1] = positions.get(x).y;
                break;
            }
        }

        while (true) {
            int x = rand.nextInt(tam * tam);
            if (controlGrid[positions.get(x).x][positions.get(x).y] == -1) {
                ans[2] = positions.get(x).x;
                ans[3] = positions.get(x).y;
                break;
            }
        }

        return ans;
    }

    public int[] play() {
        int[] ans = new int[4];

        for (int i = 0; i < tam * tam / 2; ++i) {
            int aux = 0;
            for (int j = 0; j < tam; ++j) {
                for (int k = 0; k < tam; ++k) {
                    if (this.controlGrid[j][k] == i) {
                        ans[aux * 2] = j;
                        ans[aux * 2 + 1] = k;
                        aux++;
                    }

                    if (aux == 2 && !control[i]) {
                        control[i] = true;
                        return ans;
                    }
                }
            }
        }

        return gen();
    }

    public void setFoud(int num) {
        this.control[num] = true;
    }
}
