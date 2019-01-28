import java.util.Arrays;
import java.util.Scanner;
public class no_present{
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			int size=in.nextInt();
			int[] a=new int[size];
			int count=in.nextInt();
			for(int i=0;i<size;i++){
				a[i]=in.nextInt();
			}
			Arrays.sort(a);
			for(int i=0;i<size;i++){
				int min=a[i];
				for(int j=0;j<size;j++){
					if(min==a[j]){
						count=count+1;
					}
				}
				System.out.println(min);
				//System.out.println(count);
				count=0;
			}
		}

}
