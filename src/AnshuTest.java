import java.util.Scanner;

/**
 */
public class AnshuTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		metrix(in.nextInt());
		in.close();
	}

	private static void metrix(int num) {
		int s = (num * 2) - 1;
		int[][] res = mtx(new int[s][s], num, (s / 2), (s / 2), 1);
		for (int i = 0; i < s; i++) {
			for (int j = 0; j < s; j++) {
				System.out.print("" + res[i][j]);
			}
			System.out.println("");
		}
	}

	private static int[][] mtx(int[][] arr, int number, int start, int end,
			int printNumber) {

		for (int i = start; i <= end; i++) {
			for (int j = start; j <= end; j++) {
				if (!(i > start && j > start && i < end && j < end)) {
					arr[i][j] = printNumber;
				}
			}
		}
		if (number == printNumber) {
			return arr;
		}
		return mtx(arr, number, start - 1, end + 1, printNumber + 1);
	}

}