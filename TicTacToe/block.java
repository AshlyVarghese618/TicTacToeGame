package TicTacToe;

/**
 * block.java
 * Block class for maintaining a playable cell
 *
 * @author Team13
 * @version 1.0
 * @since Oct 24, 2020
 */
public class block implements Global{
	String value = EMPTY_BLOCK_SYMBOL;

	public void setState(String symbol) {
		this.value = symbol;
	}

	public String getState() {
		return value;
	}
}
