import java.util.Scanner;
public class Max_Arr_Sum {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		long sum=0L;
		int sum1=0;
		for(int j=0;j<N;j++){
			int[] B=rotate(A);
			for(int i=0;i<N;i++){
				sum1+=(i*B[i]);
			}
			if(sum1>sum){
				sum=sum1;
			}
				sum1=0;
				A=B;
			}
		System.out.println(sum);
	}
	public static int[] rotate(int A[]){
		int[] B=new int[A.length];
		B[0]=A[A.length-1];
		for(int i=1;i<A.length;i++){
			B[i]=A[i-1];
		}
		return B;
	}
}
