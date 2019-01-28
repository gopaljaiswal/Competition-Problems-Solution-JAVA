/**
 * 
 */
package New_Code_Tym;

/**
 * @author gopaljaiswal
 *
 */
public class Print_All_Divisors_Nos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int N = 10;
		getAllDivisors(N);
	}

	public static void getAllDivisors(int N) {
		for (int i = 1; i <= Math.sqrt(N) + 1; i++) {
			if (N % i == 0) {
				if (N % i == i) {
					System.out.print(i + " ");
				} else {
					if (i != 1) {
						System.out.print(i + " " + N / i + " ");
					} else {
						System.out.print(i + " ");
					}
				}
			}
		}

	}

}
