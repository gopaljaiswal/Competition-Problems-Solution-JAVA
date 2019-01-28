//https://www.spoj.com/problems/SHPATH/
/**
 * 
 */
package graph;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * @author gopaljaiswal
 *
 */

class SHPATH {

	static class Edge implements Comparable<Edge> {
		int v;
		int weight;

		public Edge(int v, int weight) {
			this.v = v;
			this.weight = weight;
		}

		@Override
		public int compareTo(Edge o) {
			return this.weight - o.weight;
		}

	}

	public static void getRes(int[] find, ArrayList<ArrayList<Edge>> pairs,
			HashMap<String, Integer> nameMap, String src, String dest) {

		int srcCity = nameMap.get(src);
		int destCity = nameMap.get(dest);
		int[] cost = dijkstraAlgo(find, pairs, srcCity, destCity);
		System.out.println(cost[destCity]);
	}

	public static int[] dijkstraAlgo(int[] find,
			ArrayList<ArrayList<Edge>> pairs, int src, int dest) {
		int[] cost = new int[pairs.size()];
		Arrays.fill(cost, Integer.MAX_VALUE);

		PriorityQueue<Edge> minHeap = new PriorityQueue<SHPATH.Edge>();
		minHeap.add(new Edge(src, 0));
		cost[src] = 0;

		while (minHeap.size() != 0) {
			Edge e = minHeap.poll();

			Iterator<Edge> it = pairs.get(e.v).iterator();
			while (it.hasNext()) {
				Edge adjEdge = it.next();
				if (cost[adjEdge.v] > cost[e.v] + adjEdge.weight) {
					cost[adjEdge.v] = cost[e.v] + adjEdge.weight;
					minHeap.add(adjEdge);
				}
			}
		}
		return cost;
	}

	public static void main(String[] args) throws Exception {
		Reader in = new Reader();
		int t = in.nextInt();
		while (t-- > 0) {
			HashMap<String, Integer> nameMap = new HashMap<String, Integer>();
			ArrayList<ArrayList<Edge>> pairs = new ArrayList<ArrayList<Edge>>();
			for (int i = 0; i < 200000; i++) {
				pairs.add(new ArrayList<Edge>());
			}

			int n = in.nextInt();
			int find[] = new int[n + 1];

			for (int i = 0; i < n; i++) {
				String cName = in.readLine();
				nameMap.put(cName, i);

				int nhrs = in.nextInt();
				for (int j = 0; j < nhrs; j++) {
					int dest = in.nextInt();
					int wt = in.nextInt();
					pairs.get(i).add(new Edge(dest - 1, wt));
				}
			}

			int q = in.nextInt();
			for (int i = 0; i < q; i++) {
				String srcDest[] = in.readLine().split(" ");
				String src = srcDest[0];
				String dest = srcDest[1];
				getRes(find, pairs, nameMap, src, dest);
			}
			System.out.println();
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
