/**
 * 
 */
package New_Code_Tym;

/**
 * @author gopaljaiswal
 *
 */
public class LinerSearchRec {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A = { 1, 5, 4, 3, 2 };
		// System.out.println(getLinearSer(A, 0, 10));

		int[] newAA = bubbleSort(A);
		for (int i : newAA) {
			System.out.print(i + " ");
		}
	}

	public static int[] bubbleSort(int[] A) {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length - 1; j++) {
				if (A[j] > A[j + 1]) {
					int temp = A[j + 1];
					A[j + 1] = A[j];
					A[j] = temp;
				}
			}

			System.out.print(i + ":: ");
			for (int a : A) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
		return A;
	}

	public static int getLinearSer(int[] A, int i, int item) {
		if (i == A.length) {
			return Integer.MIN_VALUE;
		}
		if (A[i] == item) {
			return i;
		}
		return getLinearSer(A, i + 1, item);
	}

}
