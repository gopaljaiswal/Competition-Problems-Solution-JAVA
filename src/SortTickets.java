import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */

/**
 * @author gopaljaiswal
 *
 */
public class SortTickets {

	public static void main(String[] args) {
		String[] str = { "Goa Banglore", "Delhi Mumbai", "Banglore Chennai",
				"Mumbai Goa" };
		System.out.println(sort_tickets(str));
	}

	// Complete the sort_tickets function below.
	static String sort_tickets(String[] tickets) {
		int n = tickets.length;

		List<String> leftList = new ArrayList<String>();
		List<String> rightList = new ArrayList<String>();
		Map<String, Integer> dict = new HashMap<String, Integer>();

		for (int j = 0; j < n; j++) {
			String[] str = tickets[j].split(" ");
			leftList.add(str[0]);
			rightList.add(str[1]);
			dict.put(str[0], j);
		}

		int firstEleInd = 0;
		for (int j = 0; j < n; j++) {
			if (!rightList.contains(leftList.get(j))) {
				firstEleInd = j;
				break;
			}
		}

		// System.out.println(firstEleInd);
		// System.out.println(leftList);
		// System.out.println(rightList);

		return getRes(dict, firstEleInd, leftList, rightList);
	}

	public static String getRes(Map<String, Integer> dict, int firstEleInd,
			List<String> leftList, List<String> rightList) {
		int src = firstEleInd;
		String result = leftList.get(src) + " " + rightList.get(src);
		while (true) {
			if (!dict.containsKey(rightList.get(src))) {
				break;
			} else {
				src = dict.get(rightList.get(src));
				// result += " " + leftList.get(src) + " " + rightList.get(src);
				result += " " + rightList.get(src);
				// print leftList[src], rightList[src]
				// return result

			}
		}

		return result;
	}
}
