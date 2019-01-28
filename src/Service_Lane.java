import java.util.Scanner;
public class Service_Lane {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int T=in.nextInt();
		int[] a=new int[N];
		for(int i=0;i<N;i++){
			a[i]=in.nextInt();
		}
		for(int i=0;i<T;i++){
			int c=in.nextInt();
			int d=in.nextInt();
			vehicle_no(c,d,a);
		}
	}
	public static void vehicle_no(int a,int b,int[] num){
		int t=num[a];
		for(int i=a+1;i<=b;i++){
			if(num[i]<t){
				t=num[i];
			}
		}
		System.out.println(t);
	}
}
