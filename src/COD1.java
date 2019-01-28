import java.util.Arrays;
import java.util.Scanner;
public class COD1{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			int M=in.nextInt();
			int[] A=new int[M];
			for(int j=0;j<M;j++){
				A[j]=in.nextInt();
			}
			int l=0;
			long min=0L;
			Arrays.sort(A);
////////////////////////////////////////////////////////////////////////////////////////////////			
			int t=A[l];
			int p=N;
			while(p>0){
				if(t>0){
					min+=t;
				}else{
					l++;
					t=A[l];
					min+=t;
				}
				t--;
				p--;
			}
////////////////////////////////////////////////////////////////////////////////////////////////		
		int p1=N;
		long max=0L;
		int j=A.length-2;
		int t1=A[A.length-1];
		while(p1>0){
			if(t1>=A[j]){
				max+=t1;	
			}
			else{
				j=j-1;
				t1=A[j+1];
				max+=t1;
			}
			t1--;
			p1--;
		}
			System.out.println(max+" "+min);
		}
//////////////////////////////////////////////////////////////////////////////////////////////////		
		in.close();
	}
}
