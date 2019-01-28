import java.util.Scanner;
public class Sherlock_Divisors {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			get_no(N);
		}
	}
	public static void get_no(int N){
		int count=0;
		if(N%2!=0){
			System.out.println(count);
		}else{
			int i=N;
			while(i>=2){
				if(i%2!=0){
					break;
				}
				count++;
				i/=2;
			}
		System.out.println(count);
		}
	}
}
