/**
 * Tic Tac Toe game in in a 4x4
 * 
 * modified     20220515
 * date         20220509
 * @filename    TicTac.java
 * @author      Oscar Lam
 * @version     1.0
 * @see         Unit 2 activity 5
 */

import java.awt.*;
import javax.swing.*;

public class TicTac extends JFrame {
	TicTacEvent tictac = new TicTacEvent(this);
	JPanel row1 = new JPanel();
	JPanel row2 = new JPanel();
	JPanel row3 = new JPanel();
	JButton[][] boxes = new JButton[4][4];
	JButton playAgain = new JButton("Play Again");
	JTextField txtXWins = new JTextField();
	JTextField txtYWins = new JTextField();
	JTextField txtTie = new JTextField();
	JTextField txtGames = new JTextField();
	JOptionPane win = new JOptionPane("Winner");
	ImageIcon back = new ImageIcon("back.png"); // https://opengameart.org/content/colorful-poker-card-back
	private final JPanel panel = new JPanel();

	public TicTac() {
		super ("Tic Tac Toe");
		setSize (750,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout layout = new FlowLayout();
		getContentPane().setLayout(layout);
		txtXWins.setEditable(false);
		txtYWins.setEditable(false);
		txtTie.setEditable(false);
		txtGames.setEditable(false);
		txtXWins.setText("X Wins: 0");
		txtYWins.setText("Y Wins: 0");
		txtTie.setText("Tie: 0");
		txtGames.setText("Games played: 1");
		txtXWins.setHorizontalAlignment(JTextField.CENTER); // https://stackoverflow.com/questions/15507639/how-do-i-center-a-jtextfield
		txtYWins.setHorizontalAlignment(JTextField.CENTER);
		txtTie.setHorizontalAlignment(JTextField.CENTER);
		int name = 0;
		String newname;

		GridLayout layout1 = new GridLayout(4, 4, 10, 10);
		GridLayout layout2 = new GridLayout(1,4,10,10);
		GridLayout layout3 = new GridLayout(1,1);
		row1.setLayout(layout1);
		row2.setLayout(layout2);
		row3.setLayout(layout3);  
		
		for (int x=0; x<=3; x++){
			for (int y=0; y<=3; y++){
				name = name + 1;
				newname = Integer.toString(name);
				boxes[x][y] = new JButton(newname);
				boxes[x][y].setIcon(back);
				row1.add(boxes[x][y]);
			}
		}
		playAgain.setEnabled(false);
		row2.add(txtGames);
		row2.add(txtXWins);
		row2.add(txtYWins);
		row2.add(txtTie);
		
		getContentPane().add(row1);
		getContentPane().add(panel);
		getContentPane().add(row2);
		getContentPane().add(playAgain);

		playAgain.addActionListener(tictac);
		getContentPane().add(row3);
		
		for (int x=0; x<=3; x++){
			for (int y=0; y<=3; y++){
				boxes[x][y].addActionListener(tictac);
			}
		}

		setVisible(true);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTac frame = new TicTac();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}