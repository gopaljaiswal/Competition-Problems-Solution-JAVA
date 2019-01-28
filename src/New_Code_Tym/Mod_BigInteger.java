/**
 * 
 */
package New_Code_Tym;

/**
 * @author gopaljaiswal
 *
 */
public class Mod_BigInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "12316767678678";
		int mod = 10;
		getMod(str, mod);
	}

	public static void getMod(String str, int mod) {
		int res = 0;
		for (int i = 0; i < str.length(); i++) {
			res = (res * 10 + (int) str.charAt(i) - '0') % mod;
		}
		System.out.println(res);

	}
}
