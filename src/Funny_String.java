import java.util.Scanner;
public class Funny_String {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		for(int i=0;i<N;i++){
			String str=in.next();
			Fstr(str);
		}
	}
	public static void Fstr(String str){
		int a = 0,b = 0;
		boolean flag=true;
		String str1=str;
		String str2="";
	    int length=str.length();
	      for(int i=length-1;i>=0;i--)
	      {  
	    	  str2=str2+str.charAt(i);
	      }
	      for(int i=1;i<str1.length();i++){
	    	  a=str1.charAt(i)-str1.charAt(i-1);
	    	  a=Math.abs(a);
	    	  b=str2.charAt(i)-str2.charAt(i-1);
	    	  b=Math.abs(b);
	    	  if(a!=b){
	    		  flag=false;
	    		  break;
	    	  }
	      }
	      if(flag==true){
	    	  System.out.println("Funny");
	      }else if(flag==false){
	    	  System.out.println("Not Funny");
	      }
	}
}
