import java.util.Arrays;
import java.util.Scanner;
public class Count_of_Max {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
		int N=in.nextInt();
		int[] a=new int[N];
		for(int l=0;l<N;l++){
			a[l]=in.nextInt();
		}
		display_max(a);
		}}
		
	public static void display_max(int[] a){
		int M=a[0];
		int t=0;
		for(int i=0;i<a.length;i++){
			int q=0;
			int p=a[i];
			for(int j=0;j<a.length;j++){
				if(p==a[j]){
					q++;
				}
			}
			if(q>t){
				t=q;
				M=p;
			}else if(q==t)
			{
				if(p<M){
					t=q;
					M=p;
				}
			}
			
		}
		System.out.println(M+" "+t);
	}

}
