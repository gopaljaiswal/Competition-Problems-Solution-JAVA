/**
 * 
 */
package Amazon;

import java.util.Scanner;

/**
 * @author gopaljaiswal
 *
 */
public class Prime_number_of_set_bits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			int L = in.nextInt();
			int R = in.nextInt();
			getPrimeCount(L, R);
		}

		in.close();
	}

	public static void getPrimeCount(int L, int R) {
		int finalCount = 0;
		for (int i = L; i <= R; i++) {
			int count = 0;
			String str = Integer.toBinaryString(i);
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == '1') {
					count++;
				}
			}
			if (isPrime(count)) {
				finalCount++;
			}
		}
		System.out.println(finalCount);

	}

	public static boolean isPrime(int N) {
		boolean flag = true;
		if(N==1){
			return false;
		}
		for (int i = 2; i <= N / 2; i++) {
			if (N % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

}
