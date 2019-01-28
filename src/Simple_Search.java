import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author gopaljaiswal
 *
 */
public class Simple_Search {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		int t = in.nextInt();
		for (int t=in.nextInt(); t-- > 0;) {
			int N = in.nextInt();
			int Q = in.nextInt();
			Double[] A = new Double[N];
			for (int i = 0; i < N; i++) {
				A[i] = in.nextDouble();
			}
			Arrays.sort(A);
			//System.out.println(bst(A, 0.000000));
			while (Q-- > 0) {
				System.out.println(N -bst(A, in.nextDouble()) - 1);
			}
		}
		in.close();
	}

	public static int bst(Double[] A, Double key) {
		int low = 0, high = A.length - 1;
		int resIdx = -1;
		while (low <= high) {
			int mid = (low + high) >> 1;
			if (A[mid].equals(key)) {
				resIdx = mid;
				break;
			} else if (A[mid] < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return resIdx;
	}

}
