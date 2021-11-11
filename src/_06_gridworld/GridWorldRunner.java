package _06_gridworld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorldRunner {
public static void main(String[] args) {
	
	World world = new World();
	Bug bug = new Bug();
	Bug bug1 = new Bug(Color.blue);
	Flower flower = new Flower();
	Flower flower1 = new Flower();
	Location location = new Location(5,3);
	Location location1 = new Location(5,4);
	Location location2 = new Location(6,8);
	Location location3 = new Location(5,5);
	
	world.show();
	bug.turn();
	world.add(location1, bug);
	world.add(location2, bug1);
	world.add(location, flower);
	world.add(location3, flower1);
	for (int i = 0; i < 100; i++) {
		Location loc = new Location(i,i);
		world.add(loc, flower);
		
		
	
	}
	
	
	

}
}
