package TicTacToe;

import java.util.List;
import java.util.Random;

public class AIPlayer extends player{

	public AIPlayer(String symbol, String name, board board) {
		super(symbol, name, board);
	}

	@Override
	public boolean play() {
		Random random = new Random();
		board playBoard = getBoard();
		List<Integer> emptyBlocks = playBoard.getEmptyBlocks();
		int randomNum = emptyBlocks.get(random.nextInt(emptyBlocks.size()));
		System.out.println("AI Player " + getName() + " turn");
		System.out.println("Random move at " + randomNum + " with symbol " + getSymbol());
		getBoard().makeMove(randomNum, getSymbol());
		return true;
	}
}
