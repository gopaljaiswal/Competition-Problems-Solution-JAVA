//program to check validity of expression containing nested parenthesis
import java.util.Scanner;
public class Check_vallid_Expression {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String str=in.next();
		int p=0,q=0,r=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='[')
				p++;
			if(str.charAt(i)=='{')
				q++;
			if(str.charAt(i)=='(')
				r++;
			if(str.charAt(i)==']')
				p--;
			if(str.charAt(i)=='}')
				q--;
			if(str.charAt(i)==')')
				r--;
		}
		if(p==0 && q==0 && r==0){
			System.out.println("Vallid");
		}else{
			System.out.println("InVallid");
		}
	}

}
