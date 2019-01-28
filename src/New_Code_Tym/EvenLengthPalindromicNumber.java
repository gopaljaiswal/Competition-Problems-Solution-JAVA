/**
 * 
 */
package New_Code_Tym;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author gopaljaiswal
 *
 */
public class EvenLengthPalindromicNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		System.out.println(getPalNo(11));
//		BufferedReader reader = new BufferedReader(new InputStreamReader(
//				System.in));
//		int T = Integer.parseInt(reader.readLine());
//		for (int i = 0; i < T; i++) {
//			getRes(Integer.parseInt(reader.readLine()));
//		}
	}

//	public static void getRes(int k) {
//		String pallNo = getPalNo(k);
//				HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//
//		int max = Integer.MIN_VALUE;
//		Character res = null;
//
//		for (int i = 0; i < pallNo.length(); i++) {
//			char c = pallNo.charAt(i);
//			if (map.containsKey(c)) {
//				map.put(c, map.get(c) + 1);
//			} else {
//				map.put(c, 1);
//			}
//
//			if (map.get(c) > max) {
//				max = map.get(c);
//				res = c;
//			} else if (map.get(c) == max) {
//				max = map.get(c);
//				if (c < res) {
//					res = c;
//				}
//			}
//		}
//		System.out.println(res);
//	}

	public static String reverseString(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}

	public static String getPalNo(int k) {
		String num = Integer.toString(k);
		String revNum = num;
		revNum = reverseString(num);
		String strnum = (num + revNum);
		return strnum;
	}

}
