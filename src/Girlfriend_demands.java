import java.util.Scanner;
public class Girlfriend_demands {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String str=in.next();
		int l=str.length();
		int T=in.nextInt();
		long A=0L,B=0L;
		for(int i=0;i<T;i++){
			A=in.nextLong();
			B=in.nextLong();
		A=(A-1)%l;
		B=(B-1)%l;
		//System.out.println(A);
		//System.out.println(B);
		char a=str.charAt((int)(A));
		char b=str.charAt((int)(B));
		if(a==b){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		}
	}
}