import java.util.HashSet;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Gopal Jaiswal
 *
 *         Software Development Engineer
 */
public class ArrayReduction {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = in.nextInt();
		}

		getRes(A);
		in.close();
	}

	public static void getRes(int[] A) {
		int len = A.length;
		HashSet<Integer> set = new HashSet<Integer>();

		for (int k = 1; k < len; k++) {
			while (true) {

				int a = getFirstPos(A);
				int b = getPosInd(A, a);

				int posCount = getPosCount(A);
				if (posCount > 1) {
					if (2 * A[a] > A[b]) {
						A[a] = A[a] + A[b];
						A[b] = -1;
						set.add(a);
					} else {
						A[b] = A[a] + A[b];
						A[a] = -1;
						set.add(b);
					}
				} else {
					break;
				}
			}
		}
		System.out.println(set.size());
	}

	public static int getPosCount(int[] A) {
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0) {
				count++;
			}
		}
		return count;
	}

	public static int getPosInd(int[] A, int b) {
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0 && A[i] != b) {
				count = i;
				break;
			}
		}
		return count;
	}

	public static int getFirstPos(int[] A) {
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0) {
				count = i;
				break;
			}
		}
		return count;
	}

}
