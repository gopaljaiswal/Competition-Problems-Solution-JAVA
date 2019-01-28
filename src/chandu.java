import java.util.Scanner;
import java.lang.Math;
public class chandu {
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			int T=in.nextInt();
			long sum=0;
			for(int i=0;i<T;i++){
				String str=in.next();
				sum=check(str);
				System.out.println(sum);
			}
		}
		static long check(String str){
			//long sum=1;
			int p=0;
			long sum=0;
			int c=1000000007;
			for(int i=0;i<str.length();i++){
				char d=str.charAt(i);
				for(int j=i+1;j<str.length();j++){
					if(d==str.charAt(j)){
						p=j-i;
						sum+=modulo(2,p,c);	
						break;
					}
					
			}
				}
				return(sum);
		}

		static long modulo(int a,long b,long c) {
		    long x=1;
		    long y=a;
		    while(b > 0){
		        if(b%2 == 1){
		            x=(x*y)%c;
		        }
		        y = (y*y)%c;
		        b /= 2;
		    }
		    return  x%c;
		}
}



