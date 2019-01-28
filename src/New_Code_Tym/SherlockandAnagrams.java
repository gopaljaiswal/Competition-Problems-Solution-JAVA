/**
 * 
 */
package New_Code_Tym;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author gopaljaiswal
 *
 */
public class SherlockandAnagrams {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		for (int i = 0; i < N; i++) {
			String s = in.next();
			getRes(s);
		}
		in.close();
	}

	public static void getRes(String s) {

		long counter = 0L;
		for (int i = 1; i <= s.length(); i++) {
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			for (int j = 0; j + i <= s.length(); j = j + 1) {
				String newS = s.substring(j, j + i);
				System.out.println(newS);
			}
			System.out.println(counter);
		}
	}

	public static String getRev(String s) {
		String res = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			res += s.charAt(i);
		}
		return res;
	}
}
