import java.util.Scanner;
public class The_Coin_Change_Problem {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int M=in.nextInt();
		int[] A=new int[M];
		for(int i=0;i<M;i++){
			A[i]=in.nextInt();
		}
		System.out.println(count(A,M,N));
	}
	public static int count(int[] S,int m,int n){
		int i, j, x, y;
	     int[][] table=new int[n+1][m];
	    for (i=0; i<m; i++)
	        table[0][i] = 1;  
	    for(i=1;i<n+1;i++)
	    {
	        for(j=0;j<m;j++)
	        {
	            x = (i-S[j] >= 0)? table[i - S[j]][j]: 0;
	            y = (j >= 1)? table[i][j-1]: 0;
	            table[i][j] = x + y;
	        }
	    }
	    return table[n][m-1];
	}
}
