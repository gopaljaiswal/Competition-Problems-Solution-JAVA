import java.util.Scanner;
public class remove_zero {
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			int N=in.nextInt();
			int[] a=new int[N];
			for(int i=0;i<N;i++){
				a[i]=in.nextInt();
			}
			remov_zero(a);
		}
		public static void remov_zero(int[] a){
			int m=0;
			int[] b=new int[a.length];
			for(int i=0;i<a.length;i++){
				if(a[i]!=0){
					b[m++]=a[i];
				}
			}
			for(int j=0;j<m;j++){
				System.out.println(b[j]);
			}
		}
}
