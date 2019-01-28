/**
 * 
 */
package spoj;

import java.io.PrintWriter;

/**
 * @author gopaljaiswal
 *
 */
public class BYTESM2 {
	private static Reader in;
	private static PrintWriter out;

	public static void main(String[] args) throws Exception {
		in = new Reader();
		out = new PrintWriter(System.out, true);
		int T = in.nextInt();
		for (int t = 0; t < T; t++) {
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
	}

	public static void getRes(int[][] A, int rows, int cols) {
		int[][] dp = new int[rows][cols];
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (i == 0) {
					dp[i][j] = A[i][j];
				} else if (j == 0) {
					dp[i][j] = A[i][j]
							+ getMax(dp[i - 1][j], dp[i - 1][j + 1], -1);
				} else if (j == cols - 1) {
					dp[i][j] = A[i][j]
							+ getMax(dp[i - 1][j - 1], dp[i - 1][j], -1);
				} else {
					dp[i][j] = A[i][j]
							+ getMax(dp[i - 1][j], dp[i - 1][j - 1],
									dp[i - 1][j + 1]);
				}

				if (max < dp[i][j]) {
					max = dp[i][j];
				}
			}
		}
		out.println(max);
	}

	public static int getMax(int a, int b, int c) {
		if (c == -1) {
			return a > b ? a : b;
		}
		int d = a > b ? a : b;
		return d > c ? d : c;
	}
}


