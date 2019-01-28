//https://practice.geeksforgeeks.org/problems/find-k-th-character-in-string/0
/**
 * 
 */
package Amazon;

import java.util.Scanner;

/**
 * @author gopaljaiswal
 *
 */
public class Find_kth_char_String {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			int m = in.nextInt();
			int k = in.nextInt();
			int n = in.nextInt();
			getOutput(m, k, n);
		}
		in.close();
	}

	public static void getOutput(int m, int k, int n) {
		String br = Integer.toBinaryString(m);
		String[] A = new String[n + 1];
		A[0] = br;
		for (int i = 0; i < n; i++) {
			A[i + 1] = oper(A[i]);
		}
		System.out.println(A[n].charAt(k));
	}

	public static String oper(String str) {
		// System.out.println(str);
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1') {
				str1 = str1 + "10";
			} else if (str.charAt(i) == '0') {
				str1 = str1 + "01";
			}
		}
		return str1;
	}
}
