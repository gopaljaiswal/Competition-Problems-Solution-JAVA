import java.util.Scanner;
public class And_And_Subset {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			long L=in.nextInt();
			long R=in.nextInt();
			get_and(L,R);
		}
	}
	
	public static void get_and(long L,long R){
		long sum=L;
		for(long i=L;i<=R;i++){
			for(long j=i;j<=R;j++){
			if((i&j)!=0){
				sum&=(i&j);
			}
			break;
		}}
		System.out.println(sum);
	}
}
