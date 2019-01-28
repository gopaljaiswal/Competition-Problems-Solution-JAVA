import java.util.Scanner;
public class Sherlock_and_Pairs {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			int[] a=new int[N];
			for(int j=0;j<N;j++){
				a[j]=in.nextInt();
			}
			equal_indices(a);
		}
	}
	
	public static void equal_indices(int[] a){
		long m=0;
			int i=0,j=0;
			while(i<a.length-1){
				j=i+1;
				if(a[i]==a[j]){
					m=m+2;
				}
				i++;
			}
		System.out.println(m);
	}
}
