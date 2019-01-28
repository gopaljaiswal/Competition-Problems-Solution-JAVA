import java.util.Scanner;
public class Alien_language {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			String str1=in.next();
			String str2=in.next();
			get_op(str1,str2);
		}
	}
public static void get_op(String str1,String str2){
		boolean flag=false;
		for(int i=0,j=str2.length();j<str1.length()+1;i++,j++){
			String str3=str1.substring(i,j);
			if(str2.equals(str3)){
				flag=true;
				break;
			}
		}
		if(flag==true){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
