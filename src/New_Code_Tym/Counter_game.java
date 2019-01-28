/**
 * 
 */
package New_Code_Tym;

import java.util.Scanner;

/**
 * @author gopaljaiswal
 *
 */
public class Counter_game {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();

		// System.out.println(getHighPow(T));

		for (int i = 0; i < T; i++) {
			long N = in.nextInt();
			printRes(N);
		}
		in.close();
	}

	public static void printRes(long N) {
		String name = "Louise";
		long p = N;
		while (true) {
			if (p == 1) {
				break;
			}
			if ((p & (p - 1)) == 0) {
				p = p >> 1;
			} else {
				p = p - getHighPow(p);
				name = "Richard";
			}
		}
		System.out.println(name);

	}

	public static long getHighPow(long N) {
		long result = 0;
		for (long i = N; i > 0; i--) {
			long and = i & (i - 1);
			if (and == 0) {
				result = i;
				break;
			}
		}
		return result;
	}

}
