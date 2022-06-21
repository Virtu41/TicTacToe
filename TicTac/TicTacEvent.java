/**
 * The backend of the GUI TicTac.java
 * 
 * modified     20220515
 * date         20220509
 * @filename    TicTacEvent.java
 * @author      Oscar Lam 
 * @version     1.0
 * @see         Unit 2 activity 5
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TicTacEvent implements ActionListener {
	TicTac gui;
	ImageIcon a = new ImageIcon("x.png");
	ImageIcon b = new ImageIcon("o.png");
	ImageIcon back = new ImageIcon("back.png");
	int clicks = 0;
	int game = 0;
	int xWin = 0;
	int yWin = 0;
	int tie = 0;
	int[][] check = new int[4][4];

	public TicTacEvent (TicTac in){
		gui = in;
		for (int row=0; row<=3; row++){
			for (int col=0; col<=3; col++){
				check[row][col]=0;
			}
		}
	}

	public void actionPerformed (ActionEvent event) {
		String command = event.getActionCommand();

		if (command.equals("Play Again")) {
			playAgain();
		}
		if (command.equals("1")) {
			b1();
		}
		if (command.equals("2")) {
			b2();
		}
		if (command.equals("3")) {
			b3();
		}
		if (command.equals("4")) {
			b4();
		}
		if (command.equals("5")) {
			b5();
		}
		if (command.equals("6")) {
			b6();
		}
		if (command.equals("7")) {
			b7();
		}
		if (command.equals("8")) {
			b8();
		}
		if (command.equals("9")) {
			b9();
		}
		if (command.equals("10")) {
			b10();
		}
		if (command.equals("11")) {
			b11();
		}
		if (command.equals("12")) {
			b12();
		}
		if (command.equals("13")) {
			b13();
		}
		if (command.equals("14")) {
			b14();
		}
		if (command.equals("15")) {
			b15();
		}
		if (command.equals("16")) {
			b16();
		}
	}

	void b1() {
		clicks = clicks + 1;
		if ((clicks%2)==1){
			gui.boxes[0][0].setIcon(a);
			check[0][0] = 1;
		} else {
			gui.boxes[0][0].setIcon(b);
			check[0][0] = 2;
		}
		gui.boxes[0][0].setEnabled(false);
		winner();
	}
	void b2() {
		clicks = clicks + 1;
		if ((clicks%2)==1){
			gui.boxes[0][1].setIcon(a);
			check[0][1] = 1;
		} else {
			gui.boxes[0][1].setIcon(b);
			check[0][1] = 2;
		}
		gui.boxes[0][1].setEnabled(false);
		winner();
	}
	void b3() {
		clicks = clicks + 1;
		if ((clicks%2)==1){
			gui.boxes[0][2].setIcon(a);
			check[0][2] = 1;
		} else {
			gui.boxes[0][2].setIcon(b);
			check[0][2] = 2;
		}
		gui.boxes[0][2].setEnabled(false);
		winner();
	}
	void b4() {
		clicks = clicks + 1;
		if ((clicks%2)==1){
			gui.boxes[0][3].setIcon(a);
			check[0][3] = 1;
		} else {
			gui.boxes[0][3].setIcon(b);
			check[0][3] = 2;
		}
		gui.boxes[0][3].setEnabled(false);
		winner();
	}
	void b5() {
		clicks = clicks + 1;
		if ((clicks%2)==1){
			gui.boxes[1][0].setIcon(a);
			check[1][0] = 1;
		} else {
			gui.boxes[1][0].setIcon(b);
			check[1][0] = 2;
		}
		gui.boxes[1][0].setEnabled(false);
		winner();
	}
	void b6() {
		clicks = clicks + 1;
		if ((clicks%2)==1){
			gui.boxes[1][1].setIcon(a);
			check[1][1] = 1;
		} else {
			gui.boxes[1][1].setIcon(b);
			check[1][1] = 2;
		}
		gui.boxes[1][1].setEnabled(false);
		winner();
	}
	void b7() {
		clicks = clicks + 1;
		if ((clicks%2)==1){
			gui.boxes[1][2].setIcon(a);
			check[1][2] = 1;
		} else {
			gui.boxes[1][2].setIcon(b);
			check[1][2] = 2;
		}
		gui.boxes[1][2].setEnabled(false);
		winner();
	}
	void b8() {
		clicks = clicks + 1;
		if ((clicks%2)==1){
			gui.boxes[1][3].setIcon(a);
			check[1][3] = 1;
		} else {
			gui.boxes[1][3].setIcon(b);
			check[1][3] = 2;
		}
		gui.boxes[1][3].setEnabled(false);
		winner();
	}
	void b9() {
		clicks = clicks + 1;
		if ((clicks%2)==1){
			gui.boxes[2][0].setIcon(a);
			check[2][0] = 1;
		} else {
			gui.boxes[2][0].setIcon(b);
			check[2][0] = 2;
		}
		gui.boxes[2][0].setEnabled(false);
		winner();
	}
	void b10() {
		clicks = clicks + 1;
		if ((clicks%2)==1){
			gui.boxes[2][1].setIcon(a);
			check[2][1] = 1;
		} else {
			gui.boxes[2][1].setIcon(b);
			check[2][1] = 2;
		}
		gui.boxes[2][1].setEnabled(false);
		winner();
	}
	void b11() {
		clicks = clicks + 1;
		if ((clicks%2)==1){
			gui.boxes[2][2].setIcon(a);
			check[2][2] = 1;
		} else {
			gui.boxes[2][2].setIcon(b);
			check[2][2] = 2;
		}
		gui.boxes[2][2].setEnabled(false);
		winner();
	}
	void b12() {
		clicks = clicks + 1;
		if ((clicks%2)==1){
			gui.boxes[2][3].setIcon(a);
			check[2][3]= 1;
		} else {
			gui.boxes[2][3].setIcon(b);
			check[2][3] = 2;
		}
		gui.boxes[2][3].setEnabled(false);
		winner();
	}
	void b13() {
		clicks = clicks + 1;
		if ((clicks%2)==1){
			gui.boxes[3][0].setIcon(a);
			check[3][0] = 1;
		} else {
			gui.boxes[3][0].setIcon(b);
			check[3][0] = 2;
		}
		gui.boxes[3][0].setEnabled(false);
		winner();
	}
	void b14() {
		clicks = clicks + 1;
		if ((clicks%2)==1){
			gui.boxes[3][1].setIcon(a);
			check[3][1] = 1;
		} else {
			gui.boxes[3][1].setIcon(b);
			check[3][1] = 2;
		}
		gui.boxes[3][1].setEnabled(false);
		winner();
	}
	void b15() {
		clicks = clicks + 1;
		if ((clicks%2)==1){
			gui.boxes[3][2].setIcon(a);
			check[3][2] = 1;
		} else {
			gui.boxes[3][2].setIcon(b);
			check[3][2] = 2;
		}
		gui.boxes[3][2].setEnabled(false);
		winner();
	}
	void b16() {
		clicks = clicks + 1;
		if ((clicks%2)==1){
			gui.boxes[3][3].setIcon(a);
			check[3][3] = 1;
		} else {
			gui.boxes[3][3].setIcon(b);
			check[3][3] = 2;
		}
		gui.boxes[3][3].setEnabled(false);
		winner();
	}

	void winner() {

		if(clicks<=16) {
			
			/** Check rows for winner */
			for (int x=0; x<=3; x++){
				if ((check[x][0]==check[x][1])&&(check[x][0]==check[x][2])&&(check[x][0]==check[x][3])) {
					if (check[x][0]==1) {
						JOptionPane.showMessageDialog(null, "X is the winner");
						xWin++;
						gui.txtXWins.setText("X Wins: "+xWin+"");
					} else if (check[x][0]==2){
						JOptionPane.showMessageDialog(null, "Y is the winner");
						yWin++;
						gui.txtYWins.setText("Y Wins: "+yWin+"");
					}
				}
			}

			/** Check columns for winner */
			for (int x=0; x<=3; x++){
				if ((check[0][x]==check[1][x])&&(check[0][x]==check[2][x])&&(check[0][x]==check[3][x])) {
					if (check[0][x]==1) {
						JOptionPane.showMessageDialog(null, "X is the winner");
						xWin++;
						gui.txtXWins.setText("X Wins: "+xWin+"");
					} else if (check[0][x]==2) {
						JOptionPane.showMessageDialog(null, "Y is the winner");
						yWin++;
						gui.txtYWins.setText("Y Wins: "+yWin+"");
					}
				}
			}

			/** Check diagonals for winner */
			if ((check[0][0]==check[1][1])&&(check[1][1]==check[2][2])&&(check[2][2]==check[3][3])){
				if (check[1][1]==1) {
					JOptionPane.showMessageDialog(null, "X is the winner");
					xWin++;
					gui.txtXWins.setText("X Wins: "+xWin+"");
				} else if (check[1][1]==2) {
					JOptionPane.showMessageDialog(null, "Y is the winner");
					yWin++;
					gui.txtYWins.setText("Y Wins: "+yWin+"");
				}

			}
			else if((check[0][3]==check[1][2])&&(check[1][2]==check[2][1])&&(check[2][1]==check[3][0])) {
				if (check[1][2]==1) {
					JOptionPane.showMessageDialog(null, "X is the winner");
					xWin++;
					gui.txtXWins.setText("X Wins: "+xWin+"");
				} else if (check[1][2]==2) {
					JOptionPane.showMessageDialog(null, "Y is the winner");
					yWin++;
					gui.txtYWins.setText("Y Wins: "+yWin+"");
				}
			}
		}

		/** Checks if the game is a tie */
		if(clicks == 16 && xWin+yWin+tie == game){
			JOptionPane.showMessageDialog(null, "The game is a tie");
			clicks = 0;
			tie++;
			gui.txtTie.setText("Tie: "+tie+"");
			game++;
			gui.txtGames.setText("Games played: "+game);
			gui.playAgain.setEnabled(true);
		}
		if(xWin+yWin+tie == game+1) {
			gui.playAgain.setEnabled(true);
			for(int i = 0; i<4; i++) {
				for(int j = 0; j<4; j++) {
					gui.boxes[i][j].setEnabled(false);
				}
			}
			game++;
			clicks = 0;
		}
	}

	void playAgain() {
		clicks = 0;
		for (int row=0; row<=3; row++){
			for (int col=0; col<=3; col++){
				check[row][col]=0;
				gui.boxes[row][col].setIcon(back);
				gui.boxes[row][col].setEnabled(true);
			}
		}
		gui.txtGames.setText("Games played: "+game);
		gui.playAgain.setEnabled(false);
	}
}