//https://practice.geeksforgeeks.org/problems/edit-distance/0
/**
 * 
 */
package Amazon;

import java.util.Scanner;

/**
 * @author gopaljaiswal
 *
 */
public class Edit_Distance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			int len1 = in.nextInt();
			int len2 = in.nextInt();
			String str1 = in.next();
			String str2 = in.next();
			getEditDist(str1, str2, len1, len2);
		}
		in.close();
	}

	public static int min(int x, int y, int z) {
		if (x <= y && x <= z)
			return x;
		if (y <= x && y <= z)
			return y;
		else
			return z;
	}

	public static void getEditDist(String str1, String str2, int len1, int len2) {

		int[][] dp = new int[len1 + 1][len2 + 1];

		for (int i = 0; i <= len1; i++) {
			for (int j = 0; j <= len2; j++) {
				if (i == 0) {
					dp[i][j] = j;
				} else if (j == 0) {
					dp[i][j] = i;
				} else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1];
				} else {
					dp[i][j] = 1 + min(dp[i - 1][j], dp[i - 1][j - 1],
							dp[i][j - 1]);
				}
			}
		}
		System.out.println(dp[len1][len2]);
	}
}
