package TicTacToe;

public class AIPlayer extends player{

	public AIPlayer(String symbol, String name, board board) {
		super(symbol, name, board);
	}

	@Override
	public boolean play(int input) {
		if(input>0 && input<10) {
			getBoard().makeMove(input, getSymbol());
			return true;
		}
		else {
			System.err.println("Enter a valid block");
			return false;
		}
	}

}
