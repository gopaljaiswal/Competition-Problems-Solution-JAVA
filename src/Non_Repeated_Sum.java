import java.util.Scanner;
public class Non_Repeated_Sum {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		int[] B=new int[N];
		int sum=0;
		for(int i=0;i<N;i++){
			int p=A[i];
			for(int j=0;j<N;j++){
				if(p==A[j]){
					B[i]=1;
					break;
				}else{
					B[i]=0;
				}
			}
		}
		for(int i=0;i<N;i++){
			if(B[i]==0){
				sum+=A[i];
			}
		}
		System.out.println(sum);
	}
}
