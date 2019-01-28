/**
 * 
 */
package New_Code_Tym;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author gopaljaiswal
 *
 */
public class Count_Character_String {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		getCountChar(str);
		in.close();
	}

	public static void getCountChar(String str) {
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		char[] A = str.toCharArray();
		for (char a : A) {
			if (charMap.containsKey(a)) {
				charMap.put(a, charMap.get(a) + 1);
			} else {
				charMap.put(a, 1);
			}
		}
		System.out.println(charMap);
	}

}
