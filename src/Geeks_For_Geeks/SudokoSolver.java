/**
 * 
 */
package Geeks_For_Geeks;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author gopaljaiswal
 *
 */

public class SudokoSolver {

	static int[][] A = new int[9][9];

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		while (t-- > 0) {
			String[] s = bf.readLine().split(" ");
			int i = 0;
			for (int j = 0; j < s.length; j++) {
				if (j % 9 == 0 && j != 0) {
					i++;
				}
				if (!s[j].isEmpty())
					A[i % 9][j % 9] = Integer.parseInt(s[j]);
			}

			sudoko();
			for (int i1 = 0; i1 < 9; i1++) {
				for (int j = 0; j < 9; j++) {
					System.out.print(A[i1][j] + " ");
				}
				 System.out.println();
			}
			System.out.println();
		}
		bf.close();
	}

	public static String isEmptyPlaceInSudoko(Integer row, Integer col) {
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

	public static Boolean isSafe(int row, int col, int num) {
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

		int i1 = row / 3;
		int j1 = col / 3;
		i1 = i1 * 3;
		j1 = j1 * 3;
		for (int i = i1; i < i1 + 3; i++) {
			for (int j = j1; j < j1 + 3; j++) {
				if (A[i][j] == num) {
					return false;
				}
			}
		}
		return true;
	}

	public static Boolean sudoko() {
		int row = 0, col = 0;
		String rowCol = isEmptyPlaceInSudoko(row, col);
		if (rowCol == null) {
			return true;
		}
		String[] ssss = rowCol.split(" ");
		row = Integer.parseInt(ssss[0]);
		col = Integer.parseInt(ssss[1]);

		for (int num = 1; num <= 9; num++) {

			if (isSafe(row, col, num)) {
				A[row][col] = num;
				if (sudoko()) {
					return true;
				}
				A[row][col] = 0;
			}
		}
		return false;
	}
}