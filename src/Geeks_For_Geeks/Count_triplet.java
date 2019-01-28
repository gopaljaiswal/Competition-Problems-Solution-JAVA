package Geeks_For_Geeks;
import java.util.Arrays;
import java.util.Scanner;
////////////////////////////////////////////////////////////////////////////////////////////////
public class Count_triplet {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		int sum=in.nextInt();
		System.out.println(no_tuplet(A,A.length,sum));
	}
//////////////////////////////////////////////////////////////////////////////////////////////
	public static int no_tuplet(int[] A,int N,int sum){
		int ans=0;
		Arrays.sort(A);
		for(int i=0;i<N-2;i++){
			int j=i+1,k=N-1;
			while(j<k){
				if((A[i]+A[j]+A[k])>=sum){
					k--;
				}else{
					ans+=(k-j);
					j++;
				}
			}
		}
		return ans;
	}
}
////////////////////////////////////////////////////////////////////////////////////////////////