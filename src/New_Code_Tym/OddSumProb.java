/**
 * 
 */
package New_Code_Tym;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author gopaljaiswal
 *
 */
public class OddSumProb {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		Integer n = Integer.parseInt(reader.readLine());
		int[] A = new int[n];
		String[] str = reader.readLine().split(" ");
		int i = 0;
		for (String s : str) {
			A[i++] = Integer.parseInt(s);
		}

		Integer Q = Integer.parseInt(reader.readLine());
		for (int j = 0; j < Q; j++) {
			String[] str1 = reader.readLine().split(" ");
			getRes(A, Integer.parseInt(str1[0]) - 1,
					Integer.parseInt(str1[1]) - 1);
		}
		reader.close();
	}

	public static void getRes(int[] A, int L, int R) {
		long sum = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = L; i <= R; i++) {
			if (!map.containsKey(A[i])) {
				sum += A[i];
				map.put(A[i], 1);
			} else {
				map.put(A[i], map.get(A[i]) + 1);
				int val = map.get(A[i]);
				if (val % 2 == 0) {
					sum = sum - ((val - 1) * A[i]);
				} else {
					sum = sum + (val * A[i]);
				}
			}
			//System.out.println(A[i] + "  " + sum);
		}
		System.out.println(sum);
	}
}
