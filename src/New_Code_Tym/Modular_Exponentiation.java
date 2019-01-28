/**
 * 
 */
package New_Code_Tym;

/**
 * @author gopaljaiswal
 *
 */
public class Modular_Exponentiation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		int c = 100;
		modExp(10, 3, 100);
	}

	public static void modExp(int a, int b, int c) {
		int res = 1;
		a = a % c;
		while (b > 0) {
			if (b % 2 != 0) {
				res = (res * a) % c;
			} else {

				b = b >> 1;
				a = (a * a) % c;
			}
		}
		System.out.println(res);
	}

}
