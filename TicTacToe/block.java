package TicTacToe;

public class block implements Global{
	String value = EMPTY_BLOCK_SYMBOL;

	public void setState(String symbol) {
		this.value = symbol;
	}

	public String getState() {
		return value;
	}
}
