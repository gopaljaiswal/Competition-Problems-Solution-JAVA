import java.util.Arrays;
import java.util.Scanner;
public class Name_string {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		int[] A=new int[3]; 
		for(int i=0;i<T;i++){
			for(int j=0;j<3;j++){
			A[j]=in.nextInt();
			}
			get_no(A);
		}
	}

	public static void get_no(int[] A){
		long p=0;
		Arrays.sort(A);
		int max1=A[1];
		int max2=A[2];
		if(max1>max2){
		System.out.println((2*max2)+1);
		}else if(max2>max1){
			System.out.println((2*max1)+1);
		}else{
			System.out.println(2*max1);
		}
	}
}
