package TicTacToe;

public class block {
	String value = "EMPTY";

	public void setState(String symbol) {
		this.value = symbol;
	}

	public String getState() {
		return value;
	}
}
