import java.util.Scanner;
public class Mars_Exploration {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String str=in.next();
		char s1='S';
		char s2='O';
		int N=0;
		for(int i=0;i<str.length();i+=3){
			if(str.charAt(i+2)!=s1){
				N++;
			}
			if(str.charAt(i+1)!=s2){
				N++;
			}
			if(str.charAt(i)!=s1){
				N++;
			}
		}
		System.out.println(N);
	}
}
