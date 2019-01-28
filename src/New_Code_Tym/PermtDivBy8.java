/**
 * 
 */
package New_Code_Tym;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gopaljaiswal
 *
 */
public class PermtDivBy8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] A = { "61", "75" };
		for (String s : checkDivisibility(A)) {
			System.out.println(s);
		}
	}

	static String[] checkDivisibility(String[] arr) {
		int[] A = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			A[i] = Integer.parseInt(arr[i]);
		}
		List<List<Integer>> ll = permute(A);

		for (int i = 0; i < ll.size(); i++) {
			for (Integer l : ll.get(i)) {
				System.out.println(l);
//				if (l1 % 8 == 0) {
//					arr[i] = "YES";
//					break;
//				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (!arr[i].equals("YES")) {
				arr[i] = "NO";
			}
		}
		return arr;
	}

	public static List<List<Integer>> permute(int[] numbers) {
		List<List<Integer>> permutations = new ArrayList<List<Integer>>();
		permutations.add(new ArrayList<Integer>());

		for (int i = 0; i < numbers.length; i++) {
			// create a temporary container to hold the new permutations
			// while we iterate over the old ones
			List<List<Integer>> current = new ArrayList<List<Integer>>();
			for (List<Integer> permutation : permutations) {
				for (int j = 0, n = permutation.size() + 1; j < n; j++) {
					List<Integer> temp = new ArrayList<Integer>(permutation);
					temp.add(j, numbers[i]);
					current.add(temp);
				}
			}
			permutations = new ArrayList<List<Integer>>(current);
		}

		return permutations;
	}
}
