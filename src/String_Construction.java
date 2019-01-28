import java.util.*;
public class String_Construction {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++){
			String str=in.next();
			get_count(str);
		}
		in.close();
	}
	
	public static void get_count(String str){
		Set set=new HashSet();
		
		for(int i=0;i<str.length();i++){
			set.add(str.charAt(i));
		}
		int len=set.size();
		System.out.println(len);
		}
}
