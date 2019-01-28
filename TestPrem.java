import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author gopaljaiswal
 *
 */
public class TestPrem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line1 = in.nextLine();
		String line2 = in.nextLine();

		String[] A = line1.split(" ");
		String[] B = line2.split(" ");

		System.out.println(A[1] + "++++" + B[1]);
		int count = 0;
		int prev = 0;
		int post = B.length;
		List<String> list = new ArrayList<String>();

		for (int i = 0; i < A.length; i++) {
			String a1 = A[i];

			for (int j = prev; j < post; j++) {
				if (a1.equals(B[j])) {
					count++;
					list.add(a1);
					prev = j;
					post = j + 2;
				}
			}
		}
		if (list.size() == 0) {
			System.out.println("0");
		} else {
			for (String str : list) {
				System.out.println(str + " ");
			}
		}
	}
}
