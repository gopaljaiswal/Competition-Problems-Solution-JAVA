import java.util.Scanner;
import java.util.Arrays;
public class chief_hopper {
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			int N=in.nextInt();
			int[] h=new int[N];
			for(int i=0;i<N;i++){
				h[i]=in.nextInt();
			}
			
			int min=h[0];
			for(int i=1;i<N;i++){
				if(h[i]>min && min>0){
				min=min+(h[i]-min);}
				else{
					min=min+(min-h[i]);
				}
			}
			System.out.println(min);
		} 
}
