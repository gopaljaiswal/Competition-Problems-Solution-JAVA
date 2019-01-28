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
public class FACTORIAL {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		Integer n = Integer.parseInt(reader.readLine());
		Integer fact = 1;

		// System.out.println(factRec(fact, n));
		System.out.println(factDp(fact, n));

		reader.close();
	}

	// Recursion
	public static int factRec(Integer fact, int n) {
		if (n == 0) {
			return fact;
		}
		return fact = n * factRec(fact, n - 1);
	}

	// DP
	public static int factDp(Integer fact, int n) {
		for (int i = 2; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
