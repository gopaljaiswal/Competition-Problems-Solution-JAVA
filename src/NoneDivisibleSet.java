import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class NoneDivisibleSet {

	/**
	 * We will convert this problem to addition from division as handling addition is much easier. We can easily observe that 
	 * sum of two number can only be divisible by k if remainder of these numbers in division to k adds to k. In other words, 
	 * two numbers n1 and n2 are divisible by k if and only if - 
	 * (n1 % k) + (n2 % k) = k
	 * 
	 * We can easily verify this using some examples: 
	 * E.g. n1 = 10, n2 = 12, k = 3. Sum of these numbers is not divisible as 10 % 3 + 12 % 3 = 1 (not equal to k = 3).
	 * Similarly, n1 = 10, n2 = 11, k = 3. Sum of these numbers is divisible as 10 % 3 + 11 % 3 = 3 (equal to k = 3).
	 * 
	 * There are also some special conditions such as -
	 *  1. Remainders for many numbers are 0
	 *  2. Remainders for many numbers are equal to k/2 (only applicable for even values of k)
	 * In both the above cases, we will consider only one of the numbers falling into one of above conditions.
	 */
	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		
		final int n = in.nextInt();
		final int k = in.nextInt();
		
		// Idea is to divide all numbers of set by k and put these to a Map with:
		// 		-	key as remainder of input number and k
		//		-	value as count of input numbers having remainder same as key
		// If we have numbers with remainders as 0 then we will consider only one of those as 
		// subset with one number complies with subset criteria.
		final Map<Integer, Integer> remainders = new HashMap<>();
		for(int i = 0; i < n; i++) {
			int remainder = in.nextInt() % k;
			//System.out.println(remainders.containsKey(remainder),remainders.containsValue(remainder));
			System.out.println(remainders.compute(remainder, (key, value) -> (value == null || key == 0) ? 1 : (value + 1)));
			
		}
		
		// Iterate through all the unique pair of combinations for k and take maximum of numbers count 
		// having remainder same as numbers in combination pair.
		// E.g. 5 has unique combinations - (1,4),(2,3). We will take maximum count out of 1 and 4 and 
		// similarly out of 2 and 3. We will consider one number out of 0 remainders if any.
		int noOfElementsInSubset = remainders.getOrDefault(0, 0);
		int i = 1;
		for(; 2 * i < k; i++) {
			noOfElementsInSubset += Math.max(remainders.getOrDefault(i, 0), remainders.getOrDefault(k - i, 0));
		}
		
		// For even numbers, we will have combination having same numbers. E.g. 6 will have a combination - (3,3). 
		// For this, we will just consider only one number.
		if(2 * i == k) {
			noOfElementsInSubset++;
		}
		
		System.out.println(noOfElementsInSubset);
		
		in.close();
	}
}