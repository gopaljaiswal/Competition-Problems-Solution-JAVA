/**
 * 
 */
package New_Code_Tym;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author gopaljaiswal
 *
 */
public class Sock_Merchant {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		Map<Integer, Integer> inMap = new LinkedHashMap<Integer, Integer>();

		for (int i = 0; i < N; i++) {
			int value = in.nextInt();
			if (!inMap.containsKey(value)) {
				inMap.put(value, 1);
			} else {
				inMap.put(value, inMap.get(value) + 1);
			}
		}

		Integer count = 0;
		for (Integer key : inMap.keySet()) {
			// System.out.println(key + "    " + inMap.get(key));

			count += (Integer) inMap.get(key) / 2;

		}

		System.out.println(count);
		in.close();
	}

}
