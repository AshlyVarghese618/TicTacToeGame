package TicTacToe;

import java.util.Random;
import java.util.Scanner;

/**
 * game.java
 * Game class for managing the overall game
 *
 * @author Team13
 * @version 1.0
 * @since Oct 24, 2020
 */
public class game {
	Scanner s;
	board gameBoard = new board();
	player playerX;
	player playerO;

	public void start() {
		s = new Scanner(System.in);
		System.out.println("Enter Player 1 Name: ");
		String player1 = s.nextLine();
		int playerType1=0;
		System.out.println("Enter Player 1 type (1. Human 2. AI): ");
		while(!s.hasNextInt())
		{
			System.out.println("Please enter a number 1 or 2");
			s.next();
		}
		playerType1 = s.nextInt();
		System.out.println("Enter Player 2 Name: ");
		String player2 = s.next();
		int playerType2 = 0;
		System.out.println("Enter Player 2 type (1. Human 2. AI): ");
		while(!s.hasNextInt())
		{
			System.out.println("Please enter a number 1 or 2");
			s.next();
		}
		playerType2 = s.nextInt();
		if(playerType1==1 && playerType2==1) {
			playerX = new HumanPlayer("X",player1,gameBoard);
			playerO = new HumanPlayer("O",player2,gameBoard);
		}else if(playerType1==2 && playerType2==2) {
			playerX = new AIPlayer("X",player1,gameBoard);
			playerO = new AIPlayer("O",player2,gameBoard);
		}else if(playerType1==1 && playerType2==2) {
			playerX = new HumanPlayer("X",player1,gameBoard);
			playerO = new AIPlayer("O",player2,gameBoard);
		}else if(playerType1==2 && playerType2==1) {
			playerX = new AIPlayer("O",player2,gameBoard);
			playerO = new HumanPlayer("X",player1,gameBoard);
		}
		int toss = tossCoin();
		turns(toss==1 ? "X" : "O");
	}

	public int tossCoin() {
		Random r = new Random();
		return(r.nextInt(2));
	}

	public void turns(String turn) {
		int i = 0;
		do {
			if(turn == "X") {
				if(makeMoves(playerX)!="X")
					turn="O";
			}else {
				if(makeMoves(playerO)!="O")
					turn="X";
			}

			i++;

		}while(i<=9);
	}

	public String makeMoves(player player) {
		gameBoard.printBoard();
		return player.play()?"":player.getSymbol();
	}
}
