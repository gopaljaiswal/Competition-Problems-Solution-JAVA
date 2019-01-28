import java.util.Scanner;
import java.util.Stack;
public class Super_Reduced_String {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String str=in.next();
		StringBuffer sb=new StringBuffer(str);
		StringBuffer sb1=new StringBuffer();
		int i=1;
		sb1=sb;
		while(i<sb1.length()){
			if(sb1.charAt(i)==sb1.charAt(i-1)){
				sb1.delete(i-1, i+1);
				i=1;
			}else{
			i++;}
		}
		if(sb.length()!=0){
			System.out.println(sb);
		}else if(sb.length()==0){
			System.out.println("Empty String");
		}
		in.close();
	}
}

























	/*public static String removeDuplicate(String s) {
	    StringBuilder builder = new StringBuilder();
	    char lastchar = '\0';
	    for (int i = 0; i < s.length(); i++) {
	        String str = builder.toString();
	        if (!str.equals("") && (str.charAt(str.length() - 1) == s.charAt(i))) {
	            builder.deleteCharAt(str.length() - 1);
	        } else if (s.charAt(i) != lastchar)
	            builder.append(s.charAt(i));
	        lastchar = s.charAt(i);
	    }
	    return builder.toString();
	}*/
	
	/*public static String removeDuplicate(String s) {
		StringBuilder builder = new StringBuilder();
		char lastchar = '\0';
		for (int i = 0; i < s.length(); i++) {
		  String str = builder.toString();
		  if (!str.equals("")
		      && (str.charAt(str.length() - 1) == s.charAt(i))) {
		    builder.deleteCharAt(str.length() - 1);
		  } else if (s.charAt(i) != lastchar)
		    builder.append(s.charAt(i));
		  lastchar = s.charAt(i);
		}
		return builder.toString();
		}*/
