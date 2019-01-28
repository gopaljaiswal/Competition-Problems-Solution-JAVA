/**
 * 
 */
package Amazon;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author gopaljaiswal
 *
 */
public class Second_Most_Repeated_String_Sequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			int N = in.nextInt();
			String[] A = new String[N];
			for (int j = 0; j < A.length; j++) {
				A[j] = in.next();
			}
			getRes(A);
		}
		in.close();
	}

	public static void getRes(String[] A) {

		Map<String, Integer> hs = new HashMap<String, Integer>();
		for (int i = 0; i < A.length; i++) {
			if (hs.containsKey(A[i])) {
				hs.put(A[i], hs.get(A[i]) + 1);
			} else {
				hs.put(A[i], 1);
			}
		}

		int firstMax = 0;
		String firstStr = null;
		int secMax = 0;
		String secStr = null;
		for (Entry<String, Integer> entry : hs.entrySet()) {
			int value = entry.getValue();
			String key = entry.getKey();
			if (value > firstMax) {
				secMax = firstMax;
				secStr = firstStr;

				firstMax = value;
				firstStr = key;
			} else if (value > secMax && value != firstMax) {
				secMax = value;
				secStr = key;
			}
		}

		System.out.println(secStr);
	}

}
