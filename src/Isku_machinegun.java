import java.util.Scanner;
public class Isku_machinegun {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		long[] a=new long[N];
		for(int i=0;i<N;i++){
		 a[i]=in.nextInt();
			}
		display(a);
	}
	public static void display(long[] a){
		long j=1L;
		long[] num=new long[a.length];  
		for(int i=0;i<a.length;i++){
			num[i]=j++;
		}
		for(int k=0;k<a.length;k++){
			long t=a[k];
			for(int i=0;i<a.length;i++){
				if(t==num[i]){
					System.out.printf(i+1+"  ");
				}
				num[i]+=1;
			}
			
		}
	}
}
