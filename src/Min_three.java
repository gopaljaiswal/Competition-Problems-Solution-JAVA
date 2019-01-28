import java.util.Scanner;
public class Min_three {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		System.out.println(min(a,b,c));
	}
	public static int min(int a,int b,int c){
		if(a<b){
			return (a<c)?a:c;
		}else{
			return (b<c)?b:c;
		}
	}
}
