import java.util.Scanner; 
public class Base_conversion {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		convert(N,2);
		System.out.println();
		convert(N,8);
		System.out.println();
		convert(N,16);
	}

	public static void convert(int N,int base){
		int rem=N%base;
		if(N==0){
			return;
		}
		convert(N/base,base);
		if(rem<10){
			System.out.print(rem);
		}else{
			System.out.printf("%c",(rem-10)+(int)'A');
		}
	}
}
