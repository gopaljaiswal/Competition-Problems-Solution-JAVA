//Q: https://practice.geeksforgeeks.org/problems/pairs-with-positive-negative-values/0

/**
 * 
 */
package Amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @author gopaljaiswal
 *
 */
public class Pair_with_pos_neg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			int N = in.nextInt();
			int[] A = new int[N];
			for (int j = 0; j < N; j++) {
				A[j] = in.nextInt();
			}
			Set<Integer> set = new HashSet<Integer>();
			List<Integer> list = new ArrayList<Integer>();

			for (int j = 0; j < A.length; j++) {
				int a = A[j];
				if (set.contains(a) == true || set.contains(-a)) {
					if (a < 0) {
						a = -a;
					}
					list.add(a);
				}
				set.add(a);
			}
			if (list.size() == 0) {
				System.out.println('0');
			} else {
				Collections.sort(list);
				print(list);
			}
		}
		in.close();
	}

	public static void print(List<Integer> list) {
		Iterator<Integer> it = list.iterator();
		int pp = 0;
		while (it.hasNext()) {
			int a = it.next();
			if (pp == list.size() - 1) {
				System.out.println(-a + " " + a);
			} else {
				System.out.print(-a + " " + a + " ");
			}
			pp++;
		}

	}
}
