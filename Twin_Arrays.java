import java.util.Scanner;

/**
 * 
 */

/**
 * @author gopaljaiswal
 *
 */
public class Twin_Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = in.nextInt();
		}
		for (int i = 0; i < N; i++) {
			B[i] = in.nextInt();
		}

		int A_first = Integer.MAX_VALUE;
		int A_second = Integer.MAX_VALUE;
		int A_first_index = 0;
		int A_second_index = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] < A_first) {
				A_second = A_first;
				A_first = A[i];
				A_first_index = i;
			} else if (A[i] < A_second && A[i] != A_first) {
				A_second = A[i];
				A_second_index = i;
			}
		}
		// System.out.println(A_first + " " + A_second + " " + A_first_index +
		// " "
		// + A_second_index);

		int B_first = Integer.MAX_VALUE;
		int B_second = Integer.MAX_VALUE;
		int B_first_index = 0;
		int B_second_index = 0;
		for (int i = 0; i < B.length; i++) {
			if (B[i] < B_first) {
				B_second = B_first;
				B_first = B[i];
				B_first_index = i;
			} else if (B[i] < B_second && B[i] != B_first) {
				B_second = B[i];
				B_second_index = i;
			}
		}
		// System.out.println(B_first + " " + B_second + " " + B_first_index +
		// " "
		// + B_second_index);

		if (A_first_index != B_first_index) {
			System.out.println(A_first + B_first);
		} else {
			System.out.println(Integer.min((A_first + B_second),
					(A_second + B_first)));
		}

		in.close();
	}
}
