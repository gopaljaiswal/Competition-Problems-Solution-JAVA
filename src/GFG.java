import java.util.Scanner;

class GFG {

	public static int bst(int[] A, int l1, int r1, int K) {

		int l = l1;
		int r = r1;
		while (l <= r) {
			int mid = (l + r) / 2;
			if (A[mid] == K) {
				return mid;
			} else if (A[mid] > K && K > A[l]) {
				r = mid - 1;
			} else if (A[mid] > K && K < A[l]) {
				l = mid - 1;
			} else if (A[mid] < K) {
				l = mid + 1;
			}
			System.out.println(l + " " + r + " " + mid);
		}
		return l;
	}

	public static int getRes(int[] A, int rotPt, int N, int K) {
		int res = -1;
		res = bst(A, 0, N, K);
		return res;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int N = in.nextInt();
			int rotPt = -1;
			int[] A = new int[N];
			A[0] = in.nextInt();
			for (int i = 1; i < N; i++) {
				A[i] = in.nextInt();
				if (A[i] < A[i - 1]) {
					rotPt = i - 1;
				}
			}
			int K = in.nextInt();
			System.out.println(getRes(A, rotPt, N - 1, K));
		}
		in.close();
	}
}