import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author gopaljaiswal
 *
 */
public class Small_unsorted_subarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = in.nextInt();
		}
		int[] B = new int[N];
		for (int i = 0; i < N; i++) {
			B[i] = A[i];
		}
		Arrays.sort(A);
		int min = 0;
		int max = 0;

		for (int i = 0; i < N; i++) {
			if (A[i] != B[i]) {
				min = i;
				break;
			}
		}
		for (int i = N - 1; i >= 0; i--) {
			if (A[i] != B[i]) {
				max = i;
				break;
			}
		}
		for (int i = min; i < max+1; i++) {
			System.out.print(B[i] + " ");
		}

		// for (int i = 0; i < N; i++) {
		// System.out.println(A[i] + "          ");
		// }
		in.close();

	}
}
// 11
// 10 12 20 30 25 40 32 31 35 50 60
// 13
// 1 2 4 7 10 11 7 12 3 7 16 18 19
