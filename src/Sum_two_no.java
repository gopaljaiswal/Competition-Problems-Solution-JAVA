import java.math.BigInteger;
import java.util.Scanner;
public class Sum_two_no {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		long N=in.nextLong();
		for(int i=0;i<N;i++){
			BigInteger a=in.nextBigInteger();
			BigInteger b=in.nextBigInteger();
			System.out.print(a.add(b));
			System.out.println();
		}
	}

}
