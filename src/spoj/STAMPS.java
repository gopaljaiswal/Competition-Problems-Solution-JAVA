/**
 * 
 */
package spoj;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author gopaljaiswal
 *
 */
public class STAMPS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int total = in.nextInt();
			int no = in.nextInt();
			int[] A = new int[no];
			for (int j = 0; j < no; j++) {
				A[j] = in.nextInt();
			}
			getOut(i, total, A);
		}
		in.close();
	}

	public static int getOut(int testNo, int total, int[] A) {
		Arrays.sort(A);
		boolean flag = false;
		int count = 0;
		long sum = 0L;
		for (int i = A.length - 1; i >= 0; i--) {
			sum += A[i];
			count++;
			if (sum >= total) {
				flag = true;
				System.out.println("Scenario #" + (testNo+1)+":");
				System.out.println(count + "\n");
				break;
			}
		}
		if (flag == false) {
			System.out.println("Scenario #" + (testNo+1)+":");
			System.out.println("impossible" + "\n");
		}
		return count;
	}

}
