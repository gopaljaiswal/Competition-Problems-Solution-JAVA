package New_Code_Tym;
import java.util.Stack;

/**
 * 
 */

/**
 * @author gopaljaiswal
 *
 */
public class Braces {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] values = { "[{]}" };

		for (String s : braces(values)) {
			System.out.println(s);
		}
	}

	static String[] braces(String[] values) {
		String[] ans = new String[values.length];

		for (int i = 0; i < values.length; i++) {
			ans[i] = isBalanced(values[i]) == true ? "YES" : "NO";
		}
		return ans;
	}

	static boolean isBalanced(String s) {
		Stack<Character> stack = new Stack<Character>();

		for (char c : s.toCharArray()) {
			if (c == '{')
				stack.push('}');
			else if (c == '(')
				stack.push(')');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
			System.out.println(c + "    " + stack);
		}
		return stack.isEmpty();
	}

}
