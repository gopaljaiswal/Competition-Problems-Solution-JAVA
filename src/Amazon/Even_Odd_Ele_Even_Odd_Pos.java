//https://practice.geeksforgeeks.org/problems/even-and-odd-elements-at-even-and-odd-positions/0
/**
 * 
 */
package Amazon;

import java.util.Scanner;

/**
 * @author gopaljaiswal
 *
 */
public class Even_Odd_Ele_Even_Odd_Pos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			int N = in.nextInt();

			int[] A = new int[N];
			int even = 0;
			int odd = 1;

			for (int j = 0; j < N; j++) {

				int a = in.nextInt();
				if (a % 2 == 0 && even < N) {
					A[even += 2] = a;
				}
				if (a % 2 != 0 && odd < N) {
					A[odd += 2] = a;
				}
			}
			// System.out.println("Hello");
			for (int k = 0; k < N; k++) {
				System.out.println(A[k]);
			}

		}
		in.close();
	}
}
