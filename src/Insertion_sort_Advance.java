import java.util.Scanner;
public class Insertion_sort_Advance {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			int[] a=new int[N];
			for(int j=0;j<N;j++){
				a[j]=in.nextInt();
			}
			no_of_shift(a);
		}
	}
	public static void no_of_shift(int[] ar){    
	    	long count=0;
	    	for(int i=1;i<ar.length;i++){
	    		int min=ar[i];
	    		for(int j=i-1;j>=0 && ar[j]>min;j--){
	    				ar[j+1]=ar[j];
	    				ar[j]=min;
	    				count++;
	    		}
	    	}
	    	System.out.println(count);
	    }
}