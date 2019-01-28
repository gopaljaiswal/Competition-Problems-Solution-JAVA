package New_Code_Tym;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class KthLargestFreq {
	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tt;
		tt = Integer.parseInt(in.readLine());

		while (tt-- > 0) {
			String A = in.readLine();

			int dp[] = new int[26];
			for (int i = 0; i < A.length(); i++) {
				dp[A.charAt(i) - 'a']++;
			}

			int k = Integer.parseInt(in.readLine());

			List<Pair> temp = new ArrayList<Pair>();
			for (int i = 0; i < 26; i++) {
				temp.add(new Pair(dp[i], i));
			}

			Collections.sort(temp, new Comparator<Pair>() {
				@Override
				public int compare(final Pair a, Pair b) {
					// TODO return 1 if rhs should be before lhs
					// return -1 if lhs should be before rhs
					// return 0 otherwise
					if (a.x > b.x) {
						return -1;
					} else if (a.x < b.x)
						return 1;
					else {
						if (a.y < b.y)
							return -1;
						return 1;
					}
				}
			});

			 for(int i=0;i<26;i++) {
			 System.out.println(temp.get(i).x + " " + temp.get(i).y);
			 }

			int x = 1;
			int ans = -1;
			int prev = temp.get(0).x;
			for (int i = 0; i < 26; i++) {
				if (temp.get(i).x == 0)
					break;
				if (prev != temp.get(i).x) {
					x++;
					prev = temp.get(i).x;
				}
				if (x == k) {
					ans = temp.get(i).y;
					break;
				}

			}

			if (ans == -1)
				System.out.println(-1);
			else
				System.out.println((char) (ans + 'a'));
		}
	}

	static class Pair {
		int x;
		int y;

		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

}

//testcase
///1
//aabcd
//2
