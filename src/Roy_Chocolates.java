import java.util.Scanner;
public class Roy_Chocolates {
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			int n=in.nextInt();
			int m=in.nextInt();
			int[] arr=new int[m];
			for(int i=0;i<m;i++){
				arr[i]=in.nextInt();
			}
			int s=arr[0];
			int b=arr[1]-arr[0];
			System.out.print(s+" "+b);
		}
}