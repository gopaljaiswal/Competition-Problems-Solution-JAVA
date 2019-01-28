import java.util.Scanner;

/**
 * 
 */

/**
 * @author gopaljaiswal
 *
 */
public class Once_in_a_tram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long num = in.nextLong();
		long left_num1 = num / 100000;
		long left_num2 = (num % 100000) / 10000;
		long left_num3 = (num % 10000) / 1000;
		long left_num = 100 * left_num1 + 10 * left_num2 + left_num3;
		//System.out.println(left_num);

		long right_num1 = (num % 1000) / 100;
		long right_num2 = (num % 100) / 10;
		long right_num3 = num % 10;
		long right_num = 100 * right_num1 + 10 * right_num2 + right_num3;
		//System.out.println(right_num);

		long left_sum = left_num1 + left_num2 + left_num3;
		long right_sum = right_num1 + right_num2 + right_num3;

		long diff = Math.abs(left_sum - right_sum);
		if (right_sum > left_sum) {
			right_num = (right_num + 9) - diff;

		} else if (right_sum < left_sum) {
			right_num = (right_num + 9) + diff;

		} else {
			right_num = right_num + 9;
		}
		System.out.println(left_num+""+right_num);

		in.close();
	}

}
