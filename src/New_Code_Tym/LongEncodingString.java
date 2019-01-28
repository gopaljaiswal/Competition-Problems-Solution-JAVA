/**
 * 
 */
package New_Code_Tym;

import java.util.Enumeration;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author gopaljaiswal
 *
 */
public class LongEncodingString {

	public static void main(String[] args) {
		String s = "1(2)23(3)";
		for (int i : frequency(s)) {
			System.out.print(i + " ");
		}
	}

	public static void tokenized(int[] alphabet, int a, int c) {
		alphabet[a - 1] += c;
	}

	public static int[] frequency(String s) {
		int[] alphabet = new int[26];
		// check valid string
		Pattern p = Pattern.compile("[0-9#()]*");
		Matcher m = p.matcher(s);

		if (!(m.find() && m.group().equals(s))) {
			return null;
		}

		// insert meaningless char for comparison conveniently.
		s += '-';
		s += '-';
		s += '-';

		// tokenizing
		int a = 0, c = 0;
		Boolean c_tag_opened = false;

		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case '(':
				c_tag_opened = true;
				break;
			case ')':
				c_tag_opened = false;
				tokenized(alphabet, a, c);
				c = 0;
				break;
			default:
				if (c_tag_opened) {
					c = c * 10 + (s.charAt(i) - '0');
				} else {
					if (s.charAt(i + 2) != '#') {
						a = s.charAt(i) - '0';
						if (s.charAt(i + 1) != '(') {
							tokenized(alphabet, a, 1);
						}
					} else if (s.charAt(i + 2) == '#') {
						a = (s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0');

						if (s.charAt(i + 3) != '(') {
							tokenized(alphabet, a, 1);
						}
						i += 2;
					}
				}
				break;
			}
		}
		return alphabet;
	}

	public static int getCount(String s, int i) {
		String ans = "";
		while (i < s.length() && s.charAt(i) != ')') {
			ans = ans + s.charAt(i);
			i++;
		}
		return Integer.parseInt(ans);
	}
}
