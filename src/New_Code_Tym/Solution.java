package New_Code_Tym;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

	public static String isValid(String s) {
		int[] A = new int[26];
		int max = 0;
		for (int i = 0; i < s.length(); i++) {
			int a = (int) s.charAt(i) - 97;
			A[a] += 1;
			if (A[a] > max) {
				max = A[a];
			}
		}
		for (int a : A) {
			System.out.print(a + " ");
		}
		// System.out.println(max);
		int count = 0;
		for (int i = 0; i < 26; i++) {
			if (A[i] == max || A[i] == 0) {
				continue;
			}

			if (max - A[i] == 1 && count == 0) {
				count++;
			} else if (A[i] == 1 && count == 0) {
				count++;
			} else {
				return "NO";
			}
			// if(max-A[i]>1){
			// return "NO";
			// }
		}
		return "YES";
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		System.out.println(isValid(s));
		scanner.close();
	}
}
