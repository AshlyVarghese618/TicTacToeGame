package TicTacToe;

/**
 * player.java
 * Abstract class with responsibilities for a player
 *
 * @author Team13
 * @version 1.0
 * @since Oct 24, 2020
 */
public abstract class player {
	private String symbol;
	private String name;
	private board board;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public board getBoard() {
		return board;
	}

	public void setBoard(board board) {
		this.board = board;
	}

	public player(String symbol, String name, board board) {
		this.symbol = symbol;
		this.name = name;
		this.board = board;
	}

	public abstract boolean play();
}
