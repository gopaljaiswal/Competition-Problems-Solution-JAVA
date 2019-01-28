/**
 * 
 */
package New_Code_Tym;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author gopaljaiswal
 *
 */
public class KillThemWithYourSuccess {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int t = 0;
		while (t < T) {
			int N = in.nextInt();
			int[] A = new int[N];
			for (int i = 0; i < N; i++) {
				A[i] = in.nextInt();
			}
			Arrays.sort(A);
			double value = (A[N - 1] + A[N - 2]) / 2;
			if (N > 2) {
				System.out.printf("%.6f\n", getRes(A, 0));
			} else {
				System.out.printf("%.6f\n", value);
			}
			t++;
		}
		in.close();
	}

	// public static double getRes(int[] A, Double value, int N, int i) {
	// for (int j = i; j >= 0; j--) {
	// value = (value + A[j]) / 2;
	// }
	// return value;
	// }

	public static double getRes(int[] A, int i) {
		if (i == A.length - 1) {
			return A[i];
		}
		return (getRes(A, i + 1) + A[i]) / 2;
	}

}
