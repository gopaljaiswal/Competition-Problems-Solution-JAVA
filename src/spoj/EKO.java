/**
 * 
 */
package spoj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author gopaljaiswal
 *
 */
public class EKO {

	/**
	 * @param args
	 */
	final static int MAX = (int) 1e6;
	static long[] psum = new long[MAX + 5];

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		String[] str = reader.readLine().split(" ");
		Integer N = Integer.parseInt(str[0]);
		long M = Long.parseLong(str[1]);
		long[] A = new long[N];

		String[] input = reader.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			A[i] = Long.parseLong(input[i]);
		}
		Arrays.sort(A);

		for (int i = 0; i < N; i++)
			psum[i + 1] = psum[i] + A[i];

//		for (long it : A) {
//			System.out.print(it + " ");
//		}
//		System.out.println();
//
//		for (int i = 0; i < A.length + 1; i++) {
//			System.out.print(psum[i] + " ");
//		}
//		System.out.println();

		// System.out.println(getCut(A, 10));
		System.out.println(bsItr(A, M));
		reader.close();
	}

	// bst
	public static long bsItr(long[] A, long no) {
		long ans = 0;
		long l = 0;
		long r = A[A.length - 1];

		while (l <= r) {
			long mid = (r + l) >> 1;
			long result = getCut(A, mid);
			System.out.println(l + " " + r + " " + mid + " " + result);
			if (result >= no) {
				l = mid + 1;
				ans = Long.max(ans, mid);
			} else {
				r = mid - 1;
			}
		}
		return ans;
	}

	public static long getCut(long A[], long a) {
		long sum = 0;
		int start = upperBound(A, a);
		sum = getSum(A.length, start) - (a * (A.length - start));
//		System.out.println("UPPER_BOUND: " + a + " is " + start + " sum is " + sum + " " + getSum(A.length, start));

		return sum;
	}

	public static long getSum(int to, int from) {
		return psum[to] - psum[from];
	}

	public static int upperBound(long A[], long limit) {
		int low = 0, high = A.length - 1;
		int res = A.length;
		while (low <= high) {
			int mid = (low + high) >> 1;
			if (A[mid] > limit) {
				res = Math.min(mid, res);
				high = mid - 1;
			} else
				low = mid + 1;
		}
		return res;
	}

}
