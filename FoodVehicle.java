package game.vehicles;

import game.characters.Explorer;
import game.terrains.Scene;

public class FoodVehicle implements Explorer{
   private String name;
   public FoodVehicle (String name){
       this.name = name;
   }
   public char getFootprint(){
        return 'c';
       
   }
   public void explore(scene sceneToExplore){
	    if (sceneToExplore.findPathFrom(1, 0)) {
			sceneToExplore.print(getFootprint());
		} else {
			System.out.println("no solution found");
		}
	}
}
