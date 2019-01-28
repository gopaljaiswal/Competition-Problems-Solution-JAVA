package Geeks_For_Geeks;
import java.util.Arrays;
import java.util.Scanner;
public class Max_min_form {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N1=in.nextInt();
		int[] A=new int[N1];
		for(int i=0;i<N1;i++){
			A[i]=in.nextInt();
		}
		int[] B=new int[N1];
		B=A;
		Arrays.sort(A);
		for(int i=0,j=A.length-1;i<A.length || j>=0;i+=2,j-=2){
			System.out.print(A[j]+","+A[i]+",");
		}
		in.close();
	}
}
