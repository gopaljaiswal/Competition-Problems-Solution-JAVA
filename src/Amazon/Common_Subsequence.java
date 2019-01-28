//https://practice.geeksforgeeks.org/problems/common-subsequence/0
/**
 * 
 */
package Amazon;

import java.util.Scanner;

/**
 * @author gopaljaiswal
 *
 */
public class Common_Subsequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			String a = in.next();
			String b = in.next();
			System.out.println(lcs(a.toCharArray(), b.toCharArray(),
					a.length(), b.length()) > 0 ? "1" : "0");
		}
		in.close();
	}

	public static int lcs(char[] X, char[] Y, int m, int n) {
		int L[][] = new int[m + 1][n + 1];

		String str = "";
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0) {
					L[i][j] = 0;
				} else if (X[i - 1] == Y[j - 1]) {
					str += X[i - 1];
					L[i][j] = L[i - 1][j - 1] + 1;
				} else {
					L[i][j] = max(L[i - 1][j], L[i][j - 1]);
				}
			}
		}
		System.out.println(str);
		return L[m][n];
	}

	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}

}
