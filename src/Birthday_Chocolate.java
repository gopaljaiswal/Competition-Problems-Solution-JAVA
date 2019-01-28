import java.util.Scanner;

/**
 * 
 */

/**
 * @author gopaljaiswal
 *
 */
public class Birthday_Chocolate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = in.nextInt();
		}
		int day = in.nextInt();
		int mon = in.nextInt();

		int count = 0;
		for (int i = 0; i < N - mon + 1; i++) {
			int sum = 0;
			for (int j = i; j < (i + mon); j++) {
				sum += A[j];
			}
			if (sum == day) {
				count++;
			}
		}
		System.out.println(count);
		in.close();
	}

}
