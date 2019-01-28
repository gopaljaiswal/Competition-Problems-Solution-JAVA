/**
 * 
 */

/**
 * @author Gopal Jaiswal
 *
 *         Software Development Engineer
 */
public class SmallestElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String enterTime = "09:42";
		String leftTime = "10:41";

		System.out.println(solution(enterTime, leftTime));
	}

	public static int solution(String enterTime, String leftTime) {
		String[] ets = enterTime.split(":");
		String[] lts = leftTime.split(":");

		int eH = Integer.parseInt(ets[0]);
		int eM = Integer.parseInt(ets[1]);
		int lH = Integer.parseInt(lts[0]);
		int lM = Integer.parseInt(lts[1]);

		int diffH = lH - eH;
		int diffM = lM - eM;
		int cost = 2;

		if (diffH == 1) {
			if (diffM <= 0) {
				cost += 3;
			} else if (diffM > 0) {
				cost += 3;
				cost += 4;
			}
		}

		if (diffH > 1 && diffM <= 0) {
			cost += 3;
			for (int i = 1; i < diffH; i++) {
				cost += 4;
			}
		}

		if (diffH > 1 && diffM > 0) {
			cost += 3;
			for (int i = 1; i < diffH; i++) {
				cost += 4;
			}
			cost += 4;
		}

		return cost;
	}
}
