/**
 * 
 */
package New_Code_Tym;

/**
 * @author gopaljaiswal
 *
 */
public class Print_All_Prime_Nos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int N = 315;
		printPrimeFactors(N);
	}

	public static void printPrimeFactors(int N) {
		if (N % 2 == 0) {
			System.out.println("2" + " ");
			N = N / 2;
		}

		for (int i = 3; i < Math.sqrt(N); i += 2) {

			while (N % i == 0) {
				System.out.println(i + " ");
				N = N / i;
			}
		}

		if (N > 2) {
			System.out.println(N);
		}
	}

}
