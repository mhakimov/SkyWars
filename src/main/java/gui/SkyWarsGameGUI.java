package gui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import game.SkyWarsGame;
import spaceships.Spaceship;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class SkyWarsGameGUI extends JFrame {

	SkyWarsGame game;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	
	private SkyWarsGame theGame = new SkyWarsGame();
	private JLabel square4;
	private JLabel square8;
	private JLabel square12;
	private JLabel square16;
	private JLabel square7;
	private JLabel square3;
	private JLabel square11;
	private JLabel square15;
	private JLabel square6;
	private JLabel square2;
	private JLabel square10;
	private JLabel square14;
	private JLabel square5;
	private JLabel square9;
	private JLabel square13;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel square1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SkyWarsGameGUI frame = new SkyWarsGameGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SkyWarsGameGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 864, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getSquare4());
		contentPane.add(getSquare8());
		contentPane.add(getSquare12());
		contentPane.add(getSquare16());
		contentPane.add(getSquare7());
		contentPane.add(getSquare3());
		contentPane.add(getSquare11());
		contentPane.add(getSquare15());
		contentPane.add(getSquare6());
		contentPane.add(getSquare2());
		contentPane.add(getSquare10());
		contentPane.add(getSquare14());
		contentPane.add(getSquare5());
		contentPane.add(getSquare9());
		contentPane.add(getSquare13());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getSquare1());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Let the war begin!");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblNewLabel.setBounds(199, 22, 190, 51);
		}
		return lblNewLabel;
	}
	private JLabel getSquare4() {
		if (square4 == null) {
			square4 = new JLabel("( )");
			square4.setBounds(79, 191, 146, 97);
		}
		return square4;
	}
	private JLabel getSquare8() {
		if (square8 == null) {
			square8 = new JLabel("*");
			square8.setBounds(235, 191, 180, 97);
		}
		return square8;
	}
	private JLabel getSquare12() {
		if (square12 == null) {
			square12 = new JLabel("*");
			square12.setBounds(425, 191, 177, 97);
		}
		return square12;
	}
	private JLabel getSquare16() {
		if (square16 == null) {
			square16 = new JLabel("*");
			square16.setBounds(616, 191, 161, 97);
		}
		return square16;
	}
	private JLabel getSquare7() {
		if (square7 == null) {
			square7 = new JLabel("*");
			square7.setBounds(235, 315, 123, 77);
		}
		return square7;
	}
	private JLabel getSquare3() {
		if (square3 == null) {
			square3 = new JLabel("*");
			square3.setBounds(79, 315, 123, 77);
		}
		return square3;
	}
	private JLabel getSquare11() {
		if (square11 == null) {
			square11 = new JLabel("*");
			square11.setBounds(426, 315, 176, 87);
		}
		return square11;
	}
	private JLabel getSquare15() {
		if (square15 == null) {
			square15 = new JLabel("*");
			square15.setBounds(616, 315, 148, 77);
		}
		return square15;
	}
	private JLabel getSquare6() {
		if (square6 == null) {
			square6 = new JLabel("*");
			square6.setBounds(234, 403, 175, 99);
		}
		return square6;
	}
	private JLabel getSquare2() {
		if (square2 == null) {
			square2 = new JLabel("*");
			square2.setBounds(79, 403, 146, 99);
		}
		return square2;
	}
	private JLabel getSquare10() {
		if (square10 == null) {
			square10 = new JLabel("*");
			square10.setBounds(425, 415, 175, 87);
		}
		return square10;
	}
	private JLabel getSquare14() {
		if (square14 == null) {
			square14 = new JLabel("*");
			square14.setBounds(615, 426, 66, 76);
		}
		return square14;
	}
	private JLabel getSquare5() {
		if (square5 == null) {
			square5 = new JLabel("*");
			square5.setBounds(241, 507, 148, 96);
		}
		return square5;
	}
	
	private void updateSquares() {
		square1.setText(displayShips(0,0));
		square2.setText(displayShips(0,1));
		square3.setText(displayShips(0,2));
		square4.setText(displayShips(0,3));
		square5.setText(displayShips(1,0));
		square6.setText(displayShips(1,1));
		square7.setText(displayShips(1,2));
		square8.setText(displayShips(1,3));
		square9.setText(displayShips(2,0));
		square10.setText(displayShips(2,1));
		square11.setText(displayShips(2,2));
		square12.setText(displayShips(2,3));
		square13.setText(displayShips(3,0));
		square14.setText(displayShips(3,1));
		square15.setText(displayShips(3,2));
		square16.setText(displayShips(3,3));
//		square1.setText(""+game.getGrid().getSquares()[0][0].getSpaceships().size());
//		square2.setText(""+game.getGrid().getSquares()[0][1].getSpaceships().size());
//		square3.setText(""+game.getGrid().getSquares()[0][2].getSpaceships().size());
//		square4.setText(""+game.getGrid().getSquares()[0][3].getSpaceships().size());
//		square5.setText(""+game.getGrid().getSquares()[1][0].getSpaceships().size());
//		square6.setText(""+game.getGrid().getSquares()[1][1].getSpaceships().size());
//		square7.setText(""+game.getGrid().getSquares()[1][2].getSpaceships().size());
//		square8.setText(""+game.getGrid().getSquares()[1][3].getSpaceships().size());
//		square9.setText(""+game.getGrid().getSquares()[2][0].getSpaceships().size());
//		square10.setText(""+game.getGrid().getSquares()[2][1].getSpaceships().size());
//		square11.setText(""+game.getGrid().getSquares()[2][2].getSpaceships().size());
//		square12.setText(""+game.getGrid().getSquares()[2][3].getSpaceships().size());
//		square13.setText(""+game.getGrid().getSquares()[3][0].getSpaceships().size());
//		square14.setText(""+game.getGrid().getSquares()[3][1].getSpaceships().size());
//		square15.setText(""+game.getGrid().getSquares()[3][2].getSpaceships().size());
//		square16.setText(""+game.getGrid().getSquares()[3][3].getSpaceships().size());
	}
	
	private String displayShips(int x, int y) {
		String shipsStr = "<html>";
		List<Spaceship> ships = game.getGrid().getSquares()[x][y].getSpaceships();
		
		if(ships.isEmpty()) {
			if(x==0 && y==3)
				return "( )";
			else
				return "*";
		}			
		
		for (int i = 0; i < ships.size(); i++) {
			shipsStr = shipsStr + ships.get(i).getName() + "<br/>";
		}
		return shipsStr+"</html>";
	}
	private JLabel getSquare9() {
		if (square9 == null) {
			square9 = new JLabel("*");
			square9.setBounds(425, 507, 175, 96);
		}
		return square9;
	}
	private JLabel getSquare13() {
		if (square13 == null) {
			square13 = new JLabel("*");
			square13.setBounds(616, 508, 148, 94);
		}
		return square13;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Save the Galaxy!");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					game = new SkyWarsGame();
					game.startGame();
					updateSquares();
				}
			});
			btnNewButton.setBounds(291, 84, 140, 41);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Make a move");
//			btnNewButton_1.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent e) {
//					game.getMasterShip().move(game.getGrid());
//					updateSquares();
//					game.introduceEnemyShips();
//					updateSquares();
//					game.enemyShipsMove();
//				}
//			});
			btnNewButton_1.addActionListener(new ActionListener() {
				 public void actionPerformed(ActionEvent e) {
					  new Thread( ()->{
						
							try {	
								game.getMasterShip().move(game.getGrid());
								updateSquares();
								Thread.sleep(500);
								game.enemyShipsMove();
								updateSquares();
								Thread.sleep(500);
								game.introduceEnemyShips();
								updateSquares();
								Thread.sleep(500);
								//game.fight
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							
							
//						     for (int i = 0; i < 99; i++) {
//						           
//						            final int fi = i;
//						            EventQueue.invokeLater( ()->{
//						                digitRefresh(reader.getInputs()[fi], (int) reader.getInputs()[fi][0], 0);
//						            });
//						            }

					        }
					        ).start();
				        }
			});
			btnNewButton_1.setBounds(34, 84, 123, 41);
		}
		return btnNewButton_1;
	}
	private JLabel getSquare1() {
		if (square1 == null) {
			square1 = new JLabel("*");
			square1.setBounds(79, 507, 148, 96);
		}
		return square1;
	}
}
