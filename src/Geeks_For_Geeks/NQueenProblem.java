/**
 * 
 */
package Geeks_For_Geeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @author gopaljaiswal
 *
 */
public class NQueenProblem {

	public void queenDfs(int row, Set<Integer> col, Set<Integer> diag1,
			Set<Integer> diag2, List<List<String>> res, int N, List<String> list) {
		if (row == N) {
			res.add(new ArrayList<String>(list));
			return;
		}

		for (int i = 0; i < N; i++) {
			if (col.contains(i) || diag1.contains(row + i)
					|| diag2.contains(row - i)) {
				continue;
			}

			char[] charArr = new char[N];
			Arrays.fill(charArr, '.');
			charArr[i] = 'Q';

			String s = new String(charArr);

			col.add(i);
			diag1.add(row + i);
			diag2.add(row - i);

			list.add(s);

			queenDfs(row + 1, col, diag1, diag2, res, N, list);
			list.remove(list.size() - 1);
			col.remove(i);
			diag1.remove(row + i);
			diag2.remove(row - i);
		}
	}

	public List<List<String>> queen(int N) {
		Set<Integer> col = new HashSet<Integer>();
		Set<Integer> diag1 = new HashSet<Integer>();
		Set<Integer> diag2 = new HashSet<Integer>();

		List<String> list = new ArrayList<String>();
		List<List<String>> res = new ArrayList<List<String>>();
		queenDfs(0, col, diag1, diag2, res, N, list);
		return res;
	}

	public static void main(String[] args) {
		NQueenProblem nQueenProblem = new NQueenProblem();
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T-- > 0) {
			int N = in.nextInt();
			System.out.println(nQueenProblem.queen(N));
		}
		in.close();
	}

}
