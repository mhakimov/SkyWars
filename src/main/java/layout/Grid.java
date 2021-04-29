package layout;
import java.util.ArrayList;
import java.util.List;

public class Grid {

	private Square[][] squares;
	
	public Square[][] getSquares() {
		return squares;
	}

	public void setSquares(Square[][] squares) {
		this.squares = squares;
	}

	public Grid() {
		squares = new Square[4][4];
		int id = 0;
		for(int x = 0; x < squares.length; x++) {
			for(int y = 0; y < squares[x].length; y++) {
				id++;
				squares[x][y]= new Square();
				squares[x][y].setxAxis(x);
				squares[x][y].setyAxis(y);
				squares[x][y].setId(id);
			}
		}
	}
	
	public List<Square> getSquareNeighbours(int x, int y) {
		List<Square> neighbours = new ArrayList<Square>();
		findTopNeighbours(x, y, neighbours);
		findSideNeighbours(x, y, neighbours);
		findBottomNeighbours(x, y, neighbours);
		return neighbours;
	}
	

	
	private void findTopNeighbours(int x, int y, List<Square> neighbours) {
		if(y != 3) {
			if(x != 0)
				neighbours.add(squares[x-1][y+1]);
			
			neighbours.add(squares[x][y+1]);
			
			if(x != 3)
				neighbours.add(squares[x+1][y+1]);
		}
	}
	
	private void findSideNeighbours(int x, int y, List<Square> neighbours) {
		if(x != 0)
			neighbours.add(squares[x-1][y]);
		
		if(x != 3)
			neighbours.add(squares[x+1][y]);
	}
	
	private void findBottomNeighbours(int x, int y, List<Square> neighbours) {
		if(y != 0) {
			if(x != 0)
				neighbours.add(squares[x-1][y-1]);
			
			neighbours.add(squares[x][y-1]);
			
			if(x != 3)
				neighbours.add(squares[x+1][y-1]);
		}
	}
	
	public Square locateShip(int shipId) {
		for (int x = 0; x < squares.length; x++) {
			for (int y = 0; y < squares[x].length; y++) {
				if(squares[x][y].getSpaceships().stream().filter(s->s.getId() == shipId).findFirst().isPresent())
					return squares[x][y];							
			}
		}
		return null;
	}
}
