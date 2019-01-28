import java.util.Arrays;
import java.util.Scanner;
public class Priyanka_toys {
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			int N=in.nextInt();
			int[] A=new int[N];
			for(int i=0;i<N;i++){
				A[i]=in.nextInt();
			}
			Arrays.sort(A);
			get_min_cost(A);
		}
	public static void get_min_cost(int[] A){		
			int W=A[0],l=0;
			int count=0;
			while(W<=A[A.length-1]){
				if(A[l]<=W+4){
					l++;
					break;
				}
				W=A[l];
				count++;
			}
			System.out.println(count);
		}
}