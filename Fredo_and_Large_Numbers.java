import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Fredo_and_Large_Numbers {
	public static void main(String[] args){
		/*Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		long[] A=new long[N];
		String str="";
		for(int i=0;i<N;i++){
			A[i]=in.nextLong();
			str=str+A[i];
		}
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			int value=in.nextInt();
			long f=in.nextLong();
			if(value==1){
				result1(str,f);
				
			}else if(value==0){
				result(str,f);
			}
			
		}
		in.close();
	}
	
	public static void result(String str,long f){
		boolean flag=false;
		for(int i=0;i<str.length();i++){
			char p=str.charAt(i);
			String str1="";
			str1=str1+p;
			if(Pattern.matches("[str1]{f,}",str)){
				flag=true;
				System.out.println(p);
				break;			
			}
		}
		if(flag==false){
			System.out.println("0");
		}
	}
	
	public static void result1(String str,long f){
		boolean flag=false;
		for(int i=0;i<str.length();i++){
			char p=str.charAt(i);
			String str1="";
			str1=str1+p;
			if(Pattern.matches("[str1]{f}",str)){
				flag=true;
				System.out.println(p);
				break;			
			}
		}
		if(flag==false){
			System.out.println("0");
		}*/
			
		String str="qbcdabab";
		//String str1="";
		//char p=str.charAt(1);
		//str1=str1+p;
		//System.out.println(Pattern.matches("[p]{2,}","qbcdabab"));
		//char p=str.charAt(2);
		//System.out.println(p);
		Pattern p=Pattern.compile("[b]{2,}");
		Matcher m=p.matcher("qbcdabab");
	//	System.out.println(m.matches());
		//Pattern p1 = Pattern.compile(".s");//. represents single character  
		//Matcher m1 = p.matcher("as");  
		//boolean b = m.matches();  
		System.out.println(Pattern.matches("[a]{3,}", "baaa"));
		
	}
}