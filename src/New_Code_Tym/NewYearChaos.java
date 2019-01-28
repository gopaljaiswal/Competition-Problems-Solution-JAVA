/**
 * 
 */
package New_Code_Tym;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author gopaljaiswal
 *
 */
public class NewYearChaos {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		for (int i = 0; i < t; i++) {
			int N = Integer.parseInt(bf.readLine());
			int[] A = new int[N];

			int j = 0;
			for (String s : bf.readLine().split(" ")) {
				A[j++] = Integer.parseInt(s);
			}
			getAns(A);
		}
		bf.close();
	}

	// getAns
	public static void getAns(int[] A) {
		for (int i = 0; i < A.length; i++) {
			if ((A[i] - 1) - i > 2) {
				System.out.println("Too chaotic");
				return;
			}
		}

		long totalSwaps = 0;
		for (int i = 0; i < A.length; i++) {
			boolean swapped = false;
			for (int j = 0; j < A.length - 1; j++) {
				if (A[j] > A[j + 1]) {
					int temp = A[j + 1];
					A[j + 1] = A[j];
					A[j] = temp;

					swapped = true;
					totalSwaps++;
				}
			}
			if (swapped == false) {
				System.out.println(totalSwaps);
				break;
			}
		}

	}

	// getArr
	public static int[] getArr(int N) {
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = i + 1;
		}
		return A;
	}

	public static HashMap<Integer, Integer> getIdxMap(int N) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < N; i++) {
			map.put(i + 1, i);
		}
		return map;
	}

}
