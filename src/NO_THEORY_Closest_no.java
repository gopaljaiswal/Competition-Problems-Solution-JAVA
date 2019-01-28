import java.util.Scanner;
public class NO_THEORY_Closest_no {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int a=in.nextInt();
			int b=in.nextInt();
			int x=in.nextInt();
			get_close(a,b,x);
		}
	}

	public static void get_close(int a,int b,int x){
		long M=1L;
		if(b<0 && a!=1){
			System.out.println("0");
		}else{
		for(int i=0;i<b;i++){
			M*=a;
		}
		int S=(int) (M%x);
		if(S>(int)x/2){
			M=M+(x-S);
		}else{
			M=M-S;
		}
		System.out.println(M);}
	}
}
