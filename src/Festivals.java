import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author gopaljaiswal
 *
 */

class Festivals {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			HashMap<String, List<Long>> pairs = new HashMap<String, List<Long>>();
			for (int i = 0; i < n; i++) {
				String s = in.next();
				long cost = in.nextLong();

				if (pairs.containsKey(s)) {
					List<Long> list = pairs.get(s);
					list.add(cost);

					pairs.put(s, list);
				} else {
					List<Long> list = new ArrayList<Long>();
					list.add(cost);

					pairs.put(s, list);
				}
			}
			getRes(pairs);
		}
		in.close();
	}

	public static void getRes(HashMap<String, List<Long>> pairs) {
		Iterator it = pairs.entrySet().iterator();

		long max = Integer.MIN_VALUE;
		String ans = null;

		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			String key = (String) pair.getKey();
			List<Long> values = (List<Long>) pair.getValue();

			Collections.sort(values);
			int counter = 0;
			long sum = 0;
			for (int i = values.size() - 1; i >= 0; i--) {
				if (counter == 3) {
					break;
				}
				counter++;
				sum += values.get(i);
			}
			if (sum > max) {
				max = sum;
				ans = key;
			} else if (sum == max) {
				if (ans.compareTo(key) > 0) {
					ans = key;
				}
			}
		}
		System.out.println(ans + " " + max);

	}
}
