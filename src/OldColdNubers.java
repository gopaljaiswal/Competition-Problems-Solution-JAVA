import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class OldColdNubers {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskD solver = new TaskD();
		solver.solve(1, in, out);
		out.close();
	}

	static class ST {
		private int val;
		private int ones;

		public ST() {

		}

		public ST(int val, int ones) {
			this.val = val;
			this.ones = ones;
		}

		void combine(ST A, ST B) {
			this.val = A.val + B.val;
			this.ones = A.ones + B.ones;
		}
	}

	static class TaskD {

		final int MAX = (int) (5e4);
		final int MOD = (int) (1e9) + 7;
		int[] A = new int[MAX + 5];
		ST[] tree = new ST[4 * MAX + 5];

		public TaskD() {
			for (int i = 0; i < (4 * MAX + 5); i++) {
				ST st = new ST();
				tree[i] = st;
			}
		}

		int n;

		public void build(int id, int L, int R) {
			if (L == R) {
				if (A[L] % 2 != 0 && A[L] > 1) { // cold no.
					tree[id].val = 0;
					tree[id].ones = 0;
				} else { // old no.
					if (A[L] == 1)
						tree[id].ones = 1;
					else
						tree[id].val = 1;
				}

				return;
			}
			int mid = (L + R) >> 1;
			build(2 * id + 1, L, mid);
			build(2 * id + 2, mid + 1, R);
			tree[id].combine(tree[2 * id + 1], tree[2 * id + 2]);
		}

		public int query(int id, int L, int R, int X, int Y, int type) {
			if (X > Y || L > Y || X > R)
				return 0;

			if (L >= X && R <= Y) {
				if (type == 1)
					return tree[id].val;
				if (type == 2)
					return tree[id].ones;
			}
			int mid = (L + R) / 2;
			return query(2 * id + 1, L, mid, X, Y, type)
					+ query(2 * id + 2, mid + 1, R, X, Y, type);
		}

		public void solve(int testNumber, InputReader in, PrintWriter out) {
			int tt = in.nextInt();
			while (tt-- > 0) {
				n = in.nextInt();
				for (int i = 0; i < n; i++)
					A[i] = in.nextInt();
				build(0, 0, n - 1);
				int q, x, y;
				q = in.nextInt();
				while (q-- > 0) {
					x = in.nextInt();
					y = in.nextInt();
					x--;
					y--;

					int evenOld = query(0, 0, n - 1, x, y, 1);
					int oneOld = query(0, 0, n - 1, x, y, 2);
					// TODO: print answer
					int old = evenOld + oneOld;
					int cold = y - x + 1 - old;
					int diff = cold - old;
					System.out.println(Math.max(0, diff));
				}
			}
		}
	}

	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

	}
}