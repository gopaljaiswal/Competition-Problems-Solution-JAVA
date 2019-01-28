package New_Code_Tym;

import java.util.Arrays;

public class Array_Range_Compact {

	public static void main(String[] args) {

		int[] A = { 1, 2, 3, 4, 5, 6, 7, 11, 12, 13, 14, 15, 17, 19 };

		Arrays.sort(A);

		int i = 1;
		while (i < A.length) {

			int a = A[i - 1];

			if (A[i] - a == 1) {

				System.out.print(A[i - 1]);

				int j = i;

				while (j < A.length) {

					if (A[j + 1] - A[j] == 1) {
						System.out.print("-");
						j++;

					} else {
						System.out.print(A[j] + ",");
						if (j == A.length - 2) {
							System.out.print(A[j + 1]);
						}
						i = j + 3;
						break;
					}
				}

				if (j == A.length - 1) {
					System.out.print(A[j]);
					break;
				}

			} else {
				System.out.print("," + A[i - 2]);
				i++;
			}

		}

	}
}
