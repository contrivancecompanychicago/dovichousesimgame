package com.dovichousesimgame;

import java.lang;
import com.dovichousesimgame.PrevalenceGame;
import com.dovichousesimgame.KrebsvilleWorld;
import com.dovichousesimgame.Chicagolike;
import com.dovichousesimgame.DovicHouseBasementScene;
import com.dovichousesimgame.Explorer;
import com.dovichousesimgame.game.terrains.Chicagolike;

public class dovichousesimgameMain {
    public static void main(String[] args) {
        Maze mazeToExplore = new Maze();
        Maze aux = mazeToExplore.clone();
	    if (aux.findPathFrom(1, 0)) {
	        System.out.println("maze solved");
			aux.print();
			System.out.println("original maze");
			mazeToExplore.print();
			
		} else {
		    System.out.println("no solution found");
		}
    }
}
