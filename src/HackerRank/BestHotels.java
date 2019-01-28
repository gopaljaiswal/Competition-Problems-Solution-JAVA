/**
 * 
 */
package HackerRank;

import java.util.*;

/**
 * @author Gopal Jaiswal
 *
 *         Software Development Engineer
 */

public class BestHotels {

	/**
	 * @param args
	 */
	static class Pair1 implements Comparable<Pair1> {
		int id, val;

		public Pair1(int id, int val) {
			this.id = id;
			this.val = val;
		}

		public int compareTo(Pair1 p) {
			return -this.id + p.id;
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		while (T-- > 0) {
			int id = in.nextInt();
			int val = in.nextInt();
			if (map.containsKey(val)) {
				int tmpId = map.get(val);
				if (tmpId > id) {
					map.put(val, id);
				}
			} else {
				map.put(val, id);
			}
		}

		List<Pair1> pairs = new ArrayList<Pair1>();
		for (Map.Entry<Integer, Integer> p : map.entrySet()) {
			int k = p.getKey();
			int v = p.getValue();
			Pair1 pair = new Pair1(k, v);

			pairs.add(pair);
		}

		Collections.sort(pairs);
		Set<Integer> s = new HashSet<Integer>();

		for (Pair1 p1 : pairs) {
			if (!s.contains(p1.val)) {
				System.out.println(p1.val);
				s.add(p1.val);
			}
		}

		in.close();
	}
}
