/**
 * 
 */
package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author gopaljaiswal
 *
 */

public class SortingComparator {

	public static class Pair {
		String name;
		Integer data;

		public Pair(String name, Integer data) {
			this.name = name;
			this.data = data;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		Pair[] pairs = new Pair[N];

		for (int i = 0; i < N; i++) {
			String s = in.next();
			Integer data = in.nextInt();
			Pair e = new Pair(s, data);
			pairs[i] = e;
		}

		Arrays.sort(pairs, new Comparator<Pair>() {

			@Override
			public int compare(Pair a, Pair b) {
				if (a.data != b.data) {
					return b.data - a.data;
				}
				return a.name.compareTo(b.name);
			}
		});

		// Arrays.sort(pairs, new Comparator<Pair>() {
		//
		// @Override
		// public int compare(Pair o1, Pair o2) {
		// return o1.name.compareTo(o2.name);
		// }
		// });

		for (Pair p : pairs) {
			System.out.println(p.name + " " + p.data);
		}
		in.close();
	}
}
