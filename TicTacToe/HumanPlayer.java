package TicTacToe;

import java.util.Scanner;

/**
 * HumanPlayer.java
 * Derived HumanPlayer class
 *
 * @author Team13
 * @version 1.0
 * @since Oct 24, 2020
 */
public class HumanPlayer extends player{

	public HumanPlayer(String symbol, String name, board board) {
		super(symbol, name, board);
	}

	@Override
	public boolean play() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the cell you want to play " + this.getName() + " with symbol " + this.getSymbol());
		int input = s.nextInt();
		if(input > 0 && input < 10) {
			getBoard().makeMove(input, getSymbol());
			return true;
		}
		else {
			System.err.println("Enter a valid block");
			return false;
		}

	}

}
