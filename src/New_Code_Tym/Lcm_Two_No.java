/**
 * 
 */
package New_Code_Tym;

/**
 * @author gopaljaiswal
 *
 */
public class Lcm_Two_No {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 10, b = 30;
		lcm(a, b);
	}

	public static void lcm(int a, int b) {
		
		System.out.println(gcd(a, b));
		System.out.println((a * b) / gcd(a, b));

	}

	public static int gcd(int a, int b) {
		if (a == 0 || b == 0) {
			return a;
		}
		if (a == b) {
			return a;
		}
		if (a > b) {
			return gcd(a - b, b);
		} else {
			return gcd(a, b - a);
		}
	}

}
