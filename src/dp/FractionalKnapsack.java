/**
 * 
 */
package dp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author gopaljaiswal
 *
 */
public class FractionalKnapsack {

	static class Item {
		int val, wt;

		public Item(int val, int wt) {
			this.val = val;
			this.wt = wt;
		}
	}

	public static double fractionalKnapsack(int W, Item[] arr, int n) {
		Arrays.sort(arr, new Comparator<Item>() {
			@Override
			public int compare(Item o1, Item o2) {
				return o2.val / o2.wt - o1.val / o1.wt;
			}
		});

//		for (int i = 0; i < n; i++) {
//			System.out.println(arr[i].val + "  " + arr[i].wt);
//		}

		int currentWt = 0;
		double finalVal = 0.0;
		for (int i = 0; i < n; i++) {
			if (currentWt + arr[i].wt <= W) {
				currentWt += arr[i].wt;
				finalVal += arr[i].val;
			} else {
				int remain = W - currentWt;
				finalVal += arr[i].val * (double) remain / arr[i].wt;
				break;
			}
		}
		return finalVal;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int t = 0; t < T; t++) {
			int n = in.nextInt();
			int W = in.nextInt();
			Item[] arr = new Item[n];
			for (int i = 0; i < n; i += 1) {
				int val = in.nextInt();
				int wt = in.nextInt();
				Item item = new Item(val, wt);
				arr[i] = item;
			}
			System.out.printf("%.2f\n", fractionalKnapsack(W, arr, n));
		}
		in.close();
	}

}
