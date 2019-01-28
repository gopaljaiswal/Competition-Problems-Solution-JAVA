import java.util.Scanner;
public class character_sum {
		public static void main(String[] args){
				Scanner in=new Scanner(System.in);
				int t=in.nextInt();
				for(int i=0;i<t;i++){
				String str=in.next();
				int sum=0;
				for(int j=0;j<str.length();j++){
				sum+=str.charAt(j);}
				System.out.println(sum);}
		}
}
