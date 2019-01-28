import java.util.Scanner;
import java.math.*;
public class FizzBuzz {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		for(int i=0;i<N;i++){
			int a=in.nextInt();
			division(a);
		}
	} 
	public static void division(int a){
		for(int i=1;i<=a;i++){
			if(i%3==0 && i%5==0){
				System.out.println("FizzBuzz");
			}else if(i%3==0){
				System.out.println("Fizz");
			}else if(i%5==0){
				System.out.println("Buzz");
			}else{
				System.out.println(i);
			}
		}
	}
}
