package spoj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IITKWPCB {

	public static void main(String[] args) throws Exception {
		// System.out.println(GCD(1, 4));

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		Long n = Long.parseLong(reader.readLine());
		for (int i = 0; i < n; i++) {
			Long a = Long.parseLong(reader.readLine());
			getRes(a);
		}
		reader.close();
	}

	public static void getRes(Long a) {
		Long p = Math.floorDiv(a, 2);
		Long max = Long.MIN_VALUE;
		for (Long i = p; i >= 1; i--) {
			if (GCD(i, a) == 1) {
				max = i;
				break;
			}
		}
		System.out.println(max);
	}

	public static Long GCD(Long a, Long b) {
		if (a == 0)
			return b;

		return GCD(b % a, a);
	}
}
