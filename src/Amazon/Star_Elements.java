//https://practice.geeksforgeeks.org/problems/start-elements/0
/**
 * 
 */
package Amazon;

import java.util.Scanner;

/**
 * @author gopaljaiswal
 *
 */
public class Star_Elements {

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
			getStarEle(A);
		}
		in.close();
	}

	public static void getStarEle(int[] A) {
		int star = A[A.length - 1];
		System.out.print(star + " ");
		for (int i = A.length - 2; i >= 0; i--) {
			if (A[i] < star) {
				break;
			} else {
				System.out.print(A[i] + " ");
			}
			star = A[i];
		}
	}

}
