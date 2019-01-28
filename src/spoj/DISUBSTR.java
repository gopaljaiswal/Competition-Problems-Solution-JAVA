/**
 * 
 */
package spoj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author gopaljaiswal
 *
 */
public class DISUBSTR {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			String s = in.next();
			distSubStr(s);
		}
	}

	public static void distSubStr(String str) {
		int len = str.length();
		String[] suffixes = suffixes(str);
		Arrays.sort(suffixes);

		long total = (len * (len + 1)) >> 1;
		// System.out.println(total);

		long dupl = 0L;
		for (int i = 1; i < suffixes.length; i++) {
			// System.out.println(suffixes[i - 1] + "  " + suffixes[i]);
			// System.out.println(lcp(suffixes[i], suffixes[i - 1]));
			dupl += lcp(suffixes[i], suffixes[i - 1]);
		}
		System.out.println(total - dupl);
	}

	public static long lcp(String s1, String s2) {
		int len = s1.length() <= s2.length() ? s1.length() : s2.length();
		long prefMtchCnt = 0;

		for (int i = 0; i < len; i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				break;
			}
			prefMtchCnt++;
		}
		return prefMtchCnt;
	}

	public static String[] suffixes(String s) {
		int N = s.length();
		String[] suffixes = new String[N];
		for (int i = 0; i < N; i++)
			suffixes[i] = s.substring(i, N);
		return suffixes;
	}

	static class Scanner {
		public BufferedReader reader;
		public StringTokenizer st;

		public Scanner(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream));
			st = null;
		}

		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					String line = reader.readLine();
					if (line == null)
						return null;
					st = new StringTokenizer(line);
				} catch (Exception e) {
					throw (new RuntimeException());
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}
	}

	class OutputWriter {
		BufferedWriter writer;

		public OutputWriter(OutputStream stream) {
			writer = new BufferedWriter(new OutputStreamWriter(stream));
		}

		public void print(int i) throws IOException {
			writer.write(i);
		}

		public void print(String s) throws IOException {
			writer.write(s);
		}

		public void print(char[] c) throws IOException {
			writer.write(c);
		}

		public void close() throws IOException {
			writer.close();
		}

	}
}
