package game.terrains;
/**
 * Main class of the Java program.
 * This code allows you to solve a maze recursively using backtracking algorithm.
 * 
 */
import java.util.Arrays;

public class Scene implements Cloneable{
	// 0 - obstacle
	// 1 - open space
	// 2 - path taken
	// 3 - goal 
	private static int[][] DEFAULT_Scene = 
		{{0, 0, 1, 1, 1, 1, 1, 1},
		{2, 0, 1, 0, 0, 0, 1, 1},
		{1, 0, 1, 0, 0, 0, 0, 0},
		{1, 1, 1, 0, 0, 0, 0, 0},
		{0, 0, 1, 0, 1, 3, 1, 1},
		{0, 0, 1, 0, 1, 0, 0, 1},
		{1, 0, 1, 1, 1, 0, 0, 0},
		{1, 1, 1, 0, 1, 1, 0, 0}};

	private int[][] scene;

	// use symbols to make reading the output easier...
	// 0 - obstacle - '#'
	// 1 - open space - '.'
	// 2 - path taken - '+'
	// 3 - goal - '*'
	private char[] sceneSymbols = {'#', '.', '+', '*' };

	public Scene(int[][] scene){
		this.scene = scene;
	}

	public Scene(){
		this(DEFAULT_Scene);
	}
	
	public Scene clone(){
	   int[][] clonedScene = new int[scene.length][scene[0].length];
	   
	   for(int i=0; i<scene.length; i++){
	       clonedScene[i] = Arrays.copyOf(scene[i], scene[i].length);
	   }
	   return new Scene(clonedScene);
	}

	/* Another way to implement clone method using two loops
	public Scene clone(){
	   int[][] clonedScene = new int[scene.length][scene[0].length];
	   for(int i=0; i<scene.length; i++){
	       for (int j= 0; j< scene[i].length; j++){
	         clonedScene[i][j] = scene[i][j];
	       }
	   }
	   return new Scene(clonedScene);
	}
	*/
   public boolean findPathFrom(int row, int col) {

		// when we reach the goal we have solved the problem
		if (scene[row][col] == 3) {
			return true;
		}

		// add the position to our path changing its value to '2'
		scene[row][col] = 2;

		//try all available neighbours 
		//North (row, col-1), South (row, col+1), East (row+1, col) and West (row-1, col)
		// if any of these return true then we have solved the problem
		if (isAvailablePosition(row - 1, col) && findPathFrom(row - 1, col)) {
			return true;
		}
		if (isAvailablePosition(row + 1, col) && findPathFrom(row + 1, col)) {
			return true;
		}
		if (isAvailablePosition(row, col - 1) && findPathFrom(row, col - 1)) {
			return true;
		}
		if (isAvailablePosition(row, col + 1) && findPathFrom(row, col + 1)) {
			return true;
		}

		//If none of previous positions is valid or matches the goal, it is necessary to revert the 
		//temporary state. This reversal or backtrack is what gives name to the algorithm: backtracking
		scene[row][col] = 1;

		return false;
	}

	// A position is available if: (1) it is inside the bounds of the maze 
	// (2) if it is an open space or (3) it is the goal 
	private boolean isAvailablePosition(int row, int col) {
		boolean result =  row >= 0 && row < scene.length
				&& col >= 0 && col < scene[row].length
				&& (scene[row][col] == 1 || scene[row][col] == 3);
				return result;
	}

	//print the output using SCENE_SYMBOLS
	public void print(){
		for(int row = 0; row < scene.length; ++row) {
			for(int col = 0; col < scene[row].length; ++col) {
				System.out.print(sceneSymbols[scene[row][col]]);
			}
			System.out.println();
		}
	}

	public void print(char footprint){
		setFootprint(footprint);
		print();

	}
	
	private void setFootprint(char footprint){
		sceneSymbols[2] = footprint;
	}

}
