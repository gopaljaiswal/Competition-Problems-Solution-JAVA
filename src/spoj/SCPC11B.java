/**
 * 
 */
package spoj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author gopaljaiswal
 *
 */
public class SCPC11B {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		while (true) {
			int n = Integer.parseInt(reader.readLine());
			if (n == 0) {
				break;
			} else {
				int[] A = new int[n];
				for (int i = 0; i < n; i++) {
					A[i] = Integer.parseInt(reader.readLine());
				}
				getRes(A);
			}
		}
	}

	public static void getRes(int[] A) {
		Boolean flag = true;
		Arrays.sort(A);
		int diff = Integer.MIN_VALUE;
		for (int i = 1; i < A.length; i++) {
			diff = A[i] - A[i - 1];
			if (diff > 200) {
				flag = false;
				break;
			}
			if (i == A.length - 1) {
				diff = 1422 - A[A.length - 1];
				if (2 * diff > 200) {
					flag = false;
				}
			}
		}
		if (flag == true) {
			System.out.println("POSSIBLE");
		} else if (flag == false) {
			System.out.println("IMPOSSIBLE");
		}
	}
}
