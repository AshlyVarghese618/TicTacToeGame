package TicTacToe;

import java.util.ArrayList;

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
				{
					blockArray[0][0].setState(symbol);
					if (checkForWin()) {
						printBoard();
						System.out.println("Player "+symbol +" has won!");
						System.exit(0);
						//break;
					}

					if (isBoardFull()) {
						printBoard();
						System.out.println("It's a tie!");
						System.exit(0);
					}
				}
				else
					System.err.println("Enter an unoccupied block");
				break;
			case 2 :
				if(blockArray[0][1].getState().equals(null) || blockArray[0][1].getState().equals("EMPTY"))
				{
					blockArray[0][1].setState(symbol);
					if (checkForWin()) {
						printBoard();
						System.out.println("Player "+symbol +" has won!");
						System.exit(0);
					}

					if (isBoardFull()) {
						printBoard();
						System.out.println("It's a tie!");
						System.exit(0);
					}
				}
				else
					System.err.println("Enter an unoccupied block");
				break;
			case 3 :
				if(blockArray[0][2].getState().equals(null) || blockArray[0][2].getState().equals("EMPTY"))
				{
					blockArray[0][2].setState(symbol);
					if (checkForWin()) {
						printBoard();
						System.out.println("Player "+symbol +" has won!");
						System.exit(0);
					}

					if (isBoardFull()) {
						printBoard();
						System.out.println("It's a tie!");
						System.exit(0);
					}
				}
				else
					System.err.println("Enter an unoccupied block");
				break;
			case 4 :
				if(blockArray[1][0].getState().equals(null) || blockArray[1][0].getState().equals("EMPTY"))
				{
					blockArray[1][0].setState(symbol);
					if (checkForWin()) {
						printBoard();
						System.out.println("Player "+symbol +" has won!");
						System.exit(0);
					}

					if (isBoardFull()) {
						printBoard();
						System.out.println("It's a tie!");
						System.exit(0);
					}
				}
				else
					System.err.println("Enter an unoccupied block");
				break;
			case 5 :
				if(blockArray[1][1].getState().equals(null) || blockArray[1][1].getState().equals("EMPTY"))
				{
					blockArray[1][1].setState(symbol);
					if (checkForWin()) {
						printBoard();
						System.out.println("Player "+symbol +" has won!");
						System.exit(0);
					}

					if (isBoardFull()) {
						printBoard();
						System.out.println("It's a tie!");
						System.exit(0);
					}
				}
				else
					System.err.println("Enter an unoccupied block");
				break;
			case 6 :
				if(blockArray[1][2].getState().equals(null) || blockArray[1][2].getState().equals("EMPTY"))
				{
					blockArray[1][2].setState(symbol);
					if (checkForWin()) {
						printBoard();
						System.out.println("Player "+symbol +" has won!");
						System.exit(0);
					}

					if (isBoardFull()) {
						printBoard();
						System.out.println("It's a tie!");
						System.exit(0);
					}
				}
				else
					System.err.println("Enter an unoccupied block");
				break;
			case 7 :
				if(blockArray[2][0].getState().equals(null) || blockArray[2][0].getState().equals("EMPTY"))
				{
					blockArray[2][0].setState(symbol);
					if (checkForWin()) {
						printBoard();
						System.out.println("Player "+symbol +" has won!");
						System.exit(0);
					}

					if (isBoardFull()) {
						printBoard();
						System.out.println("It's a tie!");
						System.exit(0);
					}
				}
				else
					System.err.println("Enter an unoccupied block");
				break;
			case 8 :
				if(blockArray[2][1].getState().equals(null) || blockArray[2][1].getState().equals("EMPTY"))
				{
					blockArray[2][1].setState(symbol);
					if (checkForWin()) {
						printBoard();
						System.out.println("Player "+symbol +" has won!");
						System.exit(0);
					}

					if (isBoardFull()) {
						printBoard();
						System.out.println("It's a tie!");
						System.exit(0);
					}
				}
				else
					System.err.println("Enter an unoccupied block");
				break;
			case 9 :
				if(blockArray[2][2].getState().equals(null) || blockArray[2][2].getState().equals("EMPTY"))
				{
					blockArray[2][2].setState(symbol);
					if (checkForWin()) {
						printBoard();
						System.out.println("Player "+symbol +" has won!");
						System.exit(0);
					}

					if (isBoardFull()) {
						printBoard();
						System.out.println("It's a tie!");
						System.exit(0);
					}
				}
				else
					System.err.println("Enter an unoccupied block");
				break;
			default : System.out.println("Please enter a valid block");
		}
	}

	void printBoard() {
		System.out.println("/---|---|---\\");
		System.out.println("| " + (blockArray[0][0].getState().equals("EMPTY")?"1":blockArray[0][0].getState()) + " | " + 
				(blockArray[0][1].getState().equals("EMPTY")?"2":blockArray[0][1].getState()) + " | " 
				+ (blockArray[0][2].getState().equals("EMPTY")?"3":blockArray[0][2].getState()) + " |");
		System.out.println("|-----------|");
		System.out.println("| " + (blockArray[1][0].getState().equals("EMPTY")?"4":blockArray[1][0].getState()) + " | " +
				(blockArray[1][1].getState().equals("EMPTY")?"5":blockArray[1][1].getState()) + " | " + 
				(blockArray[1][2].getState().equals("EMPTY")?"6":blockArray[1][2].getState()) + " |");
		System.out.println("|-----------|");
		System.out.println("| " + (blockArray[2][0].getState().equals("EMPTY")?"7":blockArray[2][0].getState()) + " | " + 
				(blockArray[2][1].getState().equals("EMPTY")?"8":blockArray[2][1].getState()) + " | " + 
				(blockArray[2][2].getState().equals("EMPTY")?"9":blockArray[2][2].getState()) + " |");
		System.out.println("/---|---|---\\");
	}
	//checks whether a win-condition exists or not
	public boolean checkForWin() {
		//loops through rows checking if win-condition exists
		for (int r = 0; r < 3; r++) {
			if(blockArray[r][0].getState() != "EMPTY" ||blockArray[r][1].getState() != "EMPTY" || blockArray[r][2].getState() != "EMPTY" ) {
				if (blockArray[r][0].getState() == blockArray[r][1].getState() && blockArray[r][1].getState() == blockArray[r][2].getState())
				{
					return true;
				}
			}
		}
		//loops through columns checking if win-condition exists
		for (int c = 0; c < 3; c++) {
			if(blockArray[0][c].getState() != "EMPTY" ||blockArray[1][c].getState() != "EMPTY" || blockArray[2][c].getState() != "EMPTY" ) {
				if ((blockArray[0][c].getState() == blockArray[1][c].getState() && blockArray[1][c].getState()== blockArray[2][c].getState()) )
				{
					return true;
				}
			}
		}
		//checks diagonals for win-condition
		if(blockArray[0][0].getState() != "EMPTY" ||blockArray[1][1].getState() != "EMPTY" || blockArray[2][2].getState() != "EMPTY" ) {
			if ((blockArray[0][0].getState() == blockArray[1][1].getState() && blockArray[1][1].getState() == blockArray[2][2].getState() ))
			{
				return true;
			}
		}
		if(blockArray[0][2].getState() != "EMPTY" ||blockArray[1][1].getState() != "EMPTY" || blockArray[2][0].getState() != "EMPTY" ) {
			if ((blockArray[0][2].getState() == blockArray[1][1].getState() && blockArray[1][1].getState() == blockArray[2][0].getState()) )
			{
				return true;
			}
		}

		return false;
	}

	//checks whether the board is full or not
	public boolean isBoardFull() {
		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 3; c++) {
				if (blockArray[r][c].getState().equals("EMPTY")) {
					return false;
				}
			}
		}
		return true;
	}

	public ArrayList<Integer> getEmptyBlocks() {
		ArrayList<Integer> emptyBlocksList = new ArrayList<Integer>();
		int counter = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				counter++;
				if (blockArray[i][j].getState() == "EMPTY") {
					emptyBlocksList.add(counter);
				}
			}
		}
		return emptyBlocksList;
	}
}
