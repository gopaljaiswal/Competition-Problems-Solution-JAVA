import java.util.*;
public class Lazy_Jem {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			int B=in.nextInt();
			int M=in.nextInt();
			result(N,B,M);
		}
		in.close();
	}
	
	public static void result(int N,int B,int M){
		long sum=0;
		long i=M;
		while(N>0){
			if(N%2==0){
				int p=N/2;
				sum=sum+((i*p)+B);
				N=N-p;
			//	System.out.println((i*p));
			}else if((N%2)!=0){
				int p=(N+1)/2;
		//		System.out.println((i*p));
				sum=sum+((i*p)+B);
				N=N-p;
			}
			i=i*2;
		}
		System.out.println((sum-B));
	}
}