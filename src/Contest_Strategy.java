import java.util.Arrays;
import java.util.Scanner;
public class Contest_Strategy {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			int D=in.nextInt();
			int[] t=new int[N];
			for(int j=0;j<N;j++){
				t[j]=in.nextInt();
			}
			Arrays.sort(t);
			int sum=D;
			for(int q=1;q<N;q+=2){
				sum+=t[q];
			}
			System.out.println(sum);
		}
	}
}
