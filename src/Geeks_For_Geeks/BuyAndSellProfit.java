/**
 * 
 */
package Geeks_For_Geeks;

/*package whatever //do not write package name here */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BuyAndSellProfit {
	public static class Item {
		int buy;
		int sell;

		public Item(int buy, int sell) {
			this.buy = buy;
			this.sell = sell;
		}
	}

	public static void maxProfile(int[] A, int N) {
		List<Item> items = new ArrayList<Item>();
		int i = 0;

		while (i < N - 1) {
			int buy = 0;
			int sell = 0;

			while (i < N - 1 && A[i + 1] < A[i]) {
				i++;
			}
			if (i == N - 1) {
				break;
			}

			buy = i;
			i++;

			while (i < N && A[i] > A[i - 1]) {
				i++;
			}
			sell = i - 1;

			items.add(new Item(buy, sell));
		}

		if (items.size() == 0) {
			System.out.println("No Profit");
			return;
		}
		for (Item i1 : items)
			System.out.print("(" + i1.buy + " " + i1.sell + ") ");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int N = in.nextInt();
			int[] A = new int[N];
			for (int i = 0; i < N; i++) {
				A[i] = in.nextInt();
			}
			maxProfile(A, N);
			System.out.println();
		}
		in.close();
	}
}