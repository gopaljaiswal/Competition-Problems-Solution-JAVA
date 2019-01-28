import java.util.Scanner;
public class Merge_Sort {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		merge_sort(A,0,N-1);
		for(int i=0;i<N;i++){
			System.out.println(A[i]);
		}
	}
	public static void merge_sort(int[] A,int low,int high){
		if(low<high){
		int mid=low+(high-low)/2;
		merge_sort(A,low,mid);
		merge_sort(A,mid+1,high);
		merge(A,low,mid,high);
	}}
	public static void merge(int[] A,int low,int mid,int high){
		int[] B=new int[high+1];
		for(int i=low;i<=high;i++){
			B[i]=A[i];
		}
		int i=low;
		int j=mid+1;
		int k=low;
		while(i<=mid && j<=high){
			if(B[i]<B[j]){
				A[k]=B[i];
				i++;
			}else{
				A[k]=B[j];
				j++;
			}
			k++;
		}
		while(i<=mid){
			A[k]=B[i];
			i++;
			k++;
		}
	}
}