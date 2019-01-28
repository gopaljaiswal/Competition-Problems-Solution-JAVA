import java.util.*;
public class Eulers_Creteria {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int A=in.nextInt();
			int p=in.nextInt();
			get_result(A,p);
			
		}
	}

	public static void get_result(int A,int p){
		int q=(p-1)/2;
		int q1=modulo(A,q,p);
		//System.out.println(q1);
		 if(q1%p==1){
			 System.out.println("YES");
		 }else{
			 System.out.println("NO");
		 }
	}
	public static int modulo(int a,int b,int c) {
	    long x=1;
	    long y=a;
	    while(b > 0){
	        if(b%2 == 1){
	            x=(x*y)%c;
	        }
	        y = (y*y)%c; // squaring the base
	        b /= 2;
	    }
	    return (int) x%c;
	}
}
