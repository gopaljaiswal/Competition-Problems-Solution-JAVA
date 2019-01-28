package graph;
///*  !--Hackerrank
// *  https://www.hackerrank.com/challenges/primsmstsub/problem
// * 
// */
//
//package graph.algo;
//
//import java.util.ArrayList;
//import java.util.PriorityQueue;
//import java.util.Scanner;
//
///**
// * @author gopaljaiswal
// *
// */
//
////class Edge implements Comparable<Edge> {
////	int vertext;
////	int weight;
////
////	public Edge(int vertex, int weight) {
////		this.vertext = vertex;
////		this.weight = weight;
////	}
////
////	@Override
////	public int compareTo(Edge other) {
////		return this.weight - other.weight;
////	}
////
////}
//
//public class PrimsMSTSpecialSubtree {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int V = in.nextInt();
//		int E = in.nextInt();
//
//		ArrayList<ArrayList<Edge>> pairs = new ArrayList<ArrayList<Edge>>();
//		for (int i = 0; i < E; i++) {
//			pairs.add(new ArrayList<Edge>());
//		}
//
//		for (int e = 0; e < E; e++) {
//			int v1 = in.nextInt();
//			int v2 = in.nextInt();
//			int wt = in.nextInt();
//			pairs.get(v1 - 1).add(new Edge(v2 - 1, wt));
//			pairs.get(v2 - 1).add(new Edge(v1 - 1, wt));
//		}
//
//		int s = in.nextInt();
//		System.out.println(prims(pairs, s - 1, V));
//		in.close();
//	}
//
//	public static Long prims(ArrayList<ArrayList<Edge>> pairs, int s, int V) {
//		PriorityQueue<Edge> minHeap = new PriorityQueue<Edge>();
//		minHeap.add(new Edge(s, 0));
//		int[] visited = new int[V];
//		Long finalCost = 0L;
//		while (minHeap.size() != 0) {
//			Edge e = minHeap.poll();
//			if (visited[e.vertext] == 1) {
//				continue;
//			}
//			finalCost += e.weight;
//			visited[e.vertext] = 1;
//
//			for (Edge adjEdge : pairs.get(e.vertext)) {
//				if (visited[adjEdge.vertext] == 0) {
//					minHeap.add(adjEdge);
//				}
//			}
//		}
//		return finalCost;
//	}
//}
