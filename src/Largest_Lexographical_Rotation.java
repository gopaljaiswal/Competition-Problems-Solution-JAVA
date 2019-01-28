import java.util.Scanner;
public class Largest_Lexographical_Rotation {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);		
		String str=in.next();
		int l=0;
		char ch=str.charAt(0);
		for(int i=1;i<str.length();i++){
			if(str.charAt(i)>ch){
				ch=str.charAt(i);
				l=i;
			}
		}
			
		String str1=(String) str.subSequence(l,str.length());
		String str2=(String) str.subSequence(0,l);
		String str3=str1.concat(str2);
	    System.out.println(str3);
		}
	}


