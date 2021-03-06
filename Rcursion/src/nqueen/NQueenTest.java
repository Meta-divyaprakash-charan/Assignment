package nqueen;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class NQueenTest{
	NQueens queen = new NQueens();

	@Test
	public void testNQueen() {
		int board[][] = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
		queen.nQueen(board, 0, 4);
		int expected[][] = { { 0, 0, 1, 0 }, { 1, 0, 0, 0 }, { 0, 0, 0, 1 }, { 0, 1, 0, 0 } };
		assertArrayEquals(expected, board);
	}

	@Test
	public void test2NQueen() {
		int board[][] = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0 } };
		queen.nQueen(board, 0, 5);
		int expected[][] = { { 1, 0, 0, 0, 0 }, { 0, 0, 0, 1, 0 }, { 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 1 },
				{ 0, 0, 1, 0, 0 } };
		assertArrayEquals(expected, board);
	}

}