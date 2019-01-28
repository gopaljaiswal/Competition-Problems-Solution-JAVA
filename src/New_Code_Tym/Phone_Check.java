package New_Code_Tym;

public class Phone_Check {

	public static void main(String[] args) {
		String str = "123";

		// System.out.println(str.split("-").length);
		if (isValid(str)) {
			System.out.println(str);
		} else {
			if (isCheck(str)) {
				System.out.println(makeVal(str));
			}else{
				//Sys 
			}
		}
	}

	public static boolean isValid(String s) {
		String regex = "\\d{3}-\\d{3}-\\d{4}";
		return s.matches(regex);
	}

	public static String makeVal(String str) {

		String str1 = "";

		String[] A = str.split("-");
		if (A.length == 3) {
			str1 = A[0].substring(0, 3) + "-" + A[1].substring(0, 3) + "-"
					+ A[2].substring(0, 4);
		} else {
			String[] S = str.split(" ");

			str1 = str1 + "(" + S[0].substring(0, 3) + " ";

			String[] S1 = S[1].split("-");

			str1 = str1 + S1[0].substring(0, 3)

			+ "-" + S1[1].substring(0, 4);

		}
		return str1;
	}

	public static boolean isCheck(String str) {
		boolean flag = false;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '-') {
				flag = true;
			}
		}
		return flag;
	}
}
