/**
 * 
 */
package Amazon;

import java.util.Scanner;

/**
 * @author gopaljaiswal
 *
 */
public class Find_The_Highest_Number {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			int N = in.nextInt();
			int[] A = new int[N];
			for (int j = 0; j < N; j++) {
				A[j] = in.nextInt();
			}
			getHighest(A);
		}
		in.close();
	}

	public static void getHighest(int[] A) {
		int max = Integer.MIN_VALUE;
		for (int i = 1; i < A.length; i++) {
			if (A[i] < A[i - 1]) {
				max = A[i - 1];
				break;
			}
		}
		System.out.println(max);
	}

}
