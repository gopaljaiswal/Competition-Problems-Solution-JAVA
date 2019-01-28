//
import java.util.Arrays;
import java.util.Scanner;
public class Gotta_catch {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		Arrays.sort(A);
		int[] B=new int[N];
		int j=0;
		for(int i=A.length-1;i>=0;i--){
			B[j]=A[i];
			j++;
		}
		int first=B[0]+1;
		int o=1,x=0;
		while(o<B.length){
			x=B[o]+1+o;
			if(x>first){
				first=x;
			}
			o++;
		}
		System.out.print(first+1);
		in.close();
	}
}
