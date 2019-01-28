package New_Code_Tym;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 
 */

/**
 * @author gopaljaiswal
 *
 */
public class DigitalTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] inpurStr = bf.readLine().split(",");
		int[] A = new int[9];
		for (int i = 0; i < 9; i++) {
			A[i] = Integer.parseInt(inpurStr[i]);
		}
		Boolean[] flagArr = new Boolean[9];
		Arrays.fill(flagArr, false);

		System.out.println(getRes(A, flagArr));
	}

	public static String getRes(int[] A, Boolean[] flagArr) {
		int MAX_HR = 24, MAX_MIN = 60;
		int hr = Integer.MIN_VALUE, min = Integer.MIN_VALUE, sec = Integer.MIN_VALUE;
		int prevIdxI = 0, prevIdxJ = 0;

		for (int i = 0; i < 8; i++) {
			for (int j = i + 1; j < 9; j++) {
				String str = A[i] + "" + A[j];
				if (Integer.parseInt(str) > hr
						&& Integer.parseInt(str) < MAX_HR) {
					flagArr[prevIdxI] = false;
					flagArr[prevIdxJ] = false;

					hr = Integer.parseInt(str);

					prevIdxI = i;
					prevIdxJ = j;

					flagArr[prevIdxI] = true;
					flagArr[prevIdxJ] = true;
				}
			}
		}

		if (hr == Integer.MIN_VALUE) {
			return "Impossible";
		}

		int[] newA = new int[7];
		Boolean[] flagArr1 = new Boolean[7];
		Arrays.fill(flagArr1, false);

		int l = 0;
		for (int i = 0; i < 9; i++) {
			if (flagArr[i] == false) {
				newA[l++] = A[i];
			}
		}
		prevIdxI = 0;
		prevIdxJ = 0;

		for (int i = 0; i < 6; i++) {
			for (int j = i + 1; j < 7; j++) {
				String str = newA[i] + "" + newA[j];

				// System.out.print(Integer.parseInt(str) + " ");
				if (Integer.parseInt(str) > min
						&& Integer.parseInt(str) < MAX_MIN) {
					flagArr1[prevIdxI] = false;
					flagArr1[prevIdxJ] = false;

					min = Integer.parseInt(str);

					prevIdxI = i;
					prevIdxJ = j;

					flagArr1[prevIdxI] = true;
					flagArr1[prevIdxJ] = true;
				}
			}
		}

		if (min == Integer.MIN_VALUE) {
			return "Impossible";
		}

		int[] newA1 = new int[5];
		int l1 = 0;
		for (int i = 0; i < 7; i++) {
			if (flagArr1[i] == false) {
				newA1[l1++] = newA[i];
			}
		}
		prevIdxI = 0;
		prevIdxJ = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = i + 1; j < 5; j++) {
				String str = newA1[i] + "" + newA1[j];

				if (Integer.parseInt(str) > sec
						&& Integer.parseInt(str) < MAX_MIN) {

					sec = Integer.parseInt(str);

				}
			}
		}

		if (sec == Integer.MIN_VALUE) {
			return "Impossible";
		}

		String hrStr = "";
		String minStr = "";
		String secStr = "";
		if (hr < 10) {
			hrStr = "0" + hr;
		} else {
			hrStr = "" + hr;
		}
		if (min < 10) {
			minStr = "0" + min;
		} else {
			minStr = "" + min;
		}

		if (sec < 10) {
			secStr = "0" + sec;
		} else {
			secStr = "" + sec;
		}
		return (hrStr + ":" + minStr + ":" + secStr);

	}
}
