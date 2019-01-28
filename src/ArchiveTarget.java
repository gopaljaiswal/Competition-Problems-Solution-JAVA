/**
 * 
 */

/**
 * @author gopaljaiswal
 *
 */
public class ArchiveTarget {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 8, y = 5, z = 3;
		findMaxNum(x, y, z);
	}

	// Complete the findMaxNum function below.
	public static int findMaxNum(int x, int y, int z) {
		int res = Integer.MIN_VALUE;
		if (x < y) {
			res = (int) Math.ceil(z / 2) + x;
		} else if (x == y) {
			res = (int) Math.floor(z / 2) + x;
		} else {
			res = (y + z) / 2 + y;
		}
		return res;
	}
}

