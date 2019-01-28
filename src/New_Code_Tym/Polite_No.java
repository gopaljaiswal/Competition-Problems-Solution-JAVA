/**
 * 
 */
package New_Code_Tym;

/**
 * @author gopaljaiswal
 *
 */
public class Polite_No {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int N = 90;
		getPoliteNo(N);
	}

	public static void getPoliteNo(int N) {
		int result = 1;
		while (N % 2 == 0) {
			N = N / 2;
		}

		for (int i = 3; i*i < N; i += 2) {
			int div = 0;
			while (N % i == 0) {
				N = N / i;
				div++;
			}
			result = result * (div + 1);
		}
		if (N > 2) {
			result = result * 2;
		}
		System.out.println(result - 1);
	}

}
