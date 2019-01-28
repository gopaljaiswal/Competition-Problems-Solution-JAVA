import java.util.Arrays;
import java.util.Scanner;
public class mark_and_toys {
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			int N=in.nextInt();
			int K=in.nextInt();
			int[] a=new int[N];
			for(int i=0;i<N;i++){
				a[i]=in.nextInt();
			}
			int count=1;
			Arrays.sort(a);
			for(int i=1;i<a.length;i++){
				if(a[i-1]+a[i]<=K){
					count=count+1;
				}
			}
			System.out.println(count);
		}
}
