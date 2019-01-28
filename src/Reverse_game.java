import java.util.Scanner;
public class Reverse_game {
	public static void main(String[] args){
		    Scanner in=new Scanner(System.in);
		    int T=in.nextInt();
		    for(int j=0;j<T;j++){
		    int N=in.nextInt();
		    int K=in.nextInt();
		    int[] A=new int[N];
		    for(int i=0;i<N;i++){
		    	A[i]=i;
		    }
		 for(int k=0;k<N;k++){   
		 A=reverse_Array(A,k);}
		for(int i=0;i<N;i++){
			//System.out.print(A[i]+" ");
		if(A[i]==K){
			System.out.println(i);
		} 	
		}
		 //System.out.println();
		}
		 }

	public static int[] reverse_Array(int[] A,int m){
		int[] B=new int[A.length];
		int p=0;
		for(int i=0;i<m;i++){
			B[p++]=A[i];
		}
		for(int i=A.length-1;i>=m;i--){
			B[p++]=A[i];
		}
		return B;
	}
}