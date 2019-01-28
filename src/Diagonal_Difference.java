import java.util.Scanner;
public class Diagonal_Difference {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[][] A=new int[N][N];
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				A[i][j]=in.nextInt();
			}
		}
		get_diff(A);
	}

public static void get_diff(int[][] A){
	long l=0,r=0;
	for(int i=0;i<A.length;i++){
		l+=A[i][i];
	}
	int j=A.length-1;
	for(int i=0;i<A.length;i++){
		r+=A[i][j];
		j--;
	}
	System.out.println(Math.abs(l-r));
}
}