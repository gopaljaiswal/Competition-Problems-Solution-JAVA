import java.util.*;
public class CamelCase {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String str=in.next();
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)<97){
				count++;
			}
		}
		System.out.println(count);
	}
}
