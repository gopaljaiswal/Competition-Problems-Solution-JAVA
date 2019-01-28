import java.util.Arrays;
import java.util.Scanner;
public class dist_char_subseq {
		public static void main(String[] args){
			Scanner in=new Scanner(System.in);
			int t=in.nextInt();
			for(int i=0;i<t;i++){
				String str=in.next();
				//System.out.println(str.length());
				System.out.println(count(str));
			}
		}
		static int count(String str){
			int count1=1;
			char[] ch=str.toCharArray();
			Arrays.sort(ch);
			String str1=new String(ch);
			//System.out.println(str1);
			for(int i=0;i<str1.length()-1;i++){
				char ch1=str1.charAt(i);
				char ch2=str1.charAt(i+1);
				if(ch1!=ch2){
					count1++;
				}
			}
			//System.out.println(count);
			return count1;
		}
}
