import java.util.Scanner;
public class Count_Carry_Problem {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		for(int i=0;i<N;i++){
			long A=in.nextInt();
			long B=in.nextInt();
			get_sum_digit(A,B);
		}
	}
	public static void get_sum_digit(long A,long B){
		int sum=0;
		while(A>0 && B>0){
			long a=A%10;
			long b=B%10;
			if((a+b)>=10){
				sum++;
			}
			A=A/10;
			B=B/10;
		}
		if(sum<1){
			System.out.println("No carry operation");
		}else if(sum==1){
			System.out.println(sum+" "+"carry operation");
		}else{
			System.out.println(sum+" "+"carry operations");
		}
	}

}
