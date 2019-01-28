package Amazon;

import java.util.Scanner;

public class Peak_Element {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			int N = in.nextInt();
			int[] A = new int[N];
			for (int j = 0; j < N; j++) {
				A[j] = in.nextInt();
			}
			System.out.println(getPeak(A, A.length));
		}
		in.close();
	}

	public static int getPeak(int[] A, int N) {
		int p = Integer.MIN_VALUE;
		for (int i = 1; i < A.length - 1; i++) {
			if (i - 1 == 0 | i + 1 == A.length - 1) {
				if (A[i] > A[i - 1]) {
					p = i;
					break;
				}
			} else {
				if (A[i] > A[i - 1] && A[i] < A[i + 1]) {
					p = i;
					break;
				}
			}
		}
		return p;
	}
}
