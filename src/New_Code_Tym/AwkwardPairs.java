/**
 * 
 */
package New_Code_Tym;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author gopaljaiswal
 *
 */
public class AwkwardPairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			long L = in.nextInt();
			long R = in.nextInt();
			int k = 0;
			ArrayList<Long> list = new ArrayList<Long>();
			for (long j = L; j <= R; j++) {
				list.add(j);
			}

			System.out.println(numOfPairs(list, list.size()));
		}

		in.close();
	}

	public static long gcd(long a, long b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	static boolean coprime(long a, long b) {
		return (gcd(a, b) == 1);
	}

	static long numOfPairs(ArrayList<Long> list, int n) {

		long count = 0;
		for (int i = 0; i < n - 1; i++)
			for (int j = i + 1; j < n; j++)
				if (coprime(getSum(list.get(i)), getSum(list.get(j)))) {
					count++;
					// count = count % 1000000007;
				}
		return count % 1000000007;
	}

	static long getSum(long n) {
		long sum = 0;

		while (n != 0) {
			sum = sum + n % 10;
			n = n / 10;
		}

		return sum;
	}

}
