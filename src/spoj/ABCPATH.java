/**
 * 
 */
package spoj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author gopaljaiswal
 *
 */
public class ABCPATH {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = 1;
		while (true) {
			String inStr = bf.readLine();
			String[] rc = inStr.split(" ");
			int rows = Integer.parseInt(rc[0]);
			int cols = Integer.parseInt(rc[1]);
			if (rows == 0 && cols == 0) {
				break;
			}
			char[][] A = new char[rows][cols];
			for (int i = 0; i < rows; i++) {
				String s = bf.readLine();
				for (int j = 0; j < s.length(); j++) {
					A[i][j] = s.charAt(j);
				}
			}
			getRes(A, rows, cols, t);
			t++;
		}
	}

	public static void getRes(char[][] A, int rows, int cols, int t) {

		int i = 0, j = 0;
		long finalCount = Integer.MIN_VALUE;
		for (int x = i; x < rows; x++) {
			int count = 0;
			for (int y = j; y < cols; y++) {
				if ((int) A[x][y] == 65) {
					i = x;
					j = y;
					count = 1;
					System.out.println(i + "    " + j);
				}

				while (true) {
					boolean flag = false;
					char a = A[i][j];
					a++;

					if (i > 0 && a == A[i - 1][j]) {
						i = i - 1;
						flag = true;

					} else if (i > 0 && j > 0 && a == A[i - 1][j - 1]) {
						i = i - 1;
						j = j - 1;
						flag = true;

					} else if (i > 0 && (j + 1) < cols && a == A[i - 1][j + 1]) {
						i = i - 1;
						j = j + 1;
						flag = true;

					} else if (j > 0 && a == A[i][j - 1]) {
						j = j - 1;
						flag = true;

					} else if ((j + 1) < cols && a == A[i][j + 1]) {
						j = j + 1;
						flag = true;
					} else if ((i + 1) < rows && (j > 0)
							&& a == A[i + 1][j - 1]) {
						i = i + 1;
						j = j - 1;
						flag = true;
					} else if ((i + 1) < rows && a == A[i + 1][j]) {
						i = i + 1;
						flag = true;

					} else if ((i + 1) < rows && (j + 1) < cols
							&& a == A[i + 1][j + 1]) {
						i = i + 1;
						j = j + 1;
						flag = true;
					}

					// System.out.println(i + "  " + j + " " + a);
					if (flag == false) {
						// System.out.println("Case " + t + ": " + count);
						break;
					}
					count++;
				}

				// System.out.println(count);
				if (count > finalCount) {
					finalCount = count;
				}

			}
		}
		System.out.println("Case " + t + ": " + finalCount);
	}
}
