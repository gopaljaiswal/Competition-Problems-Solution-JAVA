/**
 * 
 */
package New_Code_Tym;

import java.util.Stack;

/**
 * @author gopaljaiswal
 *
 */
public class QueenAttack {

	static class Pair {
		int x;
		int y;

		public Pair() {
		}

		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

	}

	private static int n = 8;
	private static int[][] boarder = new int[n][n];
	private static Stack<Pair> st = new Stack<Pair>();

	public static void main(String[] args) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (queen(0, i, j)) {
					for (Pair p : st) {
						System.out.println(p.getX() + "   " + p.getY());
					}
					return;
				}
			}
		}

	}

	public static boolean queen(int noQueens, int x, int y) {
		if (noQueens == n) {
			return true;
		}

		if (isDies(x, y) == true) {
			return false;
		} else {
			boarder[x][y] = 1;
			Pair pair = new Pair(x, y);
			st.push(pair);
			noQueens++;
		}

		System.out.println("visiting: " + noQueens + " " + x + " " + y);

//		for (int i = 0; i < n; i++) {
		int i = x+1;
			for (int j = 0; j < n; j++) {
				if (queen(noQueens, i, j)) {
					return true;
				}
			}
//		}
		boarder[x][y] = 0;
		st.pop();

		return false;
	}

	public static boolean isDies(int x, int y) {

		int a = x, b = y;
		while (b >= 0) {
			if (boarder[a][b] == 1) {
				return true;
			}
			b--;
		}

		a = x;
		b = y;
		while (b < n) {
			if (boarder[a][b] == 1) {
				return true;
			}
			b++;
		}

		a = x;
		b = y;
		while (a >= 0) {
			if (boarder[a][b] == 1) {
				return true;
			}
			a--;
		}

		a = x;
		b = y;
		while (a < n) {
			if (boarder[a][b] == 1) {
				return true;
			}
			a++;
		}

		a = x;
		b = y;
		while (a >= 0 && b >= 0) {
			if (boarder[a][b] == 1) {
				return true;
			}
			a--;
			b--;
		}

		a = x;
		b = y;
		while (a >= 0 && b < n) {
			if (boarder[a][b] == 1) {
				return true;
			}
			a--;
			b++;
		}

		a = x;
		b = y;
		while (a < n && b >= 0) {
			if (boarder[a][b] == 1) {
				return true;
			}
			a++;
			b--;
		}

		a = x;
		b = y;
		while (a < n && b < n) {
			if (boarder[a][b] == 1) {
				return true;
			}
			a++;
			b++;
		}
		return false;
	}
}
