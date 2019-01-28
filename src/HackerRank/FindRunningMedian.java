/**
 * 
 */
package HackerRank;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author gopaljaiswal
 *
 */
public class FindRunningMedian {

	public static double getMedian(PriorityQueue<Integer> lower,
			PriorityQueue<Integer> higher) {

		PriorityQueue<Integer> smaller = lower.size() < higher.size() ? lower
				: higher;
		// PriorityQueue<Integer> larger = higher.size() > lower.size() ? higher
		// : lower;
		PriorityQueue<Integer> larger = higher.size() > lower.size() ? higher
				: lower;

		if (smaller.size() == larger.size()) {
			return ((double) smaller.peek() + larger.peek()) / 2;
		}

		return (double) larger.peek();
	}

	public static void rebalance(PriorityQueue<Integer> lower,
			PriorityQueue<Integer> higher) {

		PriorityQueue<Integer> smaller = lower.size() < higher.size() ? lower
				: higher;
		PriorityQueue<Integer> larger = lower.size() > higher.size() ? lower
				: higher;

		if (larger.size() - smaller.size() >= 2) {
			smaller.add(larger.poll());
		}
	}

	public static void addTOBucket(PriorityQueue<Integer> lower,
			PriorityQueue<Integer> higher, int a) {

		if (lower.size() == 0 || a < lower.peek()) {
			lower.add(a);
		} else {
			higher.add(a);
		}
	}

	public static void processArr(int[] A, int N) {

		double[] res = new double[N];

		PriorityQueue<Integer> lower = new PriorityQueue<Integer>(
				new Comparator<Integer>() {

					@Override
					public int compare(Integer o1, Integer o2) {
						return -o1.compareTo(o2);
					}
				});

		PriorityQueue<Integer> higher = new PriorityQueue<Integer>();

		for (int i = 0; i < N; i++) {
			int a = A[i];
			addTOBucket(lower, higher, a);
			rebalance(lower, higher);
			res[i] = getMedian(lower, higher);
		}

		for (int i = 0; i < N; i++) {
			System.out.println(res[i]);
		}
		//System.out.println(lower);
		//System.out.println(higher);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = in.nextInt();
		}
		processArr(A, N);
		in.close();
	}

}
