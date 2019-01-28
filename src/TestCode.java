import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 
 */

/**
 * @author gopaljaiswal
 *
 */
public class TestCode {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		Map<Integer, String> map = new HashMap<Integer, String>();

		for (int i = 0; i < N; i++) {
			int count7 = 0;
			int count4 = 0;

			String str = in.next();
			Integer price = in.nextInt();

			while (price != 0) {
				int r = price % 10;
				if (r == 7) {
					count7++;
				} else if (r == 4) {
					count4++;
				}
				price = price / 10;
			}

			if (count4 == count7 && count4 != 0) {
				map.put(price, str);
			}
		}
		printOutput(map);
		in.close();
	}

	public static void printOutput(Map<Integer, String> map) {
		if (map.isEmpty()) {
			System.out.println("-1");
		} else {
			int minPr = Integer.MAX_VALUE;
			String minStr = new String();
			for (Map.Entry<Integer, String> m : map.entrySet()) {
				if (m.getKey() < minPr) {
					minPr = m.getKey();
					minStr = m.getValue();
				}
			}
			System.out.println(minStr);
		}
	}
}
