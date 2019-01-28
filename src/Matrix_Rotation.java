import java.util.Scanner;
public class Matrix_Rotation {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int M=in.nextInt();
		int N=in.nextInt();
		int R=in.nextInt();
		int[][] A=new int[M][N];
		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++){
				A[i][j]=in.nextInt();
			}
		}	
		get_rotate(A,M/2,N/2,R);
	}
	
	public static void get_rotate(int[][] A,int M,int N,int R){
		  for(int i=0;i<M;i++){
			  for(int j=0;j<N;j++){
				  int p=R+i+j;
				  if((p==2*M)){
					  
				  }
			  }
		  }
	}
}
