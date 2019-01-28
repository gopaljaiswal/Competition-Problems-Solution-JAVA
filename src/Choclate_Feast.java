import java.util.Scanner;
public class Choclate_Feast {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		int N=0,M=0,C=0;
		for(int i=0;i<T;i++){
			 N=in.nextInt();
			 C=in.nextInt();
			 M=in.nextInt();
		total_choclate(N,C,M);
		}
	}

		public static void total_choclate(int N,int C,int M){
			int no=(int)N/C;
			if(no<M){
				System.out.println(no);
			}else{
				System.out.println(no+add_no(no,M));
			}
		}
		
		public static int add_no(int no,int M){
			int t=0;
			int p=no;
			while(p>=M){
			  t++;
				p=(p+1)-M;  
			}
			return t;
		}
}
