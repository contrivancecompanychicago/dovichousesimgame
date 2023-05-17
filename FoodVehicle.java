package game.vehicles;
import game.characters.Explorer;
import game.terrains.Scene;
/**
 * This class model a Food Vehicle for DOVIC Simulation House Game
 * @author erichilarysmithsr
 * @version 1.0
 */
/**
 * Construct a new Food Vehicle using the specified name
 * @param name The String to be used as the name of the Food Vehicle
 */
/**
    * Returns the footprint of the Food Vehicle
    * @return The footprint of the Food Vehicle (a character 'c')
    */
/**
    * Explores the scene given as parameter
    * @param sceneToExplore The Scene being explored by the Food Vehicle
    */
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
