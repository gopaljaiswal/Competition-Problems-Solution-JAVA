/**
 * 
 */
package New_Code_Tym;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author gopaljaiswal
 *
 */
class Tourist25 {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {

		// File file = new File("/Users/gopaljaiswal/Desktop/input.txt");
		// Scanner in = new Scanner(file);

		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int t = 1; t <= T; t++) {
			int n = in.nextInt();
			int k = in.nextInt();
			long v = in.nextLong();
			String[] cities = new String[n];
			for (int i = 0; i < n; i++) {
				cities[i] = in.next();
			}
			System.out.print("Case #" + t + ": ");
			getRes(n, cities, k, v);
			System.out.println();
		}
		in.close();
	}

	public static void getRes(int n, String[] cities, int k, long v) {
		int idx = (int) (k * (v - 1) % n) % n;

		int endSub = k;
		ArrayList<Integer> ll = new ArrayList<Integer>();

		for (int i = idx; i < n; i++) {
			if (endSub == 0) {
				break;
			}
			ll.add(i);
			endSub--;
		}

		for (int i = 0; (endSub != 0) && (i <= idx); i++) {
			if (endSub == 0) {
				break;
			}
			ll.add(i);
			endSub--;
		}

		Collections.sort(ll);
		for (Integer i : ll) {
			System.out.print(cities[i] + " ");
		}
	}
}
