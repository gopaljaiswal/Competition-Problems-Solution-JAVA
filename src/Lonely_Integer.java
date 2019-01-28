import java.util.Scanner;

public class Lonely_Integer {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = in.nextInt();
		}
		int res = lonelyInteger(a);
		System.out.println(res);
	}

	static int lonelyInteger(int[] a) {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result ^= a[i];
		}
		return (result);
	}
}
