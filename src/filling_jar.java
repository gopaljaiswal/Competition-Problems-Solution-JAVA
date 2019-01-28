import java.util.Scanner;
public class filling_jar {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int M=in.nextInt();
		int[] l=new int[M];
		for(int i=0;i<M;i++){
			 int a=in.nextInt();
		     int b=in.nextInt();
		     int k=in.nextInt();
		   	 l[i]=result(a,b,k);
		}
		long sum=0;
		for(int j=0;j<M;j++){
			sum+=l[j];
		}
		sum=(long)sum/N;
		System.out.println(sum);
	}
	public static int result(int a,int b,int k){
		int m=0;
		for(int i=a;i<=b;i++){
			m+=k;
		}
		return m;
	}

}
