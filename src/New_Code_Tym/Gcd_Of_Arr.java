/**
 * 
 */
package New_Code_Tym;

/**
 * @author gopaljaiswal
 *
 */
public class Gcd_Of_Arr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] element_array = { 2, 7, 3, 9, 4 };
		System.out.println(gcd_of_array_elements(element_array));

	}

	public static int gcd_of_array_elements(int[] A) {
		int gcd_out = A[0];
		for (int i = 1; i < A.length; i++) {
			gcd_out = gcd(A[i], gcd_out);
		}
		return gcd_out;
	}

	public static int gcd(int a, int b) {
		if (a == 0 || b == 0) {
			return 0;
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
