package TicTacToe;

public class board {
	block[][] blockArray = new block[3][3];
	
	public board() {
		for(int i=0;i<3;i++) {
			for(int j=0; j<3;j++)
				blockArray[i][j] = new block();
		}
		
		
		
	}
	
	public void checkInterState() {
		
	}
	
	public void makeMove(int value, String symbol) {
		
		
		switch (value) {
		case 1 : 
			if(blockArray[0][0].getState().equals(null) || blockArray[0][0].getState().equals("EMPTY"))
				blockArray[0][0].setState(symbol);
			else
				System.err.println("Enter an unoccupied block");
			break;
		case 2 : 
			if(blockArray[0][1].getState().equals(null) || blockArray[0][1].getState().equals("EMPTY"))
				blockArray[0][1].setState(symbol);
			else
				System.err.println("Enter an unoccupied block");
			break;
		case 3 : 
			if(blockArray[0][2].getState().equals(null) || blockArray[0][2].getState().equals("EMPTY"))
				blockArray[0][2].setState(symbol);
			else
				System.err.println("Enter an unoccupied block");
			break;
		case 4 : 
			if(blockArray[1][0].getState().equals(null) || blockArray[1][0].getState().equals("EMPTY"))
				blockArray[1][0].setState(symbol);
			else
				System.err.println("Enter an unoccupied block");
			break;
		case 5 : 
			if(blockArray[1][1].getState().equals(null) || blockArray[1][1].getState().equals("EMPTY"))
				blockArray[1][1].setState(symbol);
			else
				System.err.println("Enter an unoccupied block");
			break;
		case 6 : 
			if(blockArray[1][2].getState().equals(null) || blockArray[1][2].getState().equals("EMPTY"))
				blockArray[1][2].setState(symbol);
			else
				System.err.println("Enter an unoccupied block");
			break;
		case 7 : 
			if(blockArray[2][0].getState().equals(null) || blockArray[2][0].getState().equals("EMPTY"))
				blockArray[2][0].setState(symbol);
			else
				System.err.println("Enter an unoccupied block");
			break;
		case 8 : 
			if(blockArray[2][1].getState().equals(null) || blockArray[2][1].getState().equals("EMPTY"))
				blockArray[2][1].setState(symbol);
			else
				System.err.println("Enter an unoccupied block");
			break;
		case 9 : 
			if(blockArray[2][2].getState().equals(null) || blockArray[2][2].getState().equals("EMPTY"))
				blockArray[2][2].setState(symbol);
			else
				System.err.println("Enter an unoccupied block");
			break;
		default : System.out.println("Please enter a valid block");
	}
	}
	
	void printBoard() {
		System.out.println("/---|---|---\\");
		System.out.println("| " + blockArray[0][0].getState() + " | " + blockArray[0][1].getState() + " | " + blockArray[0][2].getState() + " |");
		System.out.println("|-----------|");
		System.out.println("| " + blockArray[1][0].getState() + " | " + blockArray[1][1].getState() + " | " + blockArray[1][2].getState() + " |");
		System.out.println("|-----------|");
		System.out.println("| " + blockArray[2][0].getState() + " | " + blockArray[2][1].getState() + " | " + blockArray[2][2].getState() + " |");
		System.out.println("/---|---|---\\");
	}

}
