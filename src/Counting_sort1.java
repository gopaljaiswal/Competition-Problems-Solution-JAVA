import java.util.Scanner;
public class Counting_sort1 {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] a=new int[N];
		for(int i=0;i<N;i++){
			a[i]=in.nextInt();
		}
		for(int j=0;j<100;j++){
			int p=0;
			for(int i=0;i<N;i++){
		    	if(j==a[i]){
				p++;
			   }
		    }
			System.out.print(p+" ");
			}
	}

}
