import java.util.Arrays;
import java.util.Scanner;
public class Closest_no {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] no=new int[n];
		for(int i=0;i<n;i++){
			no[i]=in.nextInt();
		}
		Arrays.sort(no);
		int min=diff_min(no);
		for(int i=1;i<n;i++){
			 if(min==no[i]-no[i-1]){
				 System.out.print(no[i-1]+" "+no[i]+" ");
			 }
		}
	}
	
	
	public static int diff_min(int[] no){
		int min=no[1]-no[0];
		for(int i=2;i<no.length;i++){
			int t=no[i]-no[i-1];
			if(t<min){
				min=t;
			}
		}
		return min;
	} 
}
