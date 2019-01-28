import java.util.Arrays;
import java.util.Scanner;
public class counting_sort3 {
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			int T=in.nextInt();
			int[] a=new int[T];
			int count=0;
			String[] str=new String[T];
			for(int i=0;i<T;i++){
				a[i]=in.nextInt();
				str[i]=in.next();
			}
			Arrays.sort(a);
			//int p=a[0];
			int q=a[T-1];
			for(int i=0;i<100;i++){
				if(i<=q){
					for(int j=0;j<a.length;j++){
						if(i==a[j]){
						count=count+1;
					}}
					System.out.printf("%d ",count);
				}
					else{
						System.out.printf("%d ",count);
					}
						
					
				}
			}
}
