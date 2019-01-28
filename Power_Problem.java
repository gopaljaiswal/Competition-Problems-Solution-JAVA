//import java.util.Scanner;
//public class Power_Problem {
//	public static void main(String[] args){
//		Scanner in=new Scanner(System.in);
//		int T=in.nextInt();
//		for(int i=0;i<T;i++){
//			int a=in.nextInt();
//			int b=in.nextInt();
//			int c=in.nextInt();
//			int d=in.nextInt();
//			f(a,b,c,d);
//		//int c=1000000007;
//		}
//		in.close();
//	}
//		
//	public static void f(int a,int b,int c,int d){
//		int e=1000000007;
//		int g=bin(a,b, e);
//		int p=bin(c,d, e);
//		modulo(g,p, e);
//	}
//	
//	public stat
//	
//	public static int modulo(int a,int b,int c) {
//	    long x=1;
//	    long y=a;
//	    while(b > 0){
//	        if(b%2 == 1){
//	            x=((x%c)*y)%c;
//	        }
//	        y = (y*y)%c;
//	        b /= 2;
//	    }
//	    return (int) x%c;
//	}
//}