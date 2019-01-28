/**
 * 
 */
package HackerRank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author gopaljaiswal
 *
 */

public class Sudoku {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int[][] A = new int[9][9];
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					A[i][j] = in.nextInt();
				}
			}

			sudoko(A);
			for (int i1 = 0; i1 < 9; i1++) {
				for (int j = 0; j < 9; j++) {
					System.out.print(A[i1][j] + " ");
				}
				System.out.println();
			}
		}
		in.close();
	}

	public static String isEmptyPlaceInSudoko(int[][] A, int row, int col) {
		for (int i1 = 0; i1 < 9; i1++) {
			for (int j = 0; j < 9; j++) {
				if (A[i1][j] == 0) {
					row = i1;
					col = j;
					return row + " " + col;
				}
			}
		}
		return null;
	}

	public static Boolean isSafe(int[][] A, int row, int col, int num) {
		for (int i = 0; i < 9; i++) {
			if (A[i][col] == num) {
				return false;
			}
		}
		for (int j = 0; j < 9; j++) {
			if (A[row][j] == num) {
				return false;
			}
		}

		// int i1 = row / 3;
		// int j1 = col / 3;
		// i1 = i1 * 3;
		// j1 = j1 * 3;
		// for (int i = i1; i < i1 + 3; i++) {
		// for (int j = j1; j < j1 + 3; j++) {
		// if (A[i][j] == num) {
		// return false;
		// }
		// }
		// }

		int sqrt = (int) Math.sqrt(9);
		int boxRowStart = row - row % sqrt;
		int boxColStart = col - col % sqrt;

		for (int r = boxRowStart; r < boxRowStart + sqrt; r++) {
			for (int d = boxColStart; d < boxColStart + sqrt; d++) {
				if (A[r][d] == num) {
					return false;
				}
			}
		}
		return true;
	}

	public static Boolean sudoko(int[][] A) {
		int row = 0, col = 0;
		String rowCol = isEmptyPlaceInSudoko(A, row, col);
		if (rowCol == null) {
			return true;
		}
		String[] ssss = rowCol.split(" ");
		row = Integer.parseInt(ssss[0]);
		col = Integer.parseInt(ssss[1]);

		for (int num = 1; num <= 9; num++) {

			if (isSafe(A, row, col, num)) {
				A[row][col] = num;
				if (sudoko(A)) {
					return true;
				}
				A[row][col] = 0;
			}
		}
		return false;
	}
}
