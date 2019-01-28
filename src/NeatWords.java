import java.util.Scanner;

/**
 * 
 */

/**
 * @author gopaljaiswal
 *
 */
public class NeatWords {

	public static void main(String[] args) {
		String[] words = { "abb" };
		// System.out.println(check("abbb"));

		for (Integer i : minimalOperations(words)) {
			System.out.print(i + " ");
		}
	}

	public static int[] minimalOperations(String[] words) {
		int len = words.length;
		int[] res = new int[len];

		for (int i = 0; i < len; i++) {

			res[i] = check(words[i]);
			System.out.println(res[i]);
		}
		return res;
	}

	public static int check(String s) {

		int count = 0;
		int i = 1;
		while (i < s.length()) {
			// System.out.println(s.charAt(i - 1) + "   " + s.charAt(i));
			if (s.charAt(i) == s.charAt(i - 1)) {
				count++;
				i += 1;
			}
			i++;
		}
		return count;
	}

}
