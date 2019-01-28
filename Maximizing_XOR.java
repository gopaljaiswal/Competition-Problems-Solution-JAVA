import java.util.Scanner;

/**
 * 
 */

/**
 * @author gopaljaiswal
 *
 */
public class Maximizing_XOR {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int L = in.nextInt();
		int R = in.nextInt();
		int max = Integer.MIN_VALUE;
		for (int i = L; i <= R; i++) {
			for (int j = i; j <= R; j++) {
				int xor = i ^ j;
				if (xor > max) {
					max = xor;
				}
			}

		}
		System.out.println(max);

		in.close();

	}

}
