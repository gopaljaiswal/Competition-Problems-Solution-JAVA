/**
 * 
 */
package New_Code_Tym;

import java.util.Scanner;

/**
 * @author gopaljaiswal
 *
 */
public class MaDiff {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = in.nextInt();
		}

		int maxDiff = 0;
		for (int i = 1; i < N; i++) {
			for (int j = 0; j < i; j++) {

				if (A[i] > A[j]) {
					int diff = A[i] - A[j];
					if (diff >= maxDiff) {
						maxDiff = diff;
					}
				}
			}
		}
		System.out.println(maxDiff);
		in.close();
	}
}

// public static int countDuplicate(List<Integer> numbers) {
// Map<Integer, Integer> map = new HashMap<Integer, Integer>();
// for (Integer n : numbers) {
// if (map.containsKey(n)) {
// map.put(n, map.get(n) + 1);
// } else {
// map.put(n, 1);
// }
// }
//
// int count = 0;
// for (Entry<Integer, Integer> entry : map.entrySet()) {
// if (entry.getValue() > 1) {
// count++;
// }
// }
// // System.out.println(count);
// return count;
// }
//
// }

// 7
// 2 3 10 2 4 8 1
