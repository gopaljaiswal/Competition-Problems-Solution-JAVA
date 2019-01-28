import java.util.Scanner;
public class Chef_and_the_stones {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			long n1=in.nextInt();
			long n2=in.nextInt();
			int m=in.nextInt();
			get_sum(n1,n2,m);
		}
		in.close();
	}
//////////////////////////////////////////////////////////////////////////////////////////////	
	public static void get_sum(long n1,long n2,int m){
		long sum=0;
		long i=(n1-m)<(n2-m)?(n1-m):(n2-m);
		if(i==0){
			sum=(n1-m)+(n2-m);
		}else{
			
		}
		
		System.out.println(sum);
	}
}
///////////////////////////////////////////////////////////////////////////////////////////////