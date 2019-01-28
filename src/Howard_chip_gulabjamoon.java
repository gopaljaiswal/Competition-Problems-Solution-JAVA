import java.util.Scanner;
import java.util.Arrays;
public class Howard_chip_gulabjamoon {
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			int t=in.nextInt();
			for(int i=0;i<t;i++){
				int count=0;
				int N=in.nextInt();
				int[] g_wt=new int[N];
				int[] c_wt=new int[N];
				for(int j=0;j<N;j++){
					g_wt[j]=in.nextInt();
					c_wt[j]=in.nextInt();
				}
				int l=0;
				Arrays.sort(g_wt);
				Arrays.sort(c_wt);
				for(int k=0;i<N;i++){
					int min=g_wt[k];
					while(l<N){
					if(min<=c_wt[l]){
						count++;
						break;
					}l++;
				}
				
			}
				System.out.println(count);
			
		}

		}}
