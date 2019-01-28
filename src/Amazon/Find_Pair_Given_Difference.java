/**
 * 
 */
package Amazon;

import java.util.Scanner;

/**
 * @author gopaljaiswal
 *
 */
public class Find_Pair_Given_Difference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			int N = in.nextInt();
			int num = in.nextInt();
			int[] A = new int[N];
			for (int j = 0; j < N; j++) {
				A[j] = in.nextInt();
			}
			getRes(A, num);
		}

		in.close();
	}

	public static void getRes(int[] A, int num) {
		int res = -1;
		for (int i = 0; i < A.length; i++) {
			int p = A[i];
			for (int j = 1; j < A.length; j++) {
				if (Math.abs(p - A[j]) == num) {
					res = 1;
					break;
				}
			}
		}
		if (res == 1) {
			System.out.println("1");
		} else {
			System.out.println("-1");
		}
	}

}
