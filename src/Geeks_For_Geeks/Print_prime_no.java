package Geeks_For_Geeks;

import java.util.Scanner;
/*Sieve of Eratosthenes
Given a number n, print all primes smaller than or equal to n. It is also given that n is a small number.
For example, if n is 10, the output should be “2, 3, 5, 7″. If n is 20, the output should be “2, 3, 5, 7, 11, 13, 17, 19″.

The sieve of Eratosthenes is one of the most efficient ways to find all primes smaller than n when n is smaller than 10 million*/
public class Print_prime_no {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		print_prime(N);
		in.close();
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public static void print_prime(int N){
		boolean[] prime=new boolean[N+1];
		for(int p=2;p*p<=N;p++){
			if(prime[p]==false){
				for(int i=p*2;i<=N;i+=p){
					prime[i]=true;
				}
			}
		}
		for(int p=2;p<=N;p++){
			if(prime[p]==false){
				System.out.print(p+" ");
			}
		}
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////