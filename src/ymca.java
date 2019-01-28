import java.util.Scanner;
public class ymca {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int n=in.nextInt();
			long p=in.nextLong();
			long[] pp=new long[n];
			for(int j=0;j<n;j++){
				pp[j]=in.nextLong();
				}
				check(pp,p);
		}
	}
	static void check(long[] pp,long p){
		long sum=0;
		boolean flag=false;
			for(int j=1;j<pp.length;j++){
				pp[j-1]+=pp[j];
				if(pp[j]==p){
				flag=true;
				break;
				}				
			}
		if(flag){
			System.out.println("YES");}else{
		System.out.println("NO");}
	} 

}
