import java.util.Scanner;
public class Xsquare_maths {
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			int N=in.nextInt();
			long[] p=new long[N];
			long X=1;
			for(int i=0;i<N;i++){
				p[i]=in.nextLong();
				X*=p[i];
				X=X%1000000007;
			}
			check(X);
		}
		static void check(long X){
			int count=0;
			long a=(long)Math.sqrt(X);
			X=X-(long)Math.pow(a,2);
			if(X==0){
				count+=4;
			}else{
				
			}
			
		}
}
