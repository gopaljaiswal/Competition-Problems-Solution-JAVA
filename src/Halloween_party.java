import java.util.Scanner;
public class Halloween_party {
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			int T=in.nextInt();
			for(int i=0;i<T;i++){
				int a=in.nextInt();
				result(a);
			}
		}
		public static void result(int a){
			long mul=0;
			if(a%2==0){
				mul=(int)a/2*(int)a/2;
			}else{
				int a1=(int)a/2+1;
				int a2=(int)a/2;
				mul=a1*a2;
				//System.out.println(a/2+1);
			}
			System.out.println(mul);
		}
}
