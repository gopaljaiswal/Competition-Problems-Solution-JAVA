/**
 * 
 */
package New_Code_Tym;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author gopaljaiswal
 *
 */
public class CompareStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		String[] str = reader.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		String A = reader.readLine();
		String B = reader.readLine();
		for (int i = 0; i < M; i++) {
			int j = Integer.parseInt(reader.readLine());
			B = B.substring(0, j - 1) + "1" + B.substring(j, N);
			
			if (getCompare(B, A)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		reader.close();
	}

	public static boolean getCompare(String B, String A) {
		boolean flag = true;
		for (int i = 0; i < B.length(); i++) {
			if (A.charAt(i) > B.charAt(i)) {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
