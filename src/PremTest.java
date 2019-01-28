public class PremTest {

	public static void main(String[] args) {
		int a = 78;
		int b = 195378678;
		System.out.println(solution(a, b));
	}

	public static int solution(int a, int b) {
		int leftMost = 0;
		String str1 = a + "";
		String str2 = b + "";
		leftMost = str2.indexOf(str1);
		return leftMost;
	}
}
