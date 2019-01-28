/**
 * 
 */
package graph;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * @author gopaljaiswal
 *
 */

class BishuAndHisGirlfriend {

	public static void main(String[] args) throws Exception {
		Reader in = new Reader();
		int n = in.nextInt();
		ArrayList<ArrayList<Integer>> pairs = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < n; i++) {
			pairs.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < n - 1; i++) {
			int src = in.nextInt();
			int dest = in.nextInt();
			pairs.get(src - 1).add(dest - 1);
			pairs.get(dest - 1).add(src - 1);
		}

		int q = in.nextInt();
		int[] queries = new int[q];
		for (int i = 0; i < q; i++) {
			queries[i] = in.nextInt() - 1;
		}

		dfs(pairs, n, queries);
		in.close();
	}

	public static void dfs(ArrayList<ArrayList<Integer>> pairs, int n,
			int[] queries) {
		int[] cost = new int[n];
		Boolean[] visited = new Boolean[n];
		Arrays.fill(visited, false);

		Stack<Integer> stack = new Stack<Integer>();
		stack.add(0);
		visited[0] = true;

		while (stack.size() > 0) {
			int ver = stack.pop();
			visited[ver] = true;

			List<Integer> adjVer = pairs.get(ver);
			Iterator<Integer> it = adjVer.iterator();
			while (it.hasNext()) {
				int chldVer = it.next();
				if (visited[chldVer] == false) {
					stack.add(chldVer);
					cost[chldVer] = cost[ver] + 1;
				}
			}
		}

		int minDist = Integer.MAX_VALUE;
		int minVerId = Integer.MAX_VALUE;

		for (Integer i : queries) {
			if (cost[i] < minDist && i < minVerId) {
				minDist = cost[i];
				minVerId = i;
			}
		}

		System.out.println(minVerId + 1);
	}

	/** Faster input **/
	static class Reader {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;

		public Reader() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public Reader(String file_name) throws IOException {
			din = new DataInputStream(new FileInputStream(file_name));
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public String readLine() throws IOException {
			byte[] buf = new byte[64]; // line length
			int cnt = 0, c;
			while ((c = read()) != -1) {
				if (c == '\n')
					break;
				buf[cnt++] = (byte) c;
			}
			return new String(buf, 0, cnt);
		}

		public int nextInt() throws IOException {
			int ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}

		public long nextLong() throws IOException {
			long ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}

		public double nextDouble() throws IOException {
			double ret = 0, div = 1;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (c == '.')
				while ((c = read()) >= '0' && c <= '9')
					ret += (c - '0') / (div *= 10);
			if (neg)
				return -ret;
			return ret;
		}

		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}

		private byte read() throws IOException {
			if (bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}

		public void close() throws IOException {
			if (din == null)
				return;
			din.close();
		}
	}

}
