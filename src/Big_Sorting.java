import java.util.Scanner;

/**
 * 
 */

/**
 * @author gopaljaiswal
 *
 */
public class Big_Sorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String[] list = new String[N];
		for (int i = 0; i < N; i++) {
			list[i] = in.next();
		}
		long[] A = new long[N];
		for (int i = 0; i < list.length; i++) {
			String str = list[i];
			long sum = 0;
			for (int j = 0; j < str.length(); j++) {
				sum += Integer.parseInt(str.charAt(j) + "");
			}
			A[i] = sum;
		}

	}

}
