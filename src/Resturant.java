import java.util.Scanner;
public class Resturant {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int l=in.nextInt();
			int b=in.nextInt();
			max_square(l,b);
		}
	}

	public static void max_square(int l,int b){
		int p=get_gcd(l,b);
		System.out.println((l/p)*(b/p));
		
	}
	
	public static int get_gcd(int num1,int num2){
		if(num2==0){
			return num1;
		}
		return get_gcd(num2,num1%num2);
	}
}
