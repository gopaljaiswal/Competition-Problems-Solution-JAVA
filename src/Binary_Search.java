import java.util.Arrays;
import java.util.Scanner;
public class Binary_Search {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int K=in.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		System.out.println(Arrays.binarySearch(A,K));
		int im=BST(A,K);
		System.out.println(im);
	}
	
	public static int BST(int[] A,int K){
		int low=0,high=A.length-1;
		while(low<=high){
			int mid=low+(high-low)/2;
			if(A[mid]==K){
				return mid;
			}else if(A[mid]<K){
				low=mid+1;
			}else{
				high=mid-1;
			}
		}return -1;
	}

}
