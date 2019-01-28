//correct(hackerEarth)
import java.math.BigInteger;
import java.util.Scanner;
public class Fun_with_factorial {
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			int T=in.nextInt();
			for(int i=0;i<T;i++){
				int N=in.nextInt();
				String fact=factorial(N);
				//System.out.println(fact);
				int length=fact.length();
				if(length<=5){
					for(int j=length+1;j<=5;j++){
						System.out.print("0");
					}
					System.out.println(fact);
							//+" "+length+ " "+fact.charAt(length-1));
				}else{
					for(int j=length-5;j<length;j++){
						System.out.print(fact.charAt(j));
					}
				}
				//System.out.println(fact+" "+length);
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
