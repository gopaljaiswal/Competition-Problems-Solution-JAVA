/**
 * 
 */
package Amazon;

import java.util.Scanner;

/**
 * @author gopaljaiswal
 *
 */
public class Sum_Lengths_of_Non_Overlapping_SubArrays {

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
			int K = in.nextInt();
			getCount(A, K);
		}

		in.close();
	}

	public static void getCount(int[] A, int K) {
		int ans = 0;
		boolean flag = false;
		int count = 0;
		for (int i = 0; i < A.length;) {
			flag = false;
			count = 0;

			while (i < A.length && A[i] <= K) {
				count++;
				if (A[i] == K) {
					flag = true;
				}
				i++;
			}

			if (flag == true) {
				ans += count;
			}

			while (i < A.length && A[i] > K) {
				i++;
			}
		}
		System.out.println(ans);
	}

}
