import java.util.Scanner;
import java.math.*;
public class Fombinatorial {
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			int t=in.nextInt();
			for(int i=0;i<t;i++){
				int N=in.nextInt();
				int M=in.nextInt();
				int Q=in.nextInt();
				for(int j=0;j<Q;j++){
					int r=in.nextInt();
					long c=(long)check_fombinatorial(N)/(check_fombinatorial(r)*check_fombinatorial(N-r));
					c=c%M;
					System.out.println(c);
				}
			}
		}
		static long check_fombinatorial(int N){
			//BigInteger mul=new BigInteger("1");		
			long mul=1;
			for(int i=1;i<=N;i++){
						mul*=Math.pow(i,i);
					}
			return mul;
			}
}
