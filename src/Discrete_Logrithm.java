import java.util.Scanner;
public class Discrete_Logrithm {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int a=in.nextInt();
			int b=in.nextInt();
			int g=in.nextInt();
			get_Log(a,b,g);
		}
	}
	public static void get_Log(int a,int b,int g){
		boolean flag=false;
		int i=1;
		while(true){
			if(modulo(a,i,g)==b){
				System.out.println(i);
				flag=true;
				break;
			}
			i++;
		}
		if(flag==false){
			System.out.println("-1");
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
