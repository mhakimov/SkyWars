package game;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import layout.Grid;
import layout.Square;
import spaceships.BattleStar;
import spaceships.EnemyShip;
import spaceships.MasterSpaceShip;

public class SkyWarsGame {

	private Grid grid;
	private MasterSpaceShip masterShip;
	private BattleStar battleStar;
	private List<EnemyShip> enemyShips;
	int shipId = 1;
	
	public List<EnemyShip> getEnemyShips() {
		return enemyShips;
	}

	public void setEnemyShips(List<EnemyShip> enemyShips) {
		this.enemyShips = enemyShips;
	}

	
	
	
	public Grid getGrid() {
		return grid;
	}

	public void setGrid(Grid grid) {
		this.grid = grid;
	}

	public MasterSpaceShip getMasterShip() {
		return masterShip;
	}

	public void setMasterShip(MasterSpaceShip masterShip) {
		this.masterShip = masterShip;
	}

	
	
	public void startGame() {
		grid = new Grid();
		masterShip = new MasterSpaceShip(shipId, "Master");
		shipId++;
		enemyShips = new ArrayList<EnemyShip>();
		masterShip.enterSky(grid);
	//	masterShip.move(squareId, grid);
	}
	
	public void introduceEnemyShips() {
		int chanceOfIntroducing = Utils.getRandomInteger(1, 4);
		
		if(chanceOfIntroducing == 1) {
			int randomBattleShipType = Utils.getRandomInteger(1, 2);
			
			switch(randomBattleShipType) {
			case 1:
				battleStar = new BattleStar(shipId, "battlestar"+shipId);
				shipId++;
				enemyShips.add(battleStar);
				battleStar.enterSky(grid);
				break;
			}
			
		}
	}
	
	public void enemyShipsMove() {
		for (int i = 0; i < enemyShips.size(); i++) {
			enemyShips.get(i).move(grid);
		}
	}
	
	public void resolveConflict() {
		Square square = grid.locateShip(1);
		int x = square.getxAxis();
		int y = square.getyAxis();
		if(square.getSpaceships().size() > 1) {
	}
	
	
	
}
