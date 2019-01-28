/**
 * 
 */
package spoj;

import java.io.PrintWriter;

/**
 * @author gopaljaiswal
 *
 */
public class MISERMAN {

	private static Reader in;
	private static PrintWriter out;

	public static void main(String[] args) throws Exception {
		in = new Reader();
		out = new PrintWriter(System.out, true);
		int rows = in.nextInt();
		int cols = in.nextInt();
		int[][] A = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				A[i][j] = in.nextInt();

			}
		}
		getRes(A, rows, cols);
	}

	public static void getRes(int[][] A, int rows, int cols) {
		int[][] dp = new int[rows][cols];
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (i == 0) {
					dp[i][j] = A[i][j];
				} else if (j == 0) {
					dp[i][j] = A[i][j]
							+ getMin(dp[i - 1][j], dp[i - 1][j + 1], -1);
				} else if (j == cols - 1) {
					dp[i][j] = A[i][j]
							+ getMin(dp[i - 1][j - 1], dp[i - 1][j], -1);
				} else {
					dp[i][j] = A[i][j]
							+ getMin(dp[i - 1][j], dp[i - 1][j - 1],
									dp[i - 1][j + 1]);
				}
			}
		}

		for (int j = 0; j < cols; j++) {
			if (dp[rows - 1][j] < min) {
				min = dp[rows - 1][j];
			}
		}
		out.println(min);
	}

	public static int getMin(int a, int b, int c) {
		if (c == -1) {
			return a < b ? a : b;
		}
		int d = a < b ? a : b;
		return d < c ? d : c;
	}

}
