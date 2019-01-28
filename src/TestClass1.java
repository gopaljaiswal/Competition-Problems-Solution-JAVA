import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class TestClass1 {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskD solver = new TaskD();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskD {

		final int MAX = (int) (1e5);
		final int MOD = (int) (1e9) + 7;
		Long[] H = new Long[MAX + 5];
		Long[] kadanes = new Long[MAX + 5];
		int[] U = new int[MAX + 5];
		int[] V = new int[MAX + 5];
		List<List<Integer>> tree = new ArrayList<List<Integer>>();
		int n;

		Long res;

		void dfs1(int id, int parent, Long max_ending_here, Long max_so_far) {
			for (int i = 0; i < tree.get(id).size(); i++) {
				if (tree.get(id).get(i) != parent) {
					int x = tree.get(id).get(i);
					Long new_max_ending_here = Math.max(H[x], max_ending_here
							+ H[x]);
					Long new_max_so_far = Math.max(max_so_far,
							new_max_ending_here);
					res = Math.max(res, new_max_so_far);
					dfs1(x, id, new_max_ending_here, new_max_so_far);
				}
			}
		}

		public void solve(int testNumber, InputReader in, PrintWriter out) {
			int tt = in.nextInt();
			while (tt-- > 0) {
				n = in.nextInt();
				res = 0L;

				// init data structures
				tree.clear();
				for (int i = 0; i < n; i++) {
					tree.add(new ArrayList<Integer>());
				}
				for (int i = 0; i < n; i++)
					H[i] = in.nextLong();
				kadanes[0] = H[0];
				int m = in.nextInt();
				for (int i = 0; i < n - 1; i++)
					U[i] = in.nextInt();
				for (int i = 0; i < n - 1; i++)
					V[i] = in.nextInt();

				for (int i = 0; i < n - 1; i++) {
					U[i]--;
					V[i]--;
					tree.get(U[i]).add(V[i]);
					tree.get(V[i]).add(U[i]);
				}
				dfs1(0, -1, H[0], H[0]);
				System.out.println(res);
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