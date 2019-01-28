import java.util.Scanner;
public class walk_axis {
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			int T=in.nextInt();
			for(int i=0;i<T;i++){
				long n=in.nextInt();
				long result=n+(long)(n*(n+1)/2);
				System.out.println(result);
			}
		}
			/*static void check(int N){
				int dist=0;
				for(int i=0,j=N;i<N && j>i;i++,j--){
					dist+=2*(j-i);
				}
			}*/

}
