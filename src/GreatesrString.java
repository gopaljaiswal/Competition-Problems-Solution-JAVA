import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author gopaljaiswal
 *
 */
public class GreatesrString {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		while (t-- > 0) {
			String str = bf.readLine();
			int q = Integer.parseInt(bf.readLine());
			solve(str, q);
		}
		bf.close();
	}

	public static boolean isVowel(char A) {
		switch (A) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			return true;
		default:
			return false;
		}
	}

	public static void solve(String A, int k) {
		String res = "";
		for (int i = 0; i < A.length(); i++) {
			if (isVowel(A.charAt(i)) == true && k > 0) {
				k--;
				res += (char) (A.charAt(i) + 1);
			} else
				res += A.charAt(i);
		}
		System.out.println(res);
	}
}
