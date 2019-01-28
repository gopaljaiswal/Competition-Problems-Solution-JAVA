import java.util.Arrays;
import java.util.Scanner;
public class counting_sort {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] count=new int[n];
		int[] a=new int[n];
		//String[] str=new String[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
			// str[i]=in.next();
		}
		Arrays.sort(a);
			for(int i=0;i<n;i++){
			int min=a[i];
			for(int j=0;j<n && min==a[j];j++){
					count[i]=count[i]+1;
				}}
			for(int i=0;i<count.length;i++){
				System.out.println(count[i]);
			}
}}
