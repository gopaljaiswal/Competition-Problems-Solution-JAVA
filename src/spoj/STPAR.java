/**
 * 
 */
package spoj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author gopaljaiswal
 *
 */
public class STPAR {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		while (true) {
			Integer N = Integer.parseInt(reader.readLine());
			if (N == 0) {
				break;
			} else {
				int i = 0;
				int[] A = new int[N];
				for (String str : reader.readLine().split(" ")) {
					A[i++] = Integer.parseInt(str);
				}
				getCal(A);
			}
		}
		reader.close();
	}

	public static void getCal(int[] A) {
		List<Integer> ll = new ArrayList<Integer>();
		Stack<Integer> st = new Stack<Integer>();

		for (int i = 1; i < A.length; i++) {

			int p = A[i - 1];
			int q = A[i];

			if (p > q) {
				while (st.size() > 0 && st.peek() < p) {
					ll.add(st.pop());
				}
				st.push(p);
			} else {
				while (st.size() > 0 && st.peek() < p) {
					ll.add(st.pop());
				}
				ll.add(p);
			}
		}

		while (st.size() > 0 && st.peek() < A[A.length - 1]) {
			ll.add(st.pop());
		}
		st.push(A[A.length - 1]);

		while (st.size() != 0) {
			ll.add(st.pop());
		}

		Boolean flag = true;
		for (int i = 1; i < ll.size(); i++) {
			if (ll.get(i) < ll.get(i - 1)) {
				flag = false;
				break;
			}
		}
		if (flag == false) {
			System.out.println("no");
		} else if (flag == true) {
			System.out.println("yes");
		}
	}
}
