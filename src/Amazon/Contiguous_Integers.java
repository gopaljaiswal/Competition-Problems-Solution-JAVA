/**
 * 
 */
package Amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @author gopaljaiswal
 *
 */
public class Contiguous_Integers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			int N = in.nextInt();
			Set<Integer> s = new HashSet<Integer>();
			for (int j = 0; j < N; j++) {
				s.add(in.nextInt());
			}
			List<Integer> list = new ArrayList<Integer>(s);
			Collections.sort(list);
			boolean flag = true;
			for (int j = 1; j < list.size(); j++) {
				if (list.get(j) - list.get(j - 1) != 1) {
					flag = false;
					break;
				}
			}

			if (flag == true) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		in.close();
	}

}
