/**
 * 
 */
package spoj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author gopaljaiswal
 *
 */
public class NHAY {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			while (true) {
				int n = in.nextInt();
				String pattern = in.next();
				String text = in.next();

				if (pattern.length() > text.length()) {
					System.out.println();
				} else {
					int[] lsp = calLPS(pattern.toCharArray());
					List<Integer> couters = calKMPSearchCost(
							text.toCharArray(), pattern.toCharArray(), lsp);
					if (couters.size() == 0) {
						System.out.println();
					} else {
						for (Integer i : couters) {
							System.out.println(i);
						}
					}
				}
			}
		} catch (Exception e) {

		}
	}

	public static List<Integer> calKMPSearchCost(char[] text, char[] pattern,
			int[] lsp) {
		List<Integer> counter = new ArrayList<Integer>();

		int i = 0, j = 0;
		while (i < text.length) {
			if (text[i] == pattern[j]) {
				i++;
				j++;
			}
			if (j == pattern.length) {
				counter.add(i - j);
				j = lsp[j - 1];
			} else if (i < text.length && pattern[j] != text[i]) {
				if (j == 0) {
					i++;
				} else {
					j = lsp[j - 1];
				}
			}
		}
		return counter;
	}

	public static int[] calLPS(char[] patt) {
		int[] lps = new int[patt.length];
		lps[0] = 0;
		int j = 0, i = 1;
		while (i < patt.length) {
			if (patt[i] == patt[j]) {
				j++;
				lps[i] = j;
				i++;
			} else {
				if (j == 0) {
					lps[i] = 0;
					i++;
				} else {
					j = lps[j - 1];
				}
			}
		}
		return lps;
	}
}
