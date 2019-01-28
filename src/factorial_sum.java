import java.util.Scanner;
public class factorial_sum {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int a=0,b=1;
		//System.out.print(a+" ");
		//System.out.print(b+" ");
		long sum=a+b;
		for(int i=0;i<N-2;i++){
			int c=a+b;
			sum+=c;
			//System.out.print(c+" ");
			a=b;
			b=c;
		}
		System.out.print(sum);
	}

}
