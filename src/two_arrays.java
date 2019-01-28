import java.util.Arrays;
import java.util.Scanner;
public class two_arrays{
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			int T=in.nextInt();
			//int[] a=new int[1000];
			//int[] b=new int[1000];
			for(int i=0;i<T;i++){
				int N=in.nextInt();
				int[] a=new int[N];
				int[] b=new int[N];
				int K=in.nextInt();
				for(int j=0;j<N;j++){
				a[j]=in.nextInt();}
				for(int j=0;j<N;j++){
				b[j]=in.nextInt();
				}
				Arrays.sort(a);
				Arrays.sort(b);
				result(a,b,K);}
		}
		static void result(int[] a,int[] b,int K){
			boolean flag=true;
			for(int i=0,j=b.length-1;i<a.length && j>=0;i++,j--){
				if(a[i]+b[j]<K){
					flag=false;
					break;
				}
			}
			if(flag)
				{System.out.println("yes");}else
			{System.out.println("NO");}
}}
