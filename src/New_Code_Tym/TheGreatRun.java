/**
 * 
 */
package New_Code_Tym;

import java.util.Scanner;

/**
 * @author gopaljaiswal
 *
 */
public class TheGreatRun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int t = 0;
		while (t < T) {
			int N = in.nextInt();
			int K = in.nextInt();
			int[] A = new int[N];
			for (int i = 0; i < N; i++) {
				A[i] = in.nextInt();
			}
			System.out.println(getRes(A, K));
			t++;
		}
		in.close();
	}

	public static int getRes(int[] A, int k) {
		int res = 0;
		for (int i = 0; i < k; i++)
			res += A[i];

		int curr_sum = res;
		for (int i = k; i < A.length; i++) {
			curr_sum += A[i] - A[i - k];
			res = Math.max(res, curr_sum);
		}

		return res;
	}
}
