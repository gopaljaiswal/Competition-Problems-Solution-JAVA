import java.util.Scanner;
public class Sherlock_and_Square {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int a=in.nextInt();
			int b=in.nextInt();
			squre_no(a,b);
		}
	}
	public static void squre_no(int a,int b){
		int p=0;
		p=(int)(Math.floor(Math.sqrt(b))-Math.ceil(Math.sqrt(a))+1);
		System.out.println(p);
	}
}