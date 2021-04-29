package spaceships;

import java.util.Iterator;
import java.util.List;

import layout.Grid;
import layout.Square;

public class MasterSpaceShip extends Spaceship implements Killable, Movable {

	public MasterSpaceShip(int shipId, String shipName) {
		this.setId(shipId);
		this.setName(shipName);
	}
	
	public void move(Grid grid) {
		//Square startSquare = findSquare(startSquareId, grid);
		Square startSquare = grid.locateShip(this.getId());
		int startX = startSquare.getxAxis();
		int startY = startSquare.getyAxis();
		List<Square> neighbours = grid.getSquareNeighbours(startX, startY);
		
		int newSquareIndex = getRandomInteger(0, neighbours.size());
		int newX = neighbours.get(newSquareIndex).getxAxis();
		int newY = neighbours.get(newSquareIndex).getyAxis();
		
		System.out.println(String.format("mastership is moving to coordinates %s and %s",
				newX, newY));

		grid.getSquares()[startX][startY].getSpaceships().remove(this);		
		System.out.println(String.format("sky sector with coordinates %s and %s has %s ships",
				startX, startY, grid.getSquares()[startX][startY].getSpaceships().size()));
		
		grid.getSquares()[newX][newY].getSpaceships().add(this);
		System.out.println(String.format("sky sector with coordinates %s and %s has %s ships",
				grid.getSquares()[newX][newY].getxAxis(), grid.getSquares()[newX][newY].getyAxis(), grid.getSquares()[newX][newY].getSpaceships().size()));
		
		

	}

	public void kill(Spaceship ship) {
		// TODO Auto-generated method stub

	}
	
	public int enterSky(Grid grid) {
		int x = getRandomInteger(0, 4);
		int y = getRandomInteger(0, 4);
		
		System.out.println(String.format("%s entered the sky at coordinates %s and %s", this.getName(), x, y));
		grid.getSquares()[x][y].getSpaceships().add(this);
		System.out.println(String.format("sky sector with coordinates %s and %s has %s ships",
				grid.getSquares()[x][y].getxAxis(), grid.getSquares()[x][y].getyAxis(), grid.getSquares()[x][y].getSpaceships().size()));
		
		return grid.getSquares()[x][y].getId();
	}
	
	private Square findSquare(int squareId, Grid grid) {
		
		for (int i = 0; i < grid.getSquares().length; i++) {
			for (int j = 0; j < grid.getSquares()[i].length; j++) {
				if(squareId == grid.getSquares()[i][j].getId())
					return grid.getSquares()[i][j];
			}
		}
		return null;
	}

}
