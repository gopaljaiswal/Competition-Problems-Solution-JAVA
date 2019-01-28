import java.util.Scanner;

/**
 * 
 */

/**
 * @author gopaljaiswal
 *
 */
public class Breaking_the_Records {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();

		int maxUpt = 0;
		int minUpt = 1;

		int score = in.nextInt();
		int max = score;
		int min = score;
		for (int i = 1; i < N; i++) {
			int score1 = in.nextInt();
			if (score1 > max) {
				max = score1;
				maxUpt++;
			}
			if (score1 < min) {
				min = score1;
				minUpt++;
			}
		}

		System.out.println(maxUpt + " " + (minUpt - 1));
		in.close();

	}
}
