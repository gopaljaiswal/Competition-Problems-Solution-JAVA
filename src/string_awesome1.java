import java.util.Arrays;
import java.util.Scanner;
public class string_awesome1 {
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			String str=in.next();
			int t=in.nextInt();
			for(int i=0;i<t;i++){
				int L=in.nextInt();
				int R=in.nextInt();
				awesome_string(L,R,str);
			}
		}
		static void awesome_string(int L,int R,String str){
			String str1=" ";
			int count=0;
			int j;
			int i=L;
			
			/*for(j=L+9;j<R;j++){
					count++;}*/
			System.out.println(count);
		}
}
