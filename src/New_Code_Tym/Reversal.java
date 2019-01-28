/**
 * 
 */
package New_Code_Tym;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author gopaljaiswal
 *
 */
public class Reversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Map<String, Integer> map1 = new HashMap<String, Integer>();
		int N = in.nextInt();

		for (int i = 0; i < N; i++) {
			String s = in.next();
			if (map1.containsKey(s)) {
				map1.put(s, map1.get(s) + 1);
			} else {
				map1.put(s, 1);
			}
		}

		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>(
				map1);

		System.out.println(map);
		int count = 0;
		for (Entry<String, Integer> p : map.entrySet()) {
			if (map.size() == 0) {
				break;
			}
			String key = p.getKey();
			Integer value = p.getValue();

			String revKey = reverse(key);
			Integer revValue = map.get(revKey);

			if (value == revValue) {
				count += value;
			} else if (value < revValue) {
				count += value;
			} else {
				count += revValue;
			}
			map.remove(key);
			map.remove(revKey);

		}

		System.out.println(count);
		in.close();
	}

	public static String reverse(String s) {
		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 += "" + s.charAt(i);
		}
		return s1;
	}

}
