package spaceships;

import java.util.List;

import layout.Grid;
import layout.Square;

public  class EnemyShip extends Spaceship implements Movable{
	
	
	public int enterSky(Grid grid) {
		int x = 0;
		int y = 3;
		
		System.out.println(String.format("enemy ship entered the sky at coordinates %s and %s", x, y));
		grid.getSquares()[x][y].getSpaceships().add(this);
		System.out.println(String.format("sky sector with coordinates %s and %s has %s ships",
				grid.getSquares()[x][y].getxAxis(), grid.getSquares()[x][y].getyAxis(), grid.getSquares()[x][y].getSpaceships().size()));
		
		return grid.getSquares()[x][y].getId();
	}
	
	@Override
	public void move(Grid grid) {
				Square startSquare = grid.locateShip(this.getId());
				int startX = startSquare.getxAxis();
				int startY = startSquare.getyAxis();
				List<Square> neighbours = grid.getSquareNeighbours(startX, startY);
				
				int newSquareIndex = getRandomInteger(0, neighbours.size());
				int newX = neighbours.get(newSquareIndex).getxAxis();
				int newY = neighbours.get(newSquareIndex).getyAxis();
				
				System.out.println(String.format("%s is moving to coordinates %s and %s",
						this.getName(), newX, newY));

				grid.getSquares()[startX][startY].getSpaceships().remove(this);		
				System.out.println(String.format("sky sector with coordinates %s and %s has %s ships",
						startX, startY, grid.getSquares()[startX][startY].getSpaceships().size()));
				
				grid.getSquares()[newX][newY].getSpaceships().add(this);
				System.out.println(String.format("sky sector with coordinates %s and %s has %s ships",
						grid.getSquares()[newX][newY].getxAxis(), grid.getSquares()[newX][newY].getyAxis(), grid.getSquares()[newX][newY].getSpaceships().size()));
				
				

	}
}
