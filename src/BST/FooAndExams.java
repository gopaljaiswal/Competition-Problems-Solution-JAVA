/**
 * 
 */
package BST;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author gopaljaiswal
 *
 */
public class FooAndExams {

	/**
	 * @param args
	 */
	final static double esp = 1e-9;
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		Integer N = Integer.parseInt(reader.readLine());
		for (int i = 0; i < N; i++) {
			String[] str = reader.readLine().split(" ");
			float[] A = new float[4];
			A[0] = Float.parseFloat(str[0]);
			A[1] = Float.parseFloat(str[1]);
			A[2] = Float.parseFloat(str[2]);
			A[3] = Float.parseFloat(str[3]);
			float K = Float.parseFloat(str[4]);
			System.out.println(getRes(A, K));
		}
	}

	public static long getRes(float[] A, float item) {
		long l = 0;
		long h = (new Float(item)).longValue();
		long res = 0;
		while (l <= h) {
			long mid = (l + h) / 2;
			if (getStress(A, mid) - item > esp) {
				h = mid - 1;
			} else {
				res = mid;
				l = mid + 1;
			}
		}

		return res;
	}

	public static float getStress(float[] A, float t) {
		float sum = 0;
		// String str = "9999999999999999999";
		// try {
		sum += A[0] * t * t * t + A[1] * t * t + A[2] * t + A[3];
		// } catch (Exception e) {
		// sum += Long.parseLong(str);
		// }
		return sum;
	}
}
