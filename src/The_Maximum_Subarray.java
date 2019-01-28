import java.util.Arrays;
import java.util.Scanner;
public class The_Maximum_Subarray {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			int[] A=new int[N];
			int p=0,sum=0;
			for(int j=0;j<N;j++){
				A[j]=in.nextInt();
				if(A[j]>0){
					sum+=A[j];
					}else{p++;}
			}
			if(p==N || N==1){
				Arrays.sort(A);
				System.out.println(A[A.length-1]+" "+A[A.length-1]);
			}
			else{get_sum(A,sum);}
		}
	}
	public static void get_sum(int[] arr,int sum){
	    {   int maxSoFar = arr[0], maxEndingHere = arr[0];
	    for (int i = 1; i < arr.length; i++)
	    {
	        /* calculate maxEndingHere */
	        if (maxEndingHere < 0)
	            maxEndingHere = arr[i];
	        else
	            maxEndingHere += arr[i];

	        /* calculate maxSoFar */
	        if (maxEndingHere >=maxSoFar)
	            maxSoFar = maxEndingHere;
	    	}
	       System.out.println(maxSoFar+" "+sum);
	    }    
}}