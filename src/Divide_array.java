import java.util.Scanner;
public class Divide_array {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		int b=0;
		for(int i=0;i<1-1;i++){
			A[b++]=A[i];
		}
		for(int j=1;j<N;j++){
			A[b++]=A[j];
		}
		for(int i=0;i<b;i++){
		System.out.println(A[i]);
		}
	}

}
