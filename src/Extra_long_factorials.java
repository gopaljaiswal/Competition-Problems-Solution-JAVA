import java.math.BigInteger;
import java.util.Scanner;
public class Extra_long_factorials {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		System.out.println(get_fact(N));
	}
	
	public static String get_fact(int N){
		BigInteger fact=new BigInteger("1");
		for(int i=1;i<N;i++){
			fact=fact.multiply(new BigInteger(i+""));
		}
		return fact.toString(); 
	}

}
