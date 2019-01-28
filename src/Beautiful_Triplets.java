import java.util.*;
public class Beautiful_Triplets {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int d=in.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		int count=0;
		for(int i=0;i<N;i++){
			int p=A[i];
			for(int j=i+1;j<N;j++){
				if(A[j]-p==d){
					for(int k=j+1;k<N;k++){
						if(A[k]-A[j]==d){
							count++;
						}
					}
					
				}
			}
		}
		System.out.println(count);
		in.close();
	}
}