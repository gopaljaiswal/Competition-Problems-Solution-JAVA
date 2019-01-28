//https://www.hackerearth.com/practice/algorithms/graphs/depth-first-search/tutorial/
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

class UnreachableNodes {

	public static void main(String[] args) throws Exception {
		Reader in = new Reader();
		int n = in.nextInt();
		int m = in.nextInt();
		List<ArrayList<Integer>> pairs = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < n; i++) {
			pairs.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < m; i++) {
			int src = in.nextInt();
			int dest = in.nextInt();
			pairs.get(src - 1).add(dest - 1);
			pairs.get(dest - 1).add(src - 1);
		}
		int head = in.nextInt();
		dfs(pairs, n, head - 1);
		in.close();
	}

	public static void dfs(List<ArrayList<Integer>> pairs, int n, int head) {
		Boolean[] visited = new Boolean[n];
		Arrays.fill(visited, false);

		Stack<Integer> stack = new Stack<Integer>();
		stack.add(head);
		visited[head] = true;

		while (stack.size() > 0) {
			int ver = stack.pop();
			visited[ver] = true;
			List<Integer> adjEdge = pairs.get(ver);
			Iterator<Integer> it = adjEdge.iterator();
			while (it.hasNext()) {
				int chilver = it.next();
				if (visited[chilver] == false) {
					stack.add(chilver);
				}
			}
		}

		long unReachCount = 0;
		for (Boolean b : visited) {
			if (b == false) {
				unReachCount++;
			}
		}
		System.out.println(unReachCount);
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
