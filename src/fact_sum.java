//hacker Earth contest program(correct)
import java.math.BigInteger;
import java.util.Scanner;
public class fact_sum {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		int sum=0;
		for(int i=1;i<=T;i++){
			int N=in.nextInt();
			String number=factorial(N);
			for(int j=0;j<number.length();j++){
				sum=sum+(number.charAt(j)-48);
			}
			System.out.println(sum);
			sum=0;
			}
}
	public static String factorial(int n) {
	       BigInteger fact = new BigInteger("1");
	       for (int i = 1; i <= n; i++) {
	           fact = fact.multiply(new BigInteger(i + ""));
	       }
	       return fact.toString();
	   }

}
