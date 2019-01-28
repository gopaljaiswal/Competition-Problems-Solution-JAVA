import java.util.Scanner;
public class Sum_product {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int A=in.nextInt();
			get(A);
		}
	}

	public static void get(int A){
		long sum=0;
		for(int i=1;i<=A;i++){
			sum+=i*Math.abs(A/i);
		}
		sum=sum%1000000007;
	System.out.println(sum);
	}
}
