import java.util.Scanner;
public class concatination_string {
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			System.out.println("enter a string");
			String str=in.next();
			String str1=" ",str2=" ";
			for(int i=0;i<str.length();i++){
					str1=str.substring(0,i);
					str2=str.substring(i+1,str.length());
			System.out.println(str1+str2);
			}}
}