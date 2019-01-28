import java.util.Scanner;
public class Rotate_String {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			String str=in.next();
			get_rotate(str);
		}
	}
	public static void get_rotate(String str){
		for(int i=1;i<str.length();i++){
			String str1=str.substring(i,str.length());
			System.out.print(str1+str.substring(0,i)+" ");
		}
		System.out.println(str);
	}

}
