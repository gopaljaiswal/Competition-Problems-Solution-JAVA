package New_Code_Tym;

import java.util.*;

public class Reverse_Polish_not {

	/**
	 * Computes the outcome of a given expression in Reverse Polish Notation
	 *
	 * @param expr
	 *            the expression to compute
	 */
	public static void compute(String expr) throws ArithmeticException,
			EmptyStackException {
		Stack<Double> stack = new Stack<>();

		
		for (String token : expr.split("\\s+")) {
			switch (token) {
			case "+":
				stack.push(stack.pop() + stack.pop());
				break;
			case "-":
				stack.push(-stack.pop() + stack.pop());
				break;
			case "*":
				stack.push(stack.pop() * stack.pop());
				break;
			case "/":
				double divisor = stack.pop();
				stack.push(stack.pop() / divisor);
				break;
			case "^":
				double exponent = stack.pop();
				stack.push(Math.pow(stack.pop(), exponent));
				break;
			default:
				stack.push(Double.parseDouble(token));
				break;
			}

		}

		Integer a = stack.pop().intValue();
		System.out.println(a);

	}

	public static void main(String[] args) {
		try {
			String str = "5 1 2 + 4 * + 13 -";
			compute(str);
		} catch (Exception err) {
			System.out.println(err.getMessage());
		}
	}
}