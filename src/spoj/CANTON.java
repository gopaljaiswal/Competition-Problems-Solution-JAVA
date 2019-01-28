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
public class CANTON {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		Integer N = Integer.parseInt(reader.readLine());
		for (int i = 0; i < N; i++) {
			Integer a = Integer.parseInt(reader.readLine());
			getAns(a);
		}
		reader.close();
	}

	public static void getAns(Integer a) {
		Integer sum = 0;
		for (int i = 1; true; i++) {
			sum += i;
			if (sum >= a) {
				int diff = sum - a;
				int deno = i - diff;
				int nomi = diff + 1;
				//System.out.println("nomi :" + nomi + "  deno:" + deno);
				if (i % 2 != 0) {
					System.out
							.println("TERM " + a + " IS " + nomi + "/" + deno);
				} else {
					System.out
							.println("TERM " + a + " IS " + deno + "/" + nomi);

				}
				break;
			}
		}
	}
}
