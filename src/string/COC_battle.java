/**
 * 
 */
package string;

import java.util.Scanner;

/**
 * @author gopaljaiswal
 *
 */
public class COC_battle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int m = in.nextInt();
			int k = in.nextInt();
			String text = in.next();
			String pattern = in.next().substring(0, k);
			getCount(text.toCharArray(), pattern.toCharArray(), n, m, k);
		}
		in.close();
	}

	public static void getCount(char[] text, char[] pattern, int n, int m, int k) {
		if (k > n) {
			System.out.println(0);
		} else {
			int[] lcp = calLPS(pattern, k);
			System.out.println(calKMPSearch(text, pattern, lcp));
		}
	}

	public static int calKMPSearch(char[] text, char[] pattern, int[] lps) {
		int count = 0;
		int i = 0, j = 0;
		while (i < text.length) {
			if (text[i] == pattern[j]) {
				i++;
				j++;
			}
			if (j == pattern.length) {
				count++;
				j = lps[j - 1];
			} else if (i < text.length && pattern[j] != text[i]) {
				if (j == 0) {
					i++;
				} else {
					j = lps[j - 1];
				}
			}
		}

		return count;
	}

	public static int[] calLPS(char[] pattern, int k) {
		int[] lps = new int[k];
		int i = 1;
		int j = 0;
		lps[0] = 0;

		while (i < k) {
			if (pattern[i] == pattern[j]) {
				j++;
				lps[i] = j;
				i++;
			} else {
				if (j != 0) {
					j = lps[j - 1];
				} else {
					lps[i] = 0;
					i++;
				}
			}
		}
		return lps;
	}
}
