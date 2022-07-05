package nqueen;

import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		NQueens queen = new NQueens();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the board: ");
		int dimentionOfMatrix = sc.nextInt();
		
		int[][] board = new int[dimentionOfMatrix][dimentionOfMatrix];
		
		for (int i = 0; i < dimentionOfMatrix; i++)
			Arrays.fill(board[i], 0);
		
		if (queen.nQueen(board, 0, dimentionOfMatrix)) {
			for (int i = 0; i < dimentionOfMatrix; i++) {
				for (int j = 0; j < dimentionOfMatrix; j++) {
					System.out.print(board[i][j]);
				}
				System.out.println();
			}
		} else{
			System.out.println("Solution does not exist.");
		}
		sc.close();
	}

}