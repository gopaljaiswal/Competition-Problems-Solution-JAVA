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
public class GCD2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		while (t-- > 0) {
			String inputStr[] = bf.readLine().split(" ");
			Integer a = Integer.parseInt(inputStr[0]);
			String b = inputStr[1];
			System.out.println(getGCD(a, mod(b, a)));
		}
		bf.close();
	}

	public static Integer getGCD(int a, int b) {
		if (b == 0) {
			return a;
		}
		return getGCD(b, a % b);
	}

	public static Integer mod(String b, int a) {
		int r = 0;
		for (int i = 0; i < b.length(); i++) {
			r = (r * 10 + ((int) b.charAt(i) - 48)) % a;
			// r = r % a;
		}
		return r;
	}

}
