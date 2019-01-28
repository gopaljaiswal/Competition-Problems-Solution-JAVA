//https://www.geeksforgeeks.org/searching-for-patterns-set-2-kmp-algorithm/
package string;

/**
 * @author gopaljaiswal
 *
 */
public class PatternSearchKMP {
	public static void main(String[] args) {
		String txt = "ABABDABACDABABCABAB";
		String pattern = "ABABCABAB";

		char[] txtArr = txt.toCharArray();
		char[] pattArr = pattern.toCharArray();
		int[] lcp = calLPS(pattArr);

		KMPSearch(txtArr, pattArr, lcp);
	}

	public static void KMPSearch(char[] txt, char[] pattern, int[] lcp) {
		int count = 0;
		int i = 0;
		int j = 0;
		while (i < txt.length) {
			if (txt[i] == pattern[j]) {
				j++;
				i++;
			}
			if (j == pattern.length) {
				System.out.println("Index  " + (i - j));
				count++;
				j = lcp[j - 1];
			} else if (i < txt.length && txt[i] != pattern[j]) {
				if (j != 0) {
					j = lcp[j - 1];
				} else {
					i++;
				}
			}
			// System.out.println(i + "  " + j);
		}
		System.out.println(count);
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
