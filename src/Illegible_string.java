import java.util.Scanner;
public class Illegible_string {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		String str=in.next();
		int v=0,w=0;
		for(int p=0;p<str.length();p++){
			if(str.charAt(p)=='v'){
				v++;
			} else if(str.charAt(p)=='w'){
				w++;
			}
		}
	int max=N+w;
	int min=N+v%2-(int)v/2;
	System.out.println(min+" "+max);
	}
}
