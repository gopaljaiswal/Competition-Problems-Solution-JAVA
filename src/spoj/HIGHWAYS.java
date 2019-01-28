/**
 * 
 */
package spoj;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author Gopal Jaiswal
 *
 *         Software Development Engineer
 */

class Edge implements Comparable<Edge> {
	int vertex;
	int weight;

	public Edge(int vertex, int weight) {
		this.vertex = vertex;
		this.weight = weight;
	}

	@Override
	public int compareTo(Edge other) {
		return this.weight - other.weight;
	}
}

class HIGHWAYS {

	public static void main(String[] args) throws Exception {
		Reader in = new Reader();

		int T = in.nextInt();

		for (int t = 0; t < T; t++) {
			int V = in.nextInt();
			int E = in.nextInt();
			int S = in.nextInt();
			int L = in.nextInt();
			ArrayList<ArrayList<Edge>> pairs = new ArrayList<ArrayList<Edge>>();
			for (int i = 0; i < V; i++) {
				pairs.add(new ArrayList<Edge>());
			}
			for (int i = 0; i < E; i++) {
				int v1 = in.nextInt();
				int v2 = in.nextInt();
				int wt = in.nextInt();

				pairs.get(v1 - 1).add(new Edge(v2 - 1, wt));
				pairs.get(v2 - 1).add(new Edge(v1 - 1, wt));
			}
			dijkstraAlgo(pairs, V, S - 1, L - 1);
		}
	}

	public static void dijkstraAlgo(ArrayList<ArrayList<Edge>> pairs, int V,
			int S, int L) throws IOException {

		long[] wt = new long[V];
		Arrays.fill(wt, Integer.MAX_VALUE);

		PriorityQueue<Edge> minHeap = new PriorityQueue<Edge>();
		minHeap.add(new Edge(S, 0));
		wt[S] = 0;
		while (minHeap.size() != 0) {
			Edge e = minHeap.poll();
			for (Edge adjEdge : pairs.get(e.vertex)) {
				if (wt[adjEdge.vertex] > wt[e.vertex] + adjEdge.weight) {
					wt[adjEdge.vertex] = wt[e.vertex] + adjEdge.weight;
					minHeap.add(new Edge(adjEdge.vertex, adjEdge.weight));
				}
			}
		}

		if (wt[L] == Integer.MAX_VALUE) {
			System.out.println("NONE");
		} else {
			System.out.println(wt[L]);
		}
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
