import java.util.Scanner;
public class Dipu_interesting_no {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			long L=in.nextLong();
			long R=in.nextLong();
			get_result(L,R);
		}
	}

	public static void get_result(long L,long R){
		boolean flag=false;
		long m=0;
		for(long i=L;i<=R;i++){
			long p=0;
			for(long j=1;j<=i;j++){
				if(i%j==0){
					p++;
				}
			}
			//System.out.print(p);
			if(p%2!=0){
				m++;
			}
		}
		System.out.print(m);
	}	
}
