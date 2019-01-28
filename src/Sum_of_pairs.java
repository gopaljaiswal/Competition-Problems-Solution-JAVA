import java.util.Scanner;
public class Sum_of_pairs {
	public static void main(String[] args)throws Exception{
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		Display_max(A);
	}
	
	public static void Display_max(int[] A){
		long p=0L;
		for(int i=1;i<A.length;i++){
			int t=0;
			int sum=A[i]+A[i-1];
			for(int j=1;j<A.length;j=j+2){
				if(sum==A[j-1]+A[j]){
					t=t+2;
				}
			}
			if(t>p){
				p=t;
			}
			
		}
		System.out.println(p);
	} 

}
