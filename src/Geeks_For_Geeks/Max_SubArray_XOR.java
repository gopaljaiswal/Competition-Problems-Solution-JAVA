//Find the maximum subarray XOR in a given array
package Geeks_For_Geeks;
import java.util.Scanner;
public class Max_SubArray_XOR {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		System.out.println(maxSubarrayXOR(A,N));
		in.close();
	}
	public static int maxSubarrayXOR(int arr[], int n)
	{
	    int ans = Integer.MIN_VALUE;     
	    for (int i=0; i<n; i++)
	    {
	        int curr_xor = 0;
	        for (int j=i; j<n; j++)
	        {
	            curr_xor = curr_xor ^ arr[j];
	            ans = Math.max(ans, curr_xor);
	        }
	    }
	    return ans;
	}
}