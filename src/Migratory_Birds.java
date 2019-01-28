import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author gopaljaiswal
 *
 */
public class Migratory_Birds {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < N; i++) {
			int value = in.nextInt();
			if (map.containsKey(value)) {
				map.put(value, (map.get(value) + 1));
			} else {
				map.put(value, 1);
			}
		}

		Integer resKey = null;
		Integer MAX = Integer.MIN_VALUE;
		for (Integer key : map.keySet()) {
			if (map.get(key) > MAX) {
				MAX = map.get(key);
				resKey = key;
			//	System.out.println(resKey + "   " + MAX);
			}
		}

		System.out.println(MAX);
//
//		for (Integer key : map.keySet()) {
//			System.out.println(key + "  " + map.get(key));
//		}

		in.close();
	}

}
