import java.util.Scanner;
public class Pallidrome_index {
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			int t=in.nextInt();
			boolean flag;
			String str1=" ",str2=" ";
			for(int i=0;i<t;i++){
				String str=in.next();
				
				for(int j=0;j<str.length();j++){
					str1=str.substring(0,j);
					str2=str.substring(j+1,str.length());
			       flag=check_pallidrome(str1+str2);
			       if(flag==true){
			    	   System.out.println(j);
			    	   break;
				}}
				}
			}
			 static boolean check_pallidrome(String str){
			if(str==null || str.length()==0)
					throw new IllegalArgumentException("Not a vallid string");
				return ((str.charAt(0)==str.length()-1) && (str.length()<4 || check_pallidrome(str.substring(1,str.length()-1))));
				}
}