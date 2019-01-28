import java.util.Arrays;
import java.util.Scanner;
public class Panda_Max_Product {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		Arrays.sort(A);
		if((A[0]*A[1])>(A[N-2]*A[N-1])){
			System.out.println(A[0]*A[1]);
		}else{
		System.out.println(A[N-2]*A[N-1]);
		}
	}
}
