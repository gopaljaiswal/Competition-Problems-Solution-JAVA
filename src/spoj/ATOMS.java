/**
 * 
 */
package spoj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author gopaljaiswal
 *
 */
public class ATOMS {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		Integer p = Integer.parseInt(reader.readLine());
		for (int i = 0; i < p; i++) {
			String[] str = reader.readLine().split(" ");
			float N = Float.parseFloat(str[0]);
			float K = Float.parseFloat(str[1]);
			float M = Float.parseFloat(str[2]);
			getRes(N, K, M);
		}
		reader.close();
	}

	public static void getRes(float N, float K, float M) {
		int t = 0;
		if (M > N) {
			float b = (float) Math.log((float) M / N);
			float a = (float) Math.log(K);
			t = (int) (b / a);
		}

		System.out.println(t);

	}

}
