import java.util.Scanner;
public class Prime_List {
	static long sum=0;
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		primeFactors(N);
		System.out.print(sum);
	}
public static void primeFactors(int n)
{
    while (n%2 == 0)
    {
      // System.out.println(2);
        sum+=2;
    	n = n/2;
    }
    for (int i = 3; i <=(int)Math.sqrt(n); i = i+2)
    {
        while (n%i == 0)
        {
        	sum+=i;
        //System.out.println(i);
            n = n/i;
        }
    }
    if (n > 2)
    	sum+=n;
    // System.out.println(n);
}
} 
