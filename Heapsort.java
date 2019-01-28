import java.util.Scanner;
public class Heapsort {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
		}
		build(0,A);
		display(A);
		System.out.println("Enter value to remove");
	}
	
	public static void build(int low,int[] A){
		if(low<A.length)
		{
			//System.out.println(low+" "+A.length);
			int j=max(low,A);
			//System.out.println(low+" "+j);
			if(j>low){
				//System.out.println(low+" "+j);
				int temp=A[j];
				A[j]=A[low];
				A[low]=temp;
				low++;
			}
			else
			{
				low++;
			}
			System.out.println(low+" "+j);
				build(low,A);
		}
	}
	
	public static int max(int low,int[] A){
		int max=A[low];
		int j = 0;
		for(int i=low;i<A.length;i++){
			if(max<A[i]){
				max=A[i];
				j=i;
			}
		} 
		return j;
	}
	
	public static void display(int[] A){
		for(int i=0;i<A.length;i++){
			System.out.print(A[i]+"  ");
		}
	}
}
