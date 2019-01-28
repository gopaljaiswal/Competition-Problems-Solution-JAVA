/**
 * 
 */
package spoj;

/**
 * @author gopaljaiswal
 *
 */
public class FINDKPOS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A = { 0, 0, 0, 0,1, 1, 1, 1 };
		System.out.println(getRes(A));
	}

	public static int getRes(int[] A) {

		int l = 1;
		int r = A.length - 1;
		while (l < r) {
			int mid = (l + r + 1) / 2;

			if (A[mid] == 0) {
				l = mid;
			} else {
				r = mid - 1;
			}
		}

		if (A[l] == 0)
			System.out.println(l);
		else
			System.out.println("Array is all 1s\n");

		return -1;
	}
}
