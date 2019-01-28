import java.util.Scanner;

/**
 * 
 */

/**
 * @author gopaljaiswal
 *
 */
public class PremTest22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] A = splitBy1(str);

		for (int i = 0, j = A.length - 1; i < j; i++, j--) {
			String newStr = A[j] + "" + A[i];
			System.out.print(newStr.length() + "" + newStr + " ");
		}
		if (A.length % 2 != 0) {
			String newStr = A[(A.length / 2)];
			System.out.print(newStr.length() + "" + newStr + " ");
		}
		in.close();
	}

	public static String[] splitBy1(String str) {
		str = str + " ";
		String str2 = "";
		int i = 0;
		int count = 0;
		for (int k = 0; k < str.length(); k++) {
			if (str.charAt(k) == ' ')
				count++;
		}
		String[] str3 = new String[count];
		for (int j = 0; j < str.length(); j++) {
			if ((str.charAt(j) != ' ')) {
				str2 += str.charAt(j);
			} else {
				str3[i] = str2;
				i++;
				str2 = "";
			}
		}
		return str3;
	}

}
