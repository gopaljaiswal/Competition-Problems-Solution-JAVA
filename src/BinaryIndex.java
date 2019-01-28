import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 
 */

/**
 * @author gopaljaiswal
 *
 */
public class BinaryIndex {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] inpStr = bf.readLine().split(" ");

		int n = Integer.parseInt(inpStr[0]);
		int m = Integer.parseInt(inpStr[1]);

		int minIdx = Integer.MAX_VALUE;
		int maxEle = Integer.MIN_VALUE;

		String[] A = new String[n];
		for (int i = 0; i < n; i++) {
			String ele = bf.readLine();
			A[i] = ele;
		}

		Arrays.sort(A);
		for (String s : A) {
			System.out.println(s + " ");
		}

		bf.close();
	}
}
