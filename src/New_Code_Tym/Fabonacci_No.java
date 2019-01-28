/**
 * 
 */
package New_Code_Tym;

/**
 * @author gopaljaiswal
 *
 */
public class Fabonacci_No {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int N = 6;
		System.out.println(fabonacci(N));
	}

	public static int fabonacci(int N) {
		if (N <= 1) {
			return N;
		} else {
			return fabonacci(N - 1) + fabonacci(N - 2);
		}
	}
	
	

}
