import java.util.Scanner;
public class Sherlock_GCD {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			int[] a=new int[N];
			for(int j=0;j<N;j++){
				a[i]=in.nextInt();
			}
			display_GCD(a);
		}
	}
	
	public static void display_GCD(int[] a){
		
	}

}
