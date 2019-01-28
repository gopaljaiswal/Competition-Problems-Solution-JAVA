import java.util.Scanner;
public class New_Fibbonacci {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
		int A=in.nextInt();
		int B=in.nextInt();
		int C=in.nextInt();
		int N=in.nextInt();
		get_fibbo(A,B,C,N);}
	}
//////////////////////////////////////////////////////////////////////////////////////
	
	public static void get_fibbo(int A,int B,int C,int N){
		if(N==0){
			System.out.println('0');
		}else if(N==1){
			System.out.println('1');
		}else if(N==2){
			System.out.println('1');
		}else{
			int[] F=new int[N+1];
			F[0]=0;
			F[1]=1;
			F[2]=1;
			for(int i=3;i<=N;i++){
			F[i]=((mul(F[i-1],A))%1000000007+(mul(F[i-2],B))%1000000007+(mul(F[i-3],C))%1000000007)%1000000007;
			System.out.println(F[i]+" "+F[i-1]+"  "+F[i-2]+"  "+F[i-3]);
		}
		System.out.println(F[N]%1000000007);
		}}
	public static int mul(int x, int y)
	{
	   if(y==0)
	     return 0;
	   if(y > 0 )
	     return x+(mul(x, y-1)%1000000007);
	return x;
	}
}