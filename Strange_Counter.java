import java.util.*;
/*public class Strange_Counter {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		long N=in.nextLong();
		long N1=N;
		
		int l=3;
		//int past=0;
		while(l<N1){
			N1=N1-l;
			l=(l*2);
		}
		System.out.println(l-N1+1);
	}
}*/

import java.util.Scanner;

public class Strange_Counter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        long t = in.nextLong();
        long n = 2;
        
        while(3*(n-1)<t){ 
        	n = 2 * n;
        }
        System.out.println((3 * (n - 1) - t + 1));
    }
}