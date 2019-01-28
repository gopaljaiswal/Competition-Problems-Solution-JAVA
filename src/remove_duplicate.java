import java.util.Scanner;
import java.util.Arrays;
public class remove_duplicate {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String str=in.next();
		int count=1;
		char[] ch=str.toCharArray();
		Arrays.sort(ch);
		String str1=new String(ch);
		System.out.println(str1);
		for(int i=0;i<str1.length()-1;i++){
			char ch1=str1.charAt(i);
			char ch2=str1.charAt(i+1);
			if(ch1!=ch2){
				count++;
			}
		}
		System.out.println(count);
	}

}
