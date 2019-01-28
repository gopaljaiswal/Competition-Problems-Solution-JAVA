import java.util.Scanner;
public class Finding_no {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			long Z=in.nextLong();
			long M=in.nextLong();
			long N=in.nextLong();
			get_no(Z,M,N);
		}
		in.close();
	}
	public static void get_no(long Z,long M,long N){
		int ans=0;
		int number1,sqrt_val;
		long number2;
		sqrt_val=(int)Math.sqrt(Z);
		for(number1=1;number1<=sqrt_val;number1++){
			number2=Z/number1;
			if((number1*number2)==Z){
				if(number2<=N){
					ans++;
				}
				if(number2<=M && number1!=number2){
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}