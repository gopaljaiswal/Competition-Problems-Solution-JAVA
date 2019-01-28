/**
 * 
 */
package BST;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author gopaljaiswal
 *
 */
public class RankIt {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		Integer N = Integer.parseInt(reader.readLine());
		String[] str = reader.readLine().split(" ");

		int[] A = new int[N];
		int j = 0;
		for (String s : str) {
			A[j++] = Integer.parseInt(s);
		}
		Arrays.sort(A);

		int q = Integer.parseInt(reader.readLine());
		for (int i = 0; i < q; i++) {
			System.out.println(getRes(A, Integer.parseInt(reader.readLine())));
		}
	}

	public static int getRes(int[] A, int item) {
		int l = 0;
		int h = A.length - 1;
		while (l <= h) {
			int mid = l + (h - l) / 2;
			if (A[mid] == item) {
				return (mid + 1);
			} else if (A[mid] < item) {
				l = mid + 1;
			} else {
				h = mid - 1;
			}
		}
		return -1;
	}
}
