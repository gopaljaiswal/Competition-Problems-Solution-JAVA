import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 */

/**
 * @author gopaljaiswal
 *
 */
public class Winning_Lottery {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		String[] str = new String[N];
		for (int i = 0; i < N; i++) {
			str[i] = in.next();
		}

		int count = 0;
		for (int i = 0; i < N; i++) {
			String p = str[i];
			for (int j = i + 1; j < N; j++) {
				if (isCheck(str[i], str[j])) {
					count++;
				}
			}
		}
		
		System.out.println(count);
		in.close();
	}

	public static boolean isCheck(String str, String str1) {
		boolean flag = false;
		Set<Character> hs = new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			hs.add(str.charAt(i));
		}
		for (int i = 0; i < str1.length(); i++) {
			hs.add(str1.charAt(i));
		}
		if (hs.size() == 10) {
			flag = true;
		}
		return flag;
	}

}
