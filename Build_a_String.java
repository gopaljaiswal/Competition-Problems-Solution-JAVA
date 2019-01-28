import java.util.Scanner;
public class Build_a_String {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			int A=in.nextInt();
			int B=in.nextInt();
			String str=in.next();
			get(N,A,B,str);
		}
		in.close();
	}
	public static void get(int N,int A,int B,String str){
		int M=A;
		String str1="";
		str1+=str.charAt(0);
		for(int i=1;i<str.length();i++){
			
			for(int j=0;j<str.length();j++){
			
			}
		}
	}
}
