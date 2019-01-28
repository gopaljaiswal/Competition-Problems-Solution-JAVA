import java.util.*;
public class Four_Square {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			get_no(N);
		}
		in.close();
	}
	
	public static void get_no(int N){
		if(isPrime(N)){
			long res=8*(N+1);
			System.out.println(res);
		}
		////////////////////////////////////////////////////////////////
		else if((N%2)==0){
			long sum=0;
			for(int i=1;i<=N;i++){
				if((N%i==0)&&((i%2)!=0)){
					sum+=i;
				}
			}
			long res=24*sum;
			System.out.println(res);
		}
		////////////////////////////////////////////////////////////////
		else if(N%2!=0){
			long sum=0;
			for(int i=1;i<=N;i++){
				if(N%i==0){
					sum+=i;
				}
			}
			long res=8*sum;
			System.out.println(res);
		}
		
	}
	
	public static boolean isPrime(int N){
		boolean flag=true;
		if(N==1){
			flag=false;
		}else{
		for(int i=2;i<=N/2;i++){
			if(N%i==0){
				flag=false;
				break;
			}
		}}
		return flag;
	}
}