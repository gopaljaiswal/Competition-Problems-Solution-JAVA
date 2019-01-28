import java.util.Scanner;
public class Array_Operations_1 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] Arr=new int[N];
		for(int i=0;i<N;i++){
			Arr[i]=in.nextInt();
		}
		int Q=in.nextInt();
		for(int i=0;i<Q;i++){
			int a=in.nextInt();
			if(a==1){
				int l=in.nextInt();
				int r=in.nextInt();
				int A=in.nextInt();
				int D=in.nextInt();
				get_ap(Arr,l,r,A,D);
			}else if(a==2){
				int l=in.nextInt();
				int r=in.nextInt();
				System.out.println(get_sum(Arr,l,r));
			}
		}
		in.close();
	}
	
	public static void get_ap(int[] Arr,int l,int r,int A,int D){
		int q=r-l;
		for(int i=l-1,j=0;j<=q && i<r;i++,j++){
			Arr[i]=Arr[i]+A+j*D;
		}
	}
	
	
	public static long get_sum(int[] A,int l,int r){
		long sum=0L;
		for(int i=l-1;i<r;i++){
			sum+=A[i];
			sum=sum%1000000007;
		}
			return sum;
	}
}