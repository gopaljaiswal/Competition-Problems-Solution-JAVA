import java.util.Arrays;
import java.util.Scanner;
public class Insertion_sort2 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] a=new int[N];
		for(int i=0;i<N;i++){
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<N;i++){
			System.out.print(a[i]+" ");
		}
	}

}
