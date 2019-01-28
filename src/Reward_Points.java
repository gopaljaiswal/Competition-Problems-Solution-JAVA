import java.util.Scanner;

/**
 * 
 */

/**
 * @author gopaljaiswal
 *
 */
public class Reward_Points {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m1 = in.nextInt();
		int m2 = in.nextInt();
		int m3 = in.nextInt();

		long m1_rew = ((m1 * 10) > 100) ? 100 : (m1 * 10);
		long m2_rew = ((m2 * 10) > 100) ? 100 : (m2 * 10);
		long m3_rew = ((m3 * 10) > 100) ? 100 : (m3 * 10);

		System.out.println(m1_rew + m2_rew + m3_rew);
		in.close();
	}

}
