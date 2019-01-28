import java.util.Scanner;
public class fibbonic_series {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int l=in.nextInt();
		int a=0,b=1,c;
		System.out.println("0"+"\n"+"1");
		for(int i=0;i<l;i++){
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}

}
