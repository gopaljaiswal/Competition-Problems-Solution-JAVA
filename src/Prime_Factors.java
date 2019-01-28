import java.util.HashSet;
import java.util.Set;


public class Prime_Factors {
	public static void main(String args[]){
		//int N=9;
		Set<Integer> s=Prime_Factor(20);
		System.out.println(s);
	}
	/*public static void primeFactors(int n)
	{
	    // Print the number of 2s that divide n
	    while (n%2 == 0)
	    {
	        System.out.printf("%d ", 2);
	        n = n/2;
	    }
	 
	    // n must be odd at this point.  So we can skip one element (Note i = i +2)
	    for (int i = 3; i <= Math.sqrt(n); i = i+2)
	    {
	        // While i divides n, print i and divide n
	        while (n%i == 0)
	        {
	            System.out.printf("%d ", i);
	            n = n/i;
	        }
	    }
	 
	    // This condition is to handle the case whien n is a prime number
	    // greater than 2
	    if (n > 2)
	        System.out.printf ("%d ", n);
	}*/
	
	/*private static Set<Integer> primeFactors(int i) {
		// TODO Auto-generated method stub
		return null;
	}*/

	public static Set<Integer> Prime_Factor(int N){
		Set<Integer> s1=new HashSet<Integer>();
		int i=N;
		int b=2;
		while(i%2==0){
			s1.add(b);
			i=i/2;
		}
		//System.out.println(s1);
		for(int j=3;j<(int)Math.sqrt(i);j+=2){
			while(i%j==0){
				s1.add(j);
				i=i/j;
			}
		}
		//System.out.println(s1);
		if(i>2){
			s1.add(i);
		}
		//s1.add(2);
		return s1;
	}
}
