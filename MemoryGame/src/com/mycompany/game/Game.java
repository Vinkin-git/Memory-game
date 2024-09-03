package com.mycompany.game;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
	int tam;
	int Grid[][] = new int[tam][tam];
	boolean GridB[][] = new boolean[tam][tam];
	
	public final static void clearConsole()
	{
	    try
	    {
	        final String os = System.getProperty("os.name");

	        if (os.contains("Windows"))
	        {
	            Runtime.getRuntime().exec("cls");
	        }
	        else
	        {
	            Runtime.getRuntime().exec("clear");
	        }
	    }
	    catch (final Exception e)
	    {
	        //  Handle any exceptions.
	    }
	}
	
	public void print() {
		clearConsole();
		
		for(int i = 0; i < tam; ++i) {
			for(int j = 0; j < tam; ++j) {
				if(GridB[i][j]) System.out.print(Grid[i][j]);
			
				else System.out.print('X');
			}
			System.out.println();
		}
	}
	
	public void Gen() {
		ArrayList<Position> positions = new ArrayList<Position>();
		for(int i = 0; i < tam; ++i)
			for(int j = 0; i < tam; ++j) {
				positions.add(new Position(i, j));
			}
		
			
		for(int i = 0; i < tam; ++i) {		
			Random rand = new Random();
			
			int pos = rand.nextInt(tam);
			do {
				pos = rand.nextInt(tam);
				
				if(!positions.get(pos).gen) {
					positions.get(pos).gen = true;
					Grid[positions.get(pos).x][positions.get(pos).y] = i;
				}
			} while(!positions.get(pos).gen);
			
			do {
				pos = rand.nextInt(tam);
				
				if(!positions.get(pos).gen) {
					positions.get(pos).gen = true;
					Grid[positions.get(pos).x][positions.get(pos).y] = i;
				}
			} while(!positions.get(pos).gen);
		}
	}
	
	public int play(int x, int y) {
		return Grid[x][y];
	}
	
	public boolean play() {
		Scanner in = new Scanner(System.in);
		
		int x, y, x2, y2;
		
		System.out.println("Coodernada da primeira carta:");
		x = in.nextInt();
		y = in.nextInt();
		
		GridB[x][y] = true;
		print();
		
		System.out.println("Coodernada da segunda carta:");
		x2 = in.nextInt();
		y2 = in.nextInt();
		
		if(!(play(x, y) == play(x2, y2))) {
			GridB[x2][y2] = true;
			print();
			
			GridB[x][y] = false;
			GridB[x2][y2] = true;
			print();
			
			return false;
		}
		
		else {
			GridB[x2][y2] = true;
			//print();
			
			return true;
		}
		
	}
}
