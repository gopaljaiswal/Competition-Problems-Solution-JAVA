/**
 * 
 */
package New_Code_Tym;

/**
 * @author gopaljaiswal
 *
 */

import java.util.Scanner;
import java.util.Arrays;

class Ideone {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int T = in.nextInt();

		while (T-- > 0) {

			int N = in.nextInt();
			int[] A = new int[51];

			int M = 0;
			int sum = 0;

			for (int i = 0; i < N; i++) {
				int a = in.nextInt();
				if (a > M) {
					M = a;
				}
				A[a] += 1;
			}

			for (int i = M; i > 0; i--) {
				sum += (A[i] * i);

				int prev = i - 1;
				if (A[i] > 0 && prev >= 1 && A[prev] >= 1) {
					A[prev] = A[prev] - 1;
				}
			}
			System.out.println(sum);
		}
		in.close();
	}
}