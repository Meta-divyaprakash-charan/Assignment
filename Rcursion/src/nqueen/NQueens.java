package nqueen;
/***
 * 
 * @author Divyaprakash
 *
 */

public class NQueens {

	/*
	 * Specification
	 * -This function is a helper function for nQueen function It is basically check
	 *  that the queen that is to be placed is safe or not.
	 * 
	 * @param board a chess board
	 * 
	 * @param dimensionOfMatrix size of board
	 * 
	 * @return true when queen is in safe place
	 */
	private static boolean isSafe(int[][] board, int row, int column, int dimensionOfMatrix) {
		
		/* check row on the left side */
		for (int i = 0; i < column; i++) {
			if (board[row][i] == 1)
				return false;
		}

		/* check upper diagonal on the left side */
		for (int i = row, j = column; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 1)
				return false;
		}

		/* check lower diagonal on left side */
		for (int i = row, j = column; i < dimensionOfMatrix && j >= 0; i++, j--) {
			if (board[i][j] == 1)
				return false;
		}

		return true;
	}

	/*
	 * Specification
	 * -find a solution of n queen problem
	 * 
	 * @param board a chess board
	 * @param dimensionOfMatrix size of board
	 * 
	 * @return true if a solution exist else false
	 */
	public boolean nQueen(int[][] board, int column, int dimensionOfMatrix) {
		if (column >= dimensionOfMatrix) // if all queen are placed
			return true;

		for (int row = 0; row < dimensionOfMatrix; row++) {

			if (isSafe(board, row, column, dimensionOfMatrix)) {
				board[row][column] = 1;

				if (nQueen(board, column + 1, dimensionOfMatrix) == true) // to place rest of the queen
					return true;
				/*
				 * if placing queens does not find a solution then we need to remove queen form
				 * this position.
				 */
				board[row][column] = 0;
			}
		}

		return false;
	}
}
