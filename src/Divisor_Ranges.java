import java.util.*;
public class Divisor_Ranges {
//	 static int sum=0;
	public static void main(String[] args)throws Exception{ 
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int K=in.nextInt();
			get_divisor(A,K);
		}
	}	
	public static void get_divisor(int[] A,int K){
		long sum=0;
		int i=0;
		int j;
		while(i<A.length){
			if(A[i]%K==0){
				int p=0;
				for(j=i;j<A.length;j++){
					if(A[j]%K!=0){
						break;
					}p++;
				}
				System.out.println(sum);
				sum+=get_sum(p);
				i=j;
			}
			i++;
		}	
		System.out.println(sum);
	}
	public static long get_sum(long l){
		long sum=0;
		for(int i=1;i<=l;i++){
			sum+=l;
		}
		return sum;
	}
}