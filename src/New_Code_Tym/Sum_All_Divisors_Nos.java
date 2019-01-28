/**
 * 
 */
package New_Code_Tym;

/**
 * @author gopaljaiswal
 *
 */
public class Sum_All_Divisors_Nos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int N = 10;
		sumDivisors(N);
	}

	public static void sumDivisors(int N) {
		long sum = 0;
		for (int i = 1; i <= Math.sqrt(N) + 1; i++) {
			if (N % i == 0) {
				if (N % i == i) {
					sum += i;
				} else {
					if (i == 1) {
						sum += i;
					} else {
						sum += i + N / i;
					}
				}
			}
		}
		System.out.println(sum);
	}

}
