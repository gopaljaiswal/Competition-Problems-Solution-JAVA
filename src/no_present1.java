import java.util.Arrays;
import java.util.Scanner;
public class no_present1 {
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			int n=in.nextInt();
			int[] a=new int[n];
			int count=0;
			for(int i=0;i<n;i++){
				a[i]=in.nextInt();
			}
			Arrays.sort(a);;
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
						count=count+1;
				}
				System.out.printf("%d ",count);
				count=0;
			}
		}
}
