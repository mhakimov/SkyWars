
package spaceships;

import java.util.Random;

import layout.Grid;

public abstract class Spaceship {
	private int id;
	private String name;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract int enterSky(Grid grid);
	
	public int getRandomInteger(int minimum, int maximum) {
		 Random random = new Random();
		    return random.nextInt(maximum - minimum) + minimum;
	}
}
