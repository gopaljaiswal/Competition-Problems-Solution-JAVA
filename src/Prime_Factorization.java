import java.util.Scanner;
public class Prime_Factorization {
	static long sum=0;
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=in.nextInt();
			get_prime_sum(A[i]);
		}
		System.out.println(sum);
	}

	public static void get_prime_sum(int N){
		   while (N%2 == 0)
		    {
		      // System.out.println(2);
		        sum+=2;
		    	N = N/2;
		    }
		    for (int i = 3; i <=(int)Math.sqrt(N); i = i+2)
		    {
		        while (N%i == 0)
		        {
		        	sum+=i;
		        //System.out.println(i);
		            N = N/i;
		        }
		    }
		    if (N > 2)
		    	sum+=N;
		    // System.out.println(n);
		}
}
