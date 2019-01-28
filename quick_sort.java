import java.util.Scanner;
public class quick_sort {
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			int size=in.nextInt();
			int[] a=new int[size];
			for(int i=0;i<size;i++){
				a[i]=in.nextInt();
			}
			quick(a,0,size-1);
			for(int i=0;i<size;i++){
				System.out.println(a[i]);
			}
		}
		static void quick(int[] a,int low,int up){
			int pivotloc;
			if(low>=up)
				return;
			pivotloc=partition(a,low,up);
			quick(a,pivotloc+1,up);
			quick(a,low,pivotloc-1);
		}
		static int partition(int[] a,int low,int up){
			int i=low;
			int pivot=a[up];
			for(int j=low;j<up;j++){
				if(a[j]<pivot){
					i++;
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				int temp=a[j];
				a[j]=pivot;
				pivot=temp;
				//i++;
				}
				return i;
}}