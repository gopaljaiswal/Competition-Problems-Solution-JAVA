package graph;
///**
// * 
// */
//package graph.algo;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.OutputStream;
//import java.io.OutputStreamWriter;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.PriorityQueue;
//import java.util.StringTokenizer;
//
///**
// * @author Gopal Jaiswal
// *
// *         Software Development Engineer
// */
//
//class Edge implements Comparable<Edge> {
//	int vertext;
//	int weight;
//
//	public Edge(int vertext, int weight) {
//		this.vertext = vertext;
//		this.weight = weight;
//	}
//
//	@Override
//	public int compareTo(Edge other) {
//		return this.weight - other.weight;
//	}
//}
//
//public class DijkstraShortestPath {
//	private static OutputWriter out;
//
//	public static void main(String[] args) throws Exception {
//		Scanner in = new Scanner(System.in);
//		out = new OutputWriter(System.out);
//
//		int T = in.nextInt();
//
//		for (int t = 0; t < T; t++) {
//			int V = in.nextInt();
//			int E = in.nextInt();
//
//			ArrayList<ArrayList<Edge>> pairs = new ArrayList<ArrayList<Edge>>();
//			for (int i = 0; i < E; i++) {
//				pairs.add(new ArrayList<Edge>());
//			}
//			for (int i = 0; i < E; i++) {
//				int v1 = in.nextInt();
//				int v2 = in.nextInt();
//				int wt = in.nextInt();
//
//				pairs.get(v1 - 1).add(new Edge(v2 - 1, wt));
//				pairs.get(v2 - 1).add(new Edge(v1 - 1, wt));
//			}
//			int s = in.nextInt();
//			dijkstraAlgo(pairs, s - 1, V);
//			out.print("\n");
//		}
//
//	}
//
//	public static void dijkstraAlgo(ArrayList<ArrayList<Edge>> pairs, int s, int V) throws IOException {
//		int[] wt = new int[V];
//		Arrays.fill(wt, Integer.MAX_VALUE);
//		PriorityQueue<Edge> minheap = new PriorityQueue<Edge>();
//		minheap.add(new Edge(s, 0));
//		wt[s] = 0;
//
//		while (minheap.size() != 0) {
//			Edge e = minheap.poll();
//			for (Edge adjEdge : pairs.get(e.vertext)) {
//				if (wt[adjEdge.vertext] >= wt[e.vertext] + adjEdge.weight) {
//					minheap.remove(e);
//					wt[adjEdge.vertext] = wt[e.vertext] + adjEdge.weight;
//					minheap.add(new Edge(adjEdge.vertext, adjEdge.weight));
//				}
//			}
//		}
//
//		for (int i = 0; i < V; i++) {
//			if (wt[i] == Integer.MAX_VALUE) {
//				out.print("-1 ");
//				continue;
//			}
//			if (i != s) {
//				out.print(wt[i] + " ");
//			}
//		}
//	}
//}
//
//class Scanner {
//	public BufferedReader reader;
//	public StringTokenizer st;
//
//	public Scanner(InputStream stream) {
//		reader = new BufferedReader(new InputStreamReader(stream));
//		st = null;
//	}
//
//	public String next() {
//		while (st == null || !st.hasMoreTokens()) {
//			try {
//				String line = reader.readLine();
//				if (line == null)
//					return null;
//				st = new StringTokenizer(line);
//			} catch (Exception e) {
//				throw (new RuntimeException());
//			}
//		}
//		return st.nextToken();
//	}
//
//	public int nextInt() {
//		return Integer.parseInt(next());
//	}
//
//	public long nextLong() {
//		return Long.parseLong(next());
//	}
//
//	public double nextDouble() {
//		return Double.parseDouble(next());
//	}
//}
//
//class OutputWriter {
//	BufferedWriter writer;
//
//	public OutputWriter(OutputStream stream) {
//		writer = new BufferedWriter(new OutputStreamWriter(stream));
//	}
//
//	public void print(int i) throws IOException {
//		writer.write(i);
//	}
//
//	public void print(String s) throws IOException {
//		writer.write(s);
//	}
//
//	public void print(char[] c) throws IOException {
//		writer.write(c);
//	}
//
//	public void close() throws IOException {
//		writer.close();
//	}
//
//}