/**
 * 
 */
package New_Code_Tym;

import java.util.Scanner;

/**
 * @author gopaljaiswal
 *
 */
public class Grading_Students {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		for (int i = 0; i < N; i++) {
			getGrStu(in.nextInt());
		}
		in.close();
	}

	public static void getGrStu(int n) {
		if (n < 38) {
			System.out.println(n);
		} else {
			int div = (int) n / 5 + 1;
			//System.out.println(div);
			if ((div * 5) - n < 3) {
				System.out.println(div * 5);
			}else{
				System.out.println(n);
			}
		}
	}

}
