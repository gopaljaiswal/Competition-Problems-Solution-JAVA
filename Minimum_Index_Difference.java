import java.util.*;
public class Minimum_Index_Difference {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] A=new int[N];
		int[] B=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		for(int i=0;i<N;i++){
			B[i]=in.nextInt();
		}
		
		int min_in=Integer.MAX_VALUE;
		int min_val=Integer.MAX_VALUE;
		for(int i=0;i<N;i++){
			int p=A[i];
			for(int j=0;j<N;j++){
				if(p==B[j]){
					int k=Math.abs(j-i);
					if(k<min_in){
						min_in=k;
						min_val=p;	
						//break;
					}else if(k==min_in){
						if(p<min_val){
							min_val=p;
						}
					}
					//break;
				}
			}
		}
		System.out.println(min_val+" "+ min_in);
		
		in.close();
	}
}