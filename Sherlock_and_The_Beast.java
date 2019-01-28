import java.util.Scanner;
public class Sherlock_and_The_Beast {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			System.out.println();
			get_out(N);
		}
		in.close();
	}
//////////////////////////////////////////////////////////////////////
	public static void get_out(int N){
		int i=N;
		while(i%3!=0){
			i-=5;
		}
		if(i<0){
			System.out.print("-1");
		}else{
			for(int j=0;j<i;j++)
			{System.out.print('5');}
			for(int j=0;j<(N-i);j++)
			{System.out.print('3');}
		}
	}
}
//////////////////////////////////////////////////////////////////////