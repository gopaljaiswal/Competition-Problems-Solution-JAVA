import java.util.Scanner;
public class Flatland_Space_Stations {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int M=in.nextInt();
		int[] C=new int[M];
		for(int i=0;i<M;i++){
			C[i]=in.nextInt();
		}
		int[] P=new int[N];
		for(int i=0;i<N;i++){
			int min=N;
			for(int j=0;j<M;j++){
				int diff=Math.abs(i-C[j]);
				if(diff<min){
					min=diff;
				}
			}
			P[i]=min;
		}
		
		int max=0;
		for(int i=0;i<N;i++){
			if(P[i]>max){
				max=P[i];
			}
			//System.out.println(P[i]);
		}
		System.out.println(max);
	}
}