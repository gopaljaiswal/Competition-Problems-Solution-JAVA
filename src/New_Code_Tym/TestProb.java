/**
 * 
 */
package New_Code_Tym;

import java.util.Scanner;

/**
 * @author gopaljaiswal
 *
 */

/*
 * N = 0 S = 1 E = 2 W = 3
 */

public class TestProb {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			int N = in.nextInt();
			String s = in.next();
			getRes(s);
		}
		in.close();
	}

	public static void getRes(String A) {
		Pair new_xy = cal(A);
		int y = new_xy.a, x = new_xy.b;

		if (x == 0 && y == 0) {
			System.out.println("0");
		}

		String res = "";
		String diag = get_diag(x, y);
		for (int i = 0; i < Integer.min((int) Math.abs(x), (int) Math.abs(y)); i++)
			res += diag;

		if (Math.abs(x) <= Math.abs(y)) {
			int sign = y < 0 ? -1 : 1;
			y = (Math.abs(y) - Math.abs(x)) * sign;
			x = 0;
		} else {
			int sign = x < 0 ? -1 : 1;
			x = (Math.abs(x) - Math.abs(y)) * sign;
			y = 0;
		}

		String line = get_line(x, y);
		// cout << x << ' ' << y << '\n';
		for (int i = 0; i < Integer.max((int) Math.abs(x), (int) Math.abs(y)); i++)
			res += line;
		res += "0";

		System.out.println(res);
	}

	static Pair cal(String A) {
		int x = 0, y = 0;
		int prev = 0;
		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) == 'M') {
				if (prev == 0)
					x++;
				else if (prev == 1)
					x--;
				else if (prev == 3)
					y--;
				else
					y++;
			} else if (A.charAt(i) == 'L') {
				if (prev == 0)
					prev = 3;
				else
					prev--;
			} else {
				prev = (prev + 1) % 4;
			}
		}

		Pair res = new Pair();
		res.setA(x);
		res.setB(y);
		return res;
	}

	static String get_diag(int x, int y) {
		if (x > 0 && y > 0)
			return "1";
		if (x < 0 && y > 0)
			return "4";
		if (x < 0 && y < 0)
			return "3";
		return "2";
	}

	static String get_line(int x, int y) {
		if (x == 0 && y > 0)
			return "5";
		if (x == 0 && y < 0)
			return "7";
		if (x > 0 && y == 0)
			return "6";
		return "8";
	}

	static class Pair {
		int a, b;

		public Pair() {

		}

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}

		public int getB() {
			return b;
		}

		public void setB(int b) {
			this.b = b;
		}
	}

}
