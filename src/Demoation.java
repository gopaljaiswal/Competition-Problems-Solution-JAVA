import java.util.Arrays;
import java.util.Scanner;

public class Demoation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			System.out.println(count(in.nextInt()));
		}

		in.close();
	}

	public static long count(int n) {
		long table[] = new long[n + 1]; int i=0;

		Arrays.fill(table, 0);

		table[0] = 1;

		for (i = 3; i <= n; i++)
			table[i] += table[i - 3];
		for (i = 5; i <= n; i++)
			table[i] += table[i - 5];
		for (i = 10; i <= n; i++)
			table[i] += table[i - 10];

		return table[n];
	}

}
