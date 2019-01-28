import java.util.Scanner;
public class Panda_Chain_Reaction {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			long K=in.nextLong();
			long X=in.nextLong();
			get_chain(K,X);
		}
	}
	public static void get_chain(long K,long X){
		for(long i=1;i<=K;i++){
			long sum=0L;
			sum=i*(X%1000006);
			X=sum%1000006;
		}
		System.out.println(X);
	}

}
