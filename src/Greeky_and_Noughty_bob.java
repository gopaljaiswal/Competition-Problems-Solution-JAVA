import java.math.BigInteger;
import java.util.Scanner;
public class Greeky_and_Noughty_bob {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String factorial=fact(n);
		System.out.println(factorial);
	}

	public static String fact(int n) {
	       BigInteger fact = new BigInteger("1");
	       for (int i = 1; i <= n; i++) {
	           fact = fact.multiply(new BigInteger(i + ""));
	       }
	       return fact.toString();
	   }
}
