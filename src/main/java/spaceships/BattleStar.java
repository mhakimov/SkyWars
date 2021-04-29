package spaceships;

import java.util.List;

import layout.Grid;
import layout.Square;

public class BattleStar extends EnemyShip implements Movable, Killable {

	public BattleStar(int shipId, String shipName) {
		this.setId(shipId);
		this.setName(shipName);
	}
	
	@Override
	public void kill(Spaceship ship) {
		// TODO Auto-generated method stub

	}



	@Override
	public int enterSky(Grid grid) {
		int x = 0;
		int y = 3;
		
		System.out.println(String.format("mastership entered the sky at coordinates %s and %s", x, y));
		grid.getSquares()[x][y].getSpaceships().add(this);
		System.out.println(String.format("sky sector with coordinates %s and %s has %s ships",
				grid.getSquares()[x][y].getxAxis(), grid.getSquares()[x][y].getyAxis(), grid.getSquares()[x][y].getSpaceships().size()));
		
		return grid.getSquares()[x][y].getId();
	}

}
