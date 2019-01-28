/**
 * 
 */
package spoj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author gopaljaiswal
 *
 */
public class STREETR {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		Integer n = Integer.parseInt(reader.readLine());

		Integer[] A = new Integer[n];
		A[0] = Integer.parseInt(reader.readLine());
		A[1] = Integer.parseInt(reader.readLine());

		int result = A[1] - A[0];
		for (int i = 2; i < n; i++) {
			A[i] = Integer.parseInt(reader.readLine());
			result = gcd(result, (A[i - 1] - A[i - 2]));
		}

		int counter = 0;
		for (int i = A[0]; i <= A[A.length - 1]; i += result) {
			counter++;
		}

		System.out.println(counter - A.length);
		reader.close();
	}

	public static int gcd(int a, int b) {
		if (a == 0) {
			return b;
		}
		return gcd(b % a, a);
	}

}
