package layout;
import java.util.ArrayList;
import java.util.List;
import spaceships.Spaceship;

public class Square {

	private int id;
	private int xAxis;
	private int yAxis;
	private List<Spaceship> spaceships;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Spaceship> getSpaceships() {
		return spaceships;
	}

	public void setSpaceships(List<Spaceship> spaceships) {
		this.spaceships = spaceships;
	}

	
	
	public int getxAxis() {
		return xAxis;
	}
	public void setxAxis(int xAxis) {
		this.xAxis = xAxis;
	}
	public int getyAxis() {
		return yAxis;
	}
	public void setyAxis(int yAxis) {
		this.yAxis = yAxis;
	}
	
	public Square() {
		spaceships = new ArrayList<Spaceship>();
	}
}
