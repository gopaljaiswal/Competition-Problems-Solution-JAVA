import java.util.Arrays;
import java.util.Scanner;
public class remove_repeatation_no {
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			int n=in.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=in.nextInt();
			}
			int end=a.length;;
			for(int i=0;i<end;i++){
				for(int j=i+1;j<end;j++){
					if(a[i]==a[j]){
						int shiftleft=j;
						for(int k=j+1;k<end;k++,shiftleft++){
							a[shiftleft]=a[k];
						}
						end--;
						j--;
					}
				}
			}
			for(int i=0;i<end;i++){
				System.out.println(a[i]);
			}
		}
}
