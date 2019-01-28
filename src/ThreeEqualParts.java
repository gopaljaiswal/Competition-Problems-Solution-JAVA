import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class ThreeEqualParts {
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
		int[] A = new int[MAX + 5];

		long toInt(String num, int lastZeros) {
			long res = 0, leadingZeros = 0;
			for (int i = 0; i < num.length(); i++) {
				if (num.charAt(i) == '1')
					break;
				leadingZeros++;
			}

			// System.out.println(num + " " + lastZeros + " " + leadingZeros);
			if (leadingZeros < lastZeros)
				return -1; // not possible

			for (int i = num.length() - 1; i >= leadingZeros - lastZeros; i--) {
				res = (((res % MOD) * 2) % MOD + (num.charAt(i) - '0') % MOD)
						% MOD;
			}
			// System.out.println(res);
			return res;
		}

		public void solve(int testNumber, InputReader in, PrintWriter out) {
			int tt = in.nextInt();
			List<Long> fans = new ArrayList<Long>();
			while (tt-- > 0) {

				int n = in.nextInt();
				int ones = 0;
				for (int i = 0; i < n; i++) {
					A[i] = in.nextInt();
					ones += A[i];
				}

				if (ones % 3 != 0) {
					System.out.println(-1);
					continue;
				} else if (ones == 0) {
					System.out.println(0);
					continue;
				}

				String res = "";
				int incOnes = 0;
				List<String> f = new ArrayList<String>();
				int zeros = -1;
				for (int i = n - 1; i >= 0; i--) {
					incOnes += A[i];
					res += (A[i] == 1 ? '1' : '0');
					if (incOnes == ones / 3) {
						int lastZeros = 0;
						for (int j = 0; j < res.length(); j++) {
							if (res.charAt(j) == '1')
								break;
							lastZeros++;
						}
						if (zeros == -1)
							zeros = lastZeros;
						f.add(res);
						res = "";
						incOnes = 0;
					}
				}

				List<Long> all = new ArrayList<Long>();
				for (String r : f) {
					all.add(toInt(r, zeros));
				}

				if (all.size() == 3 && all.get(0).equals(all.get(1))
						&& all.get(1).equals(all.get(2))) {
					System.out.println(all.get(0));
				} else
					System.out.println(-1);
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